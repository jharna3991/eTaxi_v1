package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class PassengerMainActivity extends AppCompatActivity {

    final String TAG = this.getClass().getName();

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

    boolean twice = false;
    @Override
    public void onBackPressed() {

        PassengerLoginActivity pla = new PassengerLoginActivity();

        //just for testing, nothing personal
        Log.d(TAG, "token " + pla.getPassenToken());

        if (twice == true) {

            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            System.exit(0);
        }

        twice = true;

        Log.d(TAG, "After Click Before Toast" + twice);

        Toast.makeText(PassengerMainActivity.this, "Press Back Again to EXIT", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                twice = false;
                Log.d(TAG, "After Click" + twice);
            }
        }, 3000);
    }
}
