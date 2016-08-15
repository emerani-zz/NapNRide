package taketwo.launchathon.andfriends.ezraerani.napandridev2;

import retrofit2.http.Body;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by ezraerani on 8/12/16.
 * Edited by elijahchen on 8/13/16.
 */

public interface APIClient {

//    @GET("{apiData}")
//    retrofit2.Call getData(@Path("apiData") String apiData);

    @PUT("{apiData}")
    retrofit2.Call putData(@Body RouteResponse routeResponse,
                                @Path("apiData") String apiData);

//    @PATCH("{apiData}")
//    retrofit2.Call patchData(@Body RouteResponse routeResponse,
//                                  @Path("apiData") String apiData);

}