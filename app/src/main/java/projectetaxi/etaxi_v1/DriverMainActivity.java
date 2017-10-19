package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class DriverMainActivity extends AppCompatActivity {

    final String TAG = this.getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_main);

        final TextView tvDriName = (TextView) findViewById(R.id.tvDriName);
        final TextView tvDriEmail = (TextView) findViewById(R.id.tvDriEmail);
        final TextView tvDriStatus = (TextView) findViewById(R.id.tvDriStatus);
        final Button btDriHistory = (Button) findViewById(R.id.btDriHistory);
        final Button btAboutUs = (Button) findViewById(R.id.btAboutUs);
        final ImageButton ibDriLogout = (ImageButton) findViewById(R.id.ibDriLogout);
        final ImageButton ibDriSetting = (ImageButton) findViewById(R.id.ibDriSetting);
        final Switch swSriStatus = (Switch) findViewById(R.id.swDriStatus);

        btDriHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent= new Intent(DriverMainActivity.this, ServedHistoryActivity.class);
                DriverMainActivity.this.startActivity(intent);
            }
        });

        btAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent= new Intent(DriverMainActivity.this, AboutUs.class);
                DriverMainActivity.this.startActivity(intent);
            }
        });

        ibDriLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent= new Intent(DriverMainActivity.this, DriverLogoutActivity.class);
                DriverMainActivity.this.startActivity(intent);
            }
        });

        ibDriSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent= new Intent(DriverMainActivity.this, DriverSettingActivity.class);
                DriverMainActivity.this.startActivity(intent);
            }
        });

        //text views haru set garna baki ani swtich ko wala kaam baaki xa
    }

    boolean twice = false;
    @Override
    public void onBackPressed() {

        Log.d(TAG, "********** Click");

        if (twice == true) {

            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            System.exit(0);
        }

        twice = true;

        Log.d(TAG, "********** After Click Before Toast: " + twice);

        Toast.makeText(DriverMainActivity.this, "Press Back Again to EXIT", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                twice = false;
                Log.d(TAG, "********** After Click: " + twice);
            }
        }, 3000);
    }
}
