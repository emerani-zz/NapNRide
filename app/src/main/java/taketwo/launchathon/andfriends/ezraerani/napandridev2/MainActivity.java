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

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final int LOCATION_PERMISSION_REQUEST = 1;
    String SAMPLE_DESTINATION = "184 5th Ave New York NY";
    private APIClient restClient;
    private LocationManager locationManager;
    private Location location;
    private boolean isGPSEnabled;
    private boolean isNetworkEnabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Establish instance of location (EC)
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

    }

    private void findOriginLocation() {
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
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 2000, 10, (LocationListener) this);
            location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
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

    private void sendRoute(String origin, String destination, String apiKey) {
    // Readies the data to be sent to GOOGLE MAPS API, locally instantiate origin & get destination from user (EC)
        RouteResponse routeResponse = new RouteResponse(
                origin,
                getUserDestination(SAMPLE_DESTINATION),
                "transit",
                "bus",
                apiKey
        );
        restClient = new RESTClient().getApiClient();
        retrofit2.Call call = restClient.getData(routeResponse, routeResponse.toString());
        call.enqueue(new Callback<RouteResponse>() {
            @Override
            public void onResponse(Call<RouteResponse> call, Response<RouteResponse> response) {
                // Successfully put data, proceed as necessary (EC)
            }
            @Override
            public void onFailure(Call<RouteResponse> call, Throwable t) {
                // Failed to put data, proceed as necessary (EC)
            }
        });
    }

    private String getUserLocation(){
    // Returns latitude & longitude in a string format ready for URL injection (EC)
        String loc =
                location.getLatitude()
                + ","
                + location.getLongitude();
        return loc;
    }

    private String getUserDestination(String destination){
    // Returns EditText value, after parsing all spaces with '+' characters (EC)
        return destination.replaceAll(" ", "+");
    }




}
