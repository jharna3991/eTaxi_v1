package projectetaxi.etaxi_v1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Ashim Bazracharya on 10/17/2017.
 */

public class BookingActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        final Button btDestination = (Button) findViewById(R.id.btDestination);
        final Button btNearbyDriver = (Button) findViewById(R.id.btNearbyDriver);
        final Button btCalculatePrice = (Button) findViewById(R.id.btCalculatePrice);
        final Button btBookTaxi = (Button) findViewById(R.id.btBookTaxi);


    }
}
