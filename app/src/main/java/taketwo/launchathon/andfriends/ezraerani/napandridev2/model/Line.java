
package taketwo.launchathon.andfriends.ezraerani.napandridev2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Line {

    @SerializedName("agencies")
    @Expose
    private List<Agency> agencies = new ArrayList<Agency>();
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("text_color")
    @Expose
    private String textColor;
    @SerializedName("vehicle")
    @Expose
    private Vehicle vehicle;

    /**
     * 
     * @return
     *     The agencies
     */
    public List<Agency> getAgencies() {
        return agencies;
    }

    /**
     * 
     * @param agencies
     *     The agencies
     */
    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    /**
     * 
     * @return
     *     The color
     */
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The textColor
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * 
     * @param textColor
     *     The text_color
     */
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /**
     * 
     * @return
     *     The vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * 
     * @param vehicle
     *     The vehicle
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
