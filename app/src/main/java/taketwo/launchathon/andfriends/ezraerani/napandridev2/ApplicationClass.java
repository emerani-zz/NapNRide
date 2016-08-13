package taketwo.launchathon.andfriends.ezraerani.napandridev2;

import android.app.Application;

/**
 * Created by ezraerani on 8/13/16.
 */
public class ApplicationClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataHandler.getInstance().init(this);
    }
}
