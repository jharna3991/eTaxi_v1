package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

public class PassengerMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_main);

        final TextView tvPassName = (TextView) findViewById(R.id.tvPassName);
        final TextView tvPassEmail = (TextView) findViewById(R.id.tvPassEmail);
        final Button btBookTaxi = (Button) findViewById(R.id.btBookTaxi);
        final Button btPassHistory = (Button) findViewById(R.id.btPassHistory);
        final Button btAboutUs = (Button) findViewById(R.id.btAboutUs);
        final ImageButton ibPassSetting = (ImageButton) findViewById(R.id.ibPassSetting);
        final ImageButton ibPassLogout = (ImageButton) findViewById(R.id.ibPassLogout);



        btBookTaxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent= new Intent(PassengerMainActivity.this, BookingActivity.class);
                PassengerMainActivity.this.startActivity(intent);
            }
        });

        btPassHistory.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                Intent intent= new Intent(PassengerMainActivity.this, BookingHistoryActivity.class);
                PassengerMainActivity.this.startActivity(intent);
            }
        });

        btAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent= new Intent(PassengerMainActivity.this, AboutUs.class);
                PassengerMainActivity.this.startActivity(intent);
            }
        });

        ibPassSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent= new Intent(PassengerMainActivity.this, PassengerSettingActivity.class);
                PassengerMainActivity.this.startActivity(intent);
            }
        });

        ibPassLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent= new Intent(PassengerMainActivity.this, PassengerLogoutActivity.class);
                PassengerMainActivity.this.startActivity(intent);
            }
        });

        //textview name and email set garne kaam baaki xa, tesko lagi, GET request bata Api linu xa...
    }
}
