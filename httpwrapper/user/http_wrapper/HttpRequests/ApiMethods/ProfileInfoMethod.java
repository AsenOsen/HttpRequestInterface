package httpwrapper.user.http_wrapper.HttpRequests.ApiMethods;


import httpwrapper.user.http_wrapper.HttpRequests.Callbacks.ResponseExpectant;
import httpwrapper.user.http_wrapper.HttpRequests.HttpInterface.HttpInterface;
import httpwrapper.user.http_wrapper.HttpRequests.MappedObjects.ProfileInfoObject;


/**
 * Created by user on 26.11.2017.
 */

public final class ProfileInfoMethod
        extends ApiMethod
        implements ResponseExpectant<String>
{


    public ProfileInfoMethod(ResponseExpectant<ProfileInfoObject> callback)
    {
        super(callback);
    }


    public void requestById(Integer id) {
        HttpInterface http = getHttpClientInstance(getUrlManager().getProfileInfoByIdUrl());
        http.setPostArg("id", id+"");
        http.getAsynchronousResponse(this);
    }


    public void requestByName(String name) {
        HttpInterface http = getHttpClientInstance(getUrlManager().getProfileInfoByNameUrl());
        http.setPostArg("name", name);
        http.getAsynchronousResponse(this);
    }


    @Override
    public void onResponseReceived(String data) {
        ProfileInfoObject object = getMapper().map(data, ProfileInfoObject.class);
        callback.onResponseReceived(object==null ? new ProfileInfoObject() : object);
    }


}
