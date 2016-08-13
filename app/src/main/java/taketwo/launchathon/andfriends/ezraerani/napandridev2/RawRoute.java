package taketwo.launchathon.andfriends.ezraerani.napandridev2;

/**
 * Created by ezraerani on 8/13/16.
 */
public class RawRoute {

    float startLat, startLon, endLat, endLon;

    public RawRoute(float startLat, float startLon, float endLat, float endLon) {
        this.startLat = startLat;
        this.startLon = startLon;
        this.endLat = endLat;
        this.endLon = endLon;
    }

    public float getStartLat() {
        return startLat;
    }

    public float getStartLon() {
        return startLon;
    }

    public float getEndLat() {
        return endLat;
    }

    public float getEndLon() {
        return endLon;
    }
}
