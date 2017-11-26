package httpwrapper.user.http_wrapper.HttpRequests.ApiMethods;

import org.json.JSONObject;

import httpwrapper.user.http_wrapper.HttpRequests.Callbacks.ResponseExpectant;
import httpwrapper.user.http_wrapper.HttpRequests.HttpInterface.HttpInterface;
import httpwrapper.user.http_wrapper.HttpRequests.MappedObjects.UserInfoObject;

/**
 * Created by user on 26.11.2017.
 */

public class UserDataMethod
        extends ApiMethod
        implements ResponseExpectant<JSONObject>
{

    public UserDataMethod(ResponseExpectant<UserInfoObject> callback) {
        super(callback);
    }


    public void requestByUid(String uid) {
        HttpInterface http = getHttpClientInstance();
        http.setGetArg("uid", uid);
        http.setGetArg("al", "921");
        http.getAsynchronousJsonResponse(this);
    }


    @Override
    public void onResponseReceived(JSONObject data) {
        callback.onResponseReceived(new UserInfoObject());
    }

}
