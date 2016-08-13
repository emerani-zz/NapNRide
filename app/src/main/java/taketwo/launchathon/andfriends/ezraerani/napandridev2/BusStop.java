package taketwo.launchathon.andfriends.ezraerani.napandridev2;

/**
 * Created by ezraerani on 8/13/16.
 */
public class BusStop {

    private float stopLat, stopLon;
    private String stopName;

    public BusStop(float stopLat, float stopLon, String stopName) {
        this.stopLat = stopLat;
        this.stopLon = stopLon;
        this.stopName = stopName;
    }

    public BusStop(float stopLat) {
        this.stopLat = stopLat;
    }

    public float getStopLat() {
        return stopLat;
    }

    public void setStopLat(float stopLat) {
        this.stopLat = stopLat;
    }

    public float getStopLon() {
        return stopLon;
    }

    public void setStopLon(float stopLon) {
        this.stopLon = stopLon;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }
}
