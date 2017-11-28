package httpwrapper.user.http_wrapper.HttpRequests.ApiMethods;

import httpwrapper.user.http_wrapper.HttpRequests.Callbacks.ResponseExpectant;
import httpwrapper.user.http_wrapper.HttpRequests.HttpInterface.HttpInterface;
import httpwrapper.user.http_wrapper.HttpRequests.MappedObjects.UserInfoObject;

/**
 * Created by user on 26.11.2017.
 */

public final class UserDataMethod
        extends ApiMethod
        implements ResponseExpectant<String>
{

    public UserDataMethod(ResponseExpectant<UserInfoObject> callback) {
        super(callback);
    }


    public void requestByUid(String uid) {
        HttpInterface http = getHttpClientInstance(getUrlManager().getUserDataByIdUrl());
        http.setGetArg("uid", uid);
        http.setGetArg("al", "921");
        http.getAsynchronousResponse(this);
    }


    @Override
    public void onResponseReceived(String data) {
        UserInfoObject object = getMapper().map(data, UserInfoObject.class);
        callback.onResponseReceived(object==null ? new UserInfoObject() : object);
    }

}
