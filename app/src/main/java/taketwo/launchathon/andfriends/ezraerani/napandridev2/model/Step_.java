
package taketwo.launchathon.andfriends.ezraerani.napandridev2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Step_ {

    @SerializedName("distance")
    @Expose
    private Distance__ distance;
    @SerializedName("duration")
    @Expose
    private Duration__ duration;
    @SerializedName("end_location")
    @Expose
    private EndLocation__ endLocation;
    @SerializedName("polyline")
    @Expose
    private Polyline_ polyline;
    @SerializedName("start_location")
    @Expose
    private StartLocation__ startLocation;
    @SerializedName("travel_mode")
    @Expose
    private String travelMode;

    /**
     * 
     * @return
     *     The distance
     */
    public Distance__ getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    public void setDistance(Distance__ distance) {
        this.distance = distance;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public Duration__ getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(Duration__ duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The endLocation
     */
    public EndLocation__ getEndLocation() {
        return endLocation;
    }

    /**
     * 
     * @param endLocation
     *     The end_location
     */
    public void setEndLocation(EndLocation__ endLocation) {
        this.endLocation = endLocation;
    }

    /**
     * 
     * @return
     *     The polyline
     */
    public Polyline_ getPolyline() {
        return polyline;
    }

    /**
     * 
     * @param polyline
     *     The polyline
     */
    public void setPolyline(Polyline_ polyline) {
        this.polyline = polyline;
    }

    /**
     * 
     * @return
     *     The startLocation
     */
    public StartLocation__ getStartLocation() {
        return startLocation;
    }

    /**
     * 
     * @param startLocation
     *     The start_location
     */
    public void setStartLocation(StartLocation__ startLocation) {
        this.startLocation = startLocation;
    }

    /**
     * 
     * @return
     *     The travelMode
     */
    public String getTravelMode() {
        return travelMode;
    }

    /**
     * 
     * @param travelMode
     *     The travel_mode
     */
    public void setTravelMode(String travelMode) {
        this.travelMode = travelMode;
    }

}
