package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class DriverLoginActivity extends AppCompatActivity {

    ApiToken token = new ApiToken();
    URLRequest myEmail = new URLRequest();
    //protected String apiToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        final EditText etDriverEmail = (EditText) findViewById(R.id.etDriverEmail);
        final EditText etDriverPassword = (EditText) findViewById(R.id.etDriverPassword);

        final Button btDriverLogin = (Button) findViewById(R.id.btDriverLogin);
        final Button btDriverRegister = (Button) findViewById(R.id.btDriverRegister);

        btDriverLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                final String email = etDriverEmail.getText().toString();
                myEmail.driverEmail = email;

                final String password = etDriverPassword.getText().toString();

                final Response.Listener<String> responseListener = new Response.Listener<String>() {


                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            token.setDriverToken(jsonResponse.getString("api_token"));

                            if(success) {

                                Intent intent = new Intent(DriverLoginActivity.this, DriverActivity.class);
                                DriverLoginActivity.this.startActivity(intent);
                                Toast.makeText(getApplicationContext(), token.getDriverToken(),
                                        Toast.LENGTH_SHORT).show();
                            } else {

                                Toast.makeText(getApplicationContext(), "Login Failed, try again",
                                        Toast.LENGTH_SHORT).show();

//                                AlertDialog.Builder builder = new AlertDialog.Builder(DriverRegisterActivity.this);
//                                builder.setMessage("Register Failed")
//                                        .setNegativeButton("Try Again", null)
//                                        .create()
//                                        .show();
                            }
                        } catch (JSONException e) {

                            e.printStackTrace();
                        }
                    }
                };

                DriverLoginRequest request = new DriverLoginRequest(email, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(DriverLoginActivity.this);
                queue.add(request);
            }

        });

        btDriverRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent loginIntent= new Intent(DriverLoginActivity.this, DriverRegisterActivity.class);
                DriverLoginActivity.this.startActivity(loginIntent);
            }
        });
    }
}