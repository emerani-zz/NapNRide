
package taketwo.launchathon.andfriends.ezraerani.napandridev2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TransitDetails {

    @SerializedName("arrival_stop")
    @Expose
    private ArrivalStop arrivalStop;
    @SerializedName("arrival_time")
    @Expose
    private ArrivalTime_ arrivalTime;
    @SerializedName("departure_stop")
    @Expose
    private DepartureStop departureStop;
    @SerializedName("departure_time")
    @Expose
    private DepartureTime_ departureTime;
    @SerializedName("headsign")
    @Expose
    private String headsign;
    @SerializedName("line")
    @Expose
    private Line line;
    @SerializedName("num_stops")
    @Expose
    private int numStops;

    /**
     * 
     * @return
     *     The arrivalStop
     */
    public ArrivalStop getArrivalStop() {
        return arrivalStop;
    }

    /**
     * 
     * @param arrivalStop
     *     The arrival_stop
     */
    public void setArrivalStop(ArrivalStop arrivalStop) {
        this.arrivalStop = arrivalStop;
    }

    /**
     * 
     * @return
     *     The arrivalTime
     */
    public ArrivalTime_ getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 
     * @param arrivalTime
     *     The arrival_time
     */
    public void setArrivalTime(ArrivalTime_ arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * 
     * @return
     *     The departureStop
     */
    public DepartureStop getDepartureStop() {
        return departureStop;
    }

    /**
     * 
     * @param departureStop
     *     The departure_stop
     */
    public void setDepartureStop(DepartureStop departureStop) {
        this.departureStop = departureStop;
    }

    /**
     * 
     * @return
     *     The departureTime
     */
    public DepartureTime_ getDepartureTime() {
        return departureTime;
    }

    /**
     * 
     * @param departureTime
     *     The departure_time
     */
    public void setDepartureTime(DepartureTime_ departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * 
     * @return
     *     The headsign
     */
    public String getHeadsign() {
        return headsign;
    }

    /**
     * 
     * @param headsign
     *     The headsign
     */
    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    /**
     * 
     * @return
     *     The line
     */
    public Line getLine() {
        return line;
    }

    /**
     * 
     * @param line
     *     The line
     */
    public void setLine(Line line) {
        this.line = line;
    }

    /**
     * 
     * @return
     *     The numStops
     */
    public int getNumStops() {
        return numStops;
    }

    /**
     * 
     * @param numStops
     *     The num_stops
     */
    public void setNumStops(int numStops) {
        this.numStops = numStops;
    }

}
