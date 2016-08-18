package taketwo.launchathon.andfriends.ezraerani.napandridev2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import taketwo.launchathon.andfriends.ezraerani.napandridev2.model.Route;
import taketwo.launchathon.andfriends.ezraerani.napandridev2.model.RouteResponse;

/**
 * Created by ezraerani on 8/12/16.
 */
public class DataHandler {

    public interface OnRouteReceivedListener {
        void routeReceivedSoDoSomething();
    }

    private final String TAG = DataHandler.class.getSimpleName();
    private final String apiKey = "AIzaSyBjOOCh-o5Xl2Rh3CMLV0si9NGGoDvW-A8";
    private final String MODE = "transit";
    private final String TRANSIT_MODE = "transit_mode";

    private static DataHandler instance = new DataHandler();
    private Context context;
    String SAMPLE_DESTINATION = "184 5th Ave New York NY";

    private APIClient apiClient;
    private Location origin;
    private String destination;
    private OnRouteReceivedListener listener;

    private Route selectedRoute = null;

    private DataHandler() {}

    public static DataHandler getInstance() {
        return instance;
    }

    public void init(Context context) {
        Log.d(TAG, "init");

        this.context = context.getApplicationContext();
        apiClient = new RESTClient().getApiClient();

    }

    public void initActivity(Activity activity) {
        Log.d(TAG, "initActivity");
        listener = (OnRouteReceivedListener) activity;
    }

    private void handleResponse(RouteResponse response) {

        Log.d(TAG, "handleResponse");

        Route theRoute = response.getRoutes().get(0);
        selectedRoute = theRoute;
        listener.routeReceivedSoDoSomething();

    }

    public void userSaysGo() {
        Log.d(TAG, "userSaysGo");

        Intent startServiceIntent = new Intent(context.getApplicationContext(), RealTimeLocationChecker.class);
        context.sendBroadcast(startServiceIntent);

    }


    private void callApiForRoute() {
        Log.d(TAG, "callApiForRoute");


        apiClient.getData(getUserOrigin(), getUserDestination(), MODE, TRANSIT_MODE, apiKey)
                .enqueue(new Callback<RouteResponse>() {
            @Override
            public void onResponse(Call<RouteResponse> call, Response<RouteResponse> response) {
                handleResponse(response.body());
                Log.d("callApiForRoute", "onResponse");

            }

            @Override
            public void onFailure(Call<RouteResponse> call, Throwable t) {
                Log.e("onFailure", t.getMessage());
            }
        });

    }

    private String getUserOrigin() {
        Log.d(TAG, "getUserOrigin");

        // Returns latitude & longitude in a string format ready for URL injection (EC)
        String loc =
                origin.getLatitude()
                        + ","
                        + origin.getLongitude();
        return loc;
    }

    private String getUserDestination() {
        Log.d(TAG, "getUserDestination");

        // Returns EditText value, after parsing all spaces with '+' characters (EC)
        return destination.replaceAll(" ", "+");
    }

    public void setDestination(String destination) {
        Log.d(TAG, "setDestination");

        this.destination = destination;
    }

    public void setOrigin(Location origin) {
        Log.d(TAG, "setOrigin");
        this.origin = origin;

        callApiForRoute();
    }
}
