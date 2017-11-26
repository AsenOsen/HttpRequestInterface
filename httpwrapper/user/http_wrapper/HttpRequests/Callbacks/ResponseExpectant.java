package httpwrapper.user.http_wrapper.HttpRequests.Callbacks;

/**
 * Created by user on 26.11.2017.
 */

public interface ResponseExpectant<O> {

    void onResponseReceived(O data);

}
