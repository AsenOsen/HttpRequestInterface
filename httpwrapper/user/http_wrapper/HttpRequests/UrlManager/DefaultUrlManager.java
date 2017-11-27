package httpwrapper.user.http_wrapper.HttpRequests.UrlManager;

/**
 * Created by user on 27.11.2017.
 */

public class DefaultUrlManager implements UrlManager {

    private final static String BASE_URL = "http:/8.8.8.8/api/";

    @Override
    public String getProfileInfoByIdUrl() {
        return BASE_URL+"profile_info";
    }

    @Override
    public String getProfileInfoByNameUrl() {
        return getUserDataByIdUrl();
    }

    @Override
    public String getUserDataByIdUrl() {
        return BASE_URL+"user_data";
    }
}
