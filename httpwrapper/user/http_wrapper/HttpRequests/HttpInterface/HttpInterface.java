package httpwrapper.user.http_wrapper.HttpRequests.HttpInterface;

import org.json.JSONObject;

import httpwrapper.user.http_wrapper.HttpRequests.Callbacks.ResponseExpectant;

/**
 * Created by user on 25.11.2017.
 */

public interface HttpInterface {

    void setPostArg(String key, String value);
    void setGetArg(String key, String value);
    void getAsynchronousResponse(ResponseExpectant<String> callback);

}
