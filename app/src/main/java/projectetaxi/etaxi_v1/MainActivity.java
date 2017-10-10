package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton passenger_bt=(ImageButton) findViewById(R.id.passenger_bt);
        ImageButton driver_bt=(ImageButton) findViewById(R.id.driver_bt);

        passenger_bt.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view){
               Intent loginIntent = new Intent(MainActivity.this, PassengerLoginActivity.class);
               MainActivity.this.startActivity(loginIntent);
           }
        });

        driver_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MainActivity.this, DriverLoginActivity.class);
                MainActivity.this.startActivity(loginIntent);
            }
        });

    }
}
