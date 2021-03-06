package httpwrapper.user.http_wrapper.HttpRequests.HttpInterface;

import android.os.AsyncTask;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import httpwrapper.user.http_wrapper.HttpRequests.Callbacks.ResponseExpectant;

/**
 * Created by user on 26.11.2017.
 */

public class RetrofitHttpInterface implements  HttpInterface {

    private final ExecutorService executorService = Executors.newCachedThreadPool();
    private String url;

    public RetrofitHttpInterface(String url) {
        this.url = url;
    }

    @Override
    public void setPostArg(String key, String value) {

    }


    @Override
    public void setGetArg(String key, String value) {

    }


    @Override
    public void getAsynchronousResponse(final ResponseExpectant<String> callback) {

        /* use retrofit functionality to create requestById and get JSON by HTTP */

        new AsyncTask<Void, Void, String>(){

            @Override
            protected String doInBackground(Void... voids) {

                /* do some long-time actions */

                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return new String();
            }

            @Override
            protected void onPostExecute(String aVoid) {
                /* pass a result to callback */
                callback.onResponseReceived(aVoid);
            }

        }.executeOnExecutor(executorService);

    }

}
