package taketwo.launchathon.andfriends.ezraerani.napandridev2;

/**
 * Created by ezraerani on 8/12/16.
 */
public class Route {

    private BusLine line;
    private double expectedDuration;

    public Route(BusLine line, double expectedDuration) {
        this.line = line;
        this.expectedDuration = expectedDuration;
    }

    public Route() {
    }

    public BusLine getLine() {
        return line;
    }

    public void setLine(BusLine line) {
        this.line = line;
    }

    public double getExpectedDuration() {
        return expectedDuration;
    }

    public void setExpectedDuration(double expectedDuration) {
        this.expectedDuration = expectedDuration;
    }
}
