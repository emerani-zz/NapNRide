package taketwo.launchathon.andfriends.ezraerani.napandridev2;

import java.util.List;

/**
 * Created by ezraerani on 8/12/16.
 */
public class BusLine {

    private List<BusStop> availableStops;
    private String lineName;

    public BusLine(List<BusStop> availableStops, String lineName) {
        this.availableStops = availableStops;
        this.lineName = lineName;
    }

    public BusLine() {
    }

    public List<BusStop> getAvailableStops() {
        return availableStops;
    }

    public void setAvailableStops(List<BusStop> availableStops) {
        this.availableStops = availableStops;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }
}
