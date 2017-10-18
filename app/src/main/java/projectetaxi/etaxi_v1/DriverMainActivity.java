package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class DriverMainActivity extends AppCompatActivity {

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
}
