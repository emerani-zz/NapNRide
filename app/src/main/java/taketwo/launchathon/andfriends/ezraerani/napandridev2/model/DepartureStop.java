
package taketwo.launchathon.andfriends.ezraerani.napandridev2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DepartureStop {

    @SerializedName("location")
    @Expose
    private Location_ location;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The location
     */
    public Location_ getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location_ location) {
        this.location = location;
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

}
