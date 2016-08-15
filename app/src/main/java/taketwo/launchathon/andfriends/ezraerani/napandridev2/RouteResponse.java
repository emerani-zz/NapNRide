package taketwo.launchathon.andfriends.ezraerani.napandridev2;

/**
 * Created by ezraerani on 8/12/16.
 * Edited by elijahchen on 8/13/16.
 */

/*
NOTE:
    This object class is a representation of the request parameters that google maps will take as a valid entry.
Certain parameters are required while others are optional. In the URL, all parameters are separated using the
'&' character. The list of parameters and their possible values are shown below. (EC)

SAMPLE REQUEST:
https://maps.googleapis.com/maps/api/directions/json?origin=Brooklyn&destination=Queens&mode=transit&key=YOUR_API_KEY

REQUIRED:
    String origin -  The address, textual latitude/longitude value, or place ID from which you are deriving.
    String destination - The address, textual latitude/longitude value or place ID to which you desire.
    String key - The API key.

    **Under normal circumstances, these would be optional. ELSE empty, defaults to driving directions.**
    String mode - Please provide the current default value as 'transit', which opens up the next value below.
    String transit_mode - Valid values: {"bus", "subway", "train", "tram", "rail"}
 */

public class RouteResponse {

    //REQUIRED
    String origin;
    String destination;
    String mode;
    String transit_mode;
    String key;

    RouteResponse(String ORIGIN, String DESTINATION, String MODE, String TRANSIT_MODE, String KEY) {
        //In this order
        this.origin = ORIGIN; //1
        this.destination = DESTINATION; //2
        this.mode = MODE; //3
        this.transit_mode = TRANSIT_MODE; //4
        this.key = KEY; //5
    }

    @Override
    //'.toString();' method override to print/access the last segment of the URL
    public String toString(){
        return "json?origin=" + origin
                +"&destination=" + destination
                +"&mode=" + mode
                +"&transit_mode=" + transit_mode
                +"&key=" + key;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getMode() {
        return mode;
    }

    public String getTransit_mode() {
        return transit_mode;
    }

    public String getKey() {
        return key;
    }
}
