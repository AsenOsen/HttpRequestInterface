package httpwrapper.user.http_wrapper.HttpRequests.ApiMethods;

import httpwrapper.user.http_wrapper.HttpRequests.Callbacks.ResponseExpectant;
import httpwrapper.user.http_wrapper.HttpRequests.HttpInterface.HttpInterface;
import httpwrapper.user.http_wrapper.HttpRequests.HttpInterface.RetrofitHttpInterface;
import httpwrapper.user.http_wrapper.HttpRequests.UrlManager.DefaultUrlManager;
import httpwrapper.user.http_wrapper.HttpRequests.UrlManager.UrlManager;

/**
 * Created by user on 26.11.2017.
 */

public abstract class ApiMethod {

    protected ResponseExpectant callback;


    public ApiMethod(ResponseExpectant callback) {
        this.callback = callback;
    }


    protected final HttpInterface getHttpClientInstance(String url)
    {
        return new RetrofitHttpInterface(url);
    }


    protected final UrlManager getUrlManager()
    {
        return new DefaultUrlManager();
    }

}
