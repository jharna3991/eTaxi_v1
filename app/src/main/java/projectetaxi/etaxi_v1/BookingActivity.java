package projectetaxi.etaxi_v1;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Ashim Bazracharya on 10/17/2017.
 */

public class BookingActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        final BookingData data = new BookingData();

        final Button btDestination = (Button) findViewById(R.id.btDestination);
        final Button btNearbyDriver = (Button) findViewById(R.id.btNearbyDriver);
        final Button btCalculatePrice = (Button) findViewById(R.id.btCalculatePrice);
        final Button btBookTaxi = (Button) findViewById(R.id.btBookTaxi);


        //action for setting destination

        btDestination.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(BookingActivity.this, DestinationSelectionActivity.class);
                BookingActivity.this.startActivity(intent);
            }
        });

        //This action is for the  button Book that post taxi bookings data in the database...

        btBookTaxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String roadType = data.roadType;
                final String driverEmail = data.driverEmail;
                final String passengerEmail = data.passengerEmail;
                final String srcLat = data.srcLat;
                final String srcLong = data.srcLong;
                final String destLat = data.destLat;
                final String destLong = data.destLong;
                final String bookingStatus = data.bookingStatus;
                final String amount = data.amount;

                Response.Listener<String> responseListener = new Response.Listener<String>() {


                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if(success) {

                                Intent intent = new Intent(BookingActivity.this, DriverLoginActivity.class);
                                BookingActivity.this.startActivity(intent);
                            } else {

                                AlertDialog.Builder builder = new AlertDialog.Builder(BookingActivity.this);
                                builder.setMessage("Booking Failed")
                                        .setNegativeButton("Try Again", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                BookingRequest request = new BookingRequest(roadType, driverEmail, passengerEmail,
                        srcLat, srcLong, destLat, destLong, bookingStatus, amount, responseListener);
                RequestQueue queue = Volley.newRequestQueue(BookingActivity.this);
                queue.add(request);
            }
        });





    }

}
