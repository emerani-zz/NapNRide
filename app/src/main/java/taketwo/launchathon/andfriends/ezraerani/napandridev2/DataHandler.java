package taketwo.launchathon.andfriends.ezraerani.napandridev2;

import android.content.Context;

/**
 * Created by ezraerani on 8/12/16.
 */
public class DataHandler {

    private final String TAG = DataHandler.class.getName();
    private static DataHandler instance = new DataHandler();
    private Context context;
    private Route selectedRoute = null;
    private BusStop alertStop = null;

    private DataHandler() {
    }

    public static DataHandler getInstance() {
        return instance;
    }

    public void init(Context context) {
        this.context = context.getApplicationContext();
    }

    public void getRoute(RawRoute route) {
        // TODO: 8/13/16 feed RawRoute data to api call
    }

    public void selectAlertStop(int position) {

        if (selectedRoute != null) {
            alertStop = selectedRoute.getLine().getAvailableStops().get(position);
        }

        // TODO: 8/13/16 trigger service with realtime location update against alert stop

    }

    public void clearAll() {
        selectedRoute = null;
        alertStop = null;
    }

    public BusStop getAlertStop() {
        return alertStop;
    }
}
