package taketwo.launchathon.andfriends.ezraerani.napandridev2;

import android.content.Context;
import android.util.Log;

/**
 * Created by ezraerani on 8/12/16.
 */
public class DataHandler {

    private final String TAG = DataHandler.class.getName();
    private final String apiKey = "AIzaSyBjOOCh-o5Xl2Rh3CMLV0si9NGGoDvW-A8";

    private static DataHandler instance = new DataHandler();
    private Context context;
    private Route selectedRoute = null;
    private BusStop selectedAlertStop = null;

    private DataHandler() {}

    public static DataHandler getInstance() {
        return instance;
    }

    public void init(Context context) {
        Log.d(TAG, "init");

        this.context = context.getApplicationContext();
    }

    public void makeRouteCall(RawRoute route) {
        Log.d(TAG, "getRoute");
        // TODO: 8/13/16 feed RawRoute data to api call
    }

    public void selectAlertStop(int position) {
        Log.d(TAG, "selectAlertStop");

        if (selectedRoute != null) {
            Log.d(TAG, "selectedRoute != null");
            selectedAlertStop = selectedRoute.getLine().getAvailableStops().get(position);
        }

        // TODO: 8/13/16 trigger service with realtime location update against selectedAlertStop

    }

    public void clearAllSelections() {
        Log.d(TAG, "clearAll");

        selectedRoute = null;
        selectedAlertStop = null;
    }

    public BusStop getSelectedAlertStop() {
        Log.d(TAG, "getSelectedAlertStop");

        return selectedAlertStop;
    }
}
