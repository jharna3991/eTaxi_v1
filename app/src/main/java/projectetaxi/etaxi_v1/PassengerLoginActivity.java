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
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class PassengerLoginActivity extends AppCompatActivity {

    private static String passenToken;
    private static String passenName;
    private static String passenEmail;

    public static String getPassenToken() {
        return passenToken;
    }

    public static void setPassenToken(String passenToken) {
        PassengerLoginActivity.passenToken = passenToken;
    }

    public static String getPassenName() {
        return passenName;
    }

    public static void setPassenName(String passenName) {
        PassengerLoginActivity.passenName = passenName;
    }

    public static String getPassenEmail() {
        return passenEmail;
    }

    public static void setPassenEmail(String passenEmail) {
        PassengerLoginActivity.passenEmail = passenEmail;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_login);

        final EditText etPassengerEmail = (EditText) findViewById(R.id.etPassengerEmail);
        final EditText etPassengerPassword = (EditText) findViewById(R.id.etPassengerPassword);

        final Button btPassengerLogin = (Button) findViewById(R.id.btPassengerLogin);
        final Button btPassengerRegister = (Button) findViewById(R.id.btPassengerRegister);

        btPassengerLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                final String email = etPassengerEmail.getText().toString();

                final String password = etPassengerPassword.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {


                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            passenToken = jsonResponse.getString("api_token");
                            passenName = jsonResponse.getString("name");
                            passenEmail = jsonResponse.getString("email");

                            if(success) {

                                Intent intent = new Intent(PassengerLoginActivity.this, PassengerMainActivity.class);
                                PassengerLoginActivity.this.startActivity(intent);
                                Toast.makeText(getApplicationContext(), jsonResponse.getString("api_token"),
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

                PassengerLoginRequest request = new PassengerLoginRequest(email, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(PassengerLoginActivity.this);
                queue.add(request);
            }

        });


        btPassengerRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent loginIntent= new Intent(PassengerLoginActivity.this, PassengerRegisterActivity.class);
                PassengerLoginActivity.this.startActivity(loginIntent);
            }
        });
    }
}