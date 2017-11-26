package httpwrapper.user.http_wrapper.HttpRequests.ApiMethods;

import httpwrapper.user.http_wrapper.HttpRequests.Callbacks.ResponseExpectant;
import httpwrapper.user.http_wrapper.HttpRequests.HttpInterface.HttpInterface;
import httpwrapper.user.http_wrapper.HttpRequests.HttpInterface.RetrofitHttpInterface;

/**
 * Created by user on 26.11.2017.
 */

public abstract class ApiMethod {

    protected ResponseExpectant callback;


    public ApiMethod(ResponseExpectant callback) {
        this.callback = callback;
    }


    protected HttpInterface getHttpClientInstance()
    {
        return new RetrofitHttpInterface();
    }



}
