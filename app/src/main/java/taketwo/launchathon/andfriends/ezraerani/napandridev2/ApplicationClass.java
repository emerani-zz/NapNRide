package taketwo.launchathon.andfriends.ezraerani.napandridev2;

import android.app.Application;
import android.util.Log;

/**
 * Created by ezraerani on 8/13/16.
 */
public class ApplicationClass extends Application {
    private final String TAG = ApplicationClass.class.getName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");
        DataHandler.getInstance().init(this);
    }
}
