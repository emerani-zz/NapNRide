package taketwo.launchathon.andfriends.ezraerani.napandridev2;

import retrofit2.http.GET;
import retrofit2.http.Query;
import taketwo.launchathon.andfriends.ezraerani.napandridev2.model.RouteResponse;

/**
 * Created by ezraerani on 8/12/16.
 */
public interface APIClient {

    @GET("maps/api/directions/json")
    retrofit2.Call<RouteResponse> getData(@Query("origin") String origin,
                                          @Query("destination") String destination,
                                          @Query("mode") String mode,
                                          @Query("transit_mode") String transit_mode,
                                          @Query("key") String apiKey
    );
}
