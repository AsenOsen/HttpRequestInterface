package httpwrapper.user.http_wrapper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import httpwrapper.user.http_wrapper.HttpRequests.ApiMethods.ProfileInfoMethod;
import httpwrapper.user.http_wrapper.HttpRequests.ApiMethods.UserDataMethod;
import httpwrapper.user.http_wrapper.HttpRequests.Callbacks.ResponseExpectant;
import httpwrapper.user.http_wrapper.HttpRequests.MappedObjects.ProfileInfoObject;
import httpwrapper.user.http_wrapper.HttpRequests.MappedObjects.UserInfoObject;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*  1  */
        new UserDataMethod(new UserInfoReceiver())
                .requestByUid("1000");

        /*  2  */
        ProfileInfoMethod method = new ProfileInfoMethod(new ProfileInfoReceiver());
        method.requestById(1000);
        method.requestByName("username");
    }


    private class UserInfoReceiver implements ResponseExpectant<UserInfoObject>
    {
        @Override
        public void onResponseReceived(UserInfoObject data) {
            Log.i("CallbackResponse", "user data received"+data.getUserStatic());
            Toast.makeText(MainActivity.this, "UserInfo got!", Toast.LENGTH_LONG).show();
        }
    }


    private class ProfileInfoReceiver implements ResponseExpectant<ProfileInfoObject>
    {
        @Override
        public void onResponseReceived(ProfileInfoObject data) {
            Log.i("CallbackResponse", "profile received"+data.getProfileStatic());
            Toast.makeText(MainActivity.this, "ProfileInfo got!", Toast.LENGTH_LONG).show();
        }
    }


}
