package projectetaxi.etaxi_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button btDriver = (Button) findViewById(R.id.btDriver);
        final Button btPassenger = (Button) findViewById(R.id.btPassenger);

        btPassenger.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view){
               Intent loginIntent = new Intent(MainActivity.this, PassengerLoginActivity.class);
               MainActivity.this.startActivity(loginIntent);
           }
        });

        btDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MainActivity.this, DriverLoginActivity.class);
                MainActivity.this.startActivity(loginIntent);
            }
        });

    }
}
