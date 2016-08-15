package taketwo.launchathon.andfriends.ezraerani.napandridev2;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements DataHandler.OnRouteReceivedListener, LocationListener {

    private final String TAG = MainActivity.class.getName();

    private static final int LOCATION_PERMISSION_REQUEST = 1;

    private LocationManager locationManager;
    private Location location;
    private boolean isGPSEnabled;
    private boolean isNetworkEnabled;
    DataHandler dataHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataHandler = DataHandler.getInstance();
        dataHandler.initActivity(this);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        findOriginLocation();
    }

    private void findOriginLocation() {
        Log.d(TAG, "findOriginLocation");
        // Prompts user for permission & gets current location (EC)
        isNetworkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        isGPSEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // Prompts user for permission to access their location (EC)
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},
                    LOCATION_PERMISSION_REQUEST);
        }
        if (isGPSEnabled && locationManager != null) {
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 2000, 10, (LocationListener) this);
            location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        } else if (isNetworkEnabled && locationManager != null) {
            Log.d(TAG, "findOrigin ElseIf");
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 2000, 10, (LocationListener) this);
            location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            dataHandler.setLocation(locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER));
        }
    }

    // Checks if permission has been granted (EC)
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch(requestCode) {
            case LOCATION_PERMISSION_REQUEST:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // You have permission, call your method to do location stuff (EC)
                    findOriginLocation();
                }
        }
    }

    @Override
    public void routeReceivedSoDoSomething() {
        Log.d(TAG, "routeReceivedSoDoSomething");
        //update UI
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
