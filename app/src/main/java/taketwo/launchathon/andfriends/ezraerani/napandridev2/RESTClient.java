package taketwo.launchathon.andfriends.ezraerani.napandridev2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ezraerani on 8/12/16.
 */
public class RESTClient {

    public APIClient apiService;

    RESTClient() {
        Gson gson = new GsonBuilder().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://maps.googleapis.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        apiService = retrofit.create(APIClient.class);

    }

    public APIClient getApiClient() {
        return apiService;
    }

}
