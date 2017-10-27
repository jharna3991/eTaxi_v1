package projectetaxi.etaxi_v1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ashim Bazracharya on 10/21/2017.
 */

public class BackgroundTaskPassengerHistory {

    final String TAG = this.getClass().getName();

//    private static final String addressName = "Address Name";
//    private static final String addressKey = "Address Key";
//    SharedPreferences sharedPreferences;

    Context context;

    PassengerLoginActivity passenger = new PassengerLoginActivity();

    ArrayList<PassengerHistory> arrayList = new ArrayList<>();

    String url = URLRequest.bookingRequest + "/" + passenger.getPassenEmail();

    public BackgroundTaskPassengerHistory(Context context) {
        this.context = context;
    }

    public ArrayList<PassengerHistory> getList() {

        final JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url,null,
                new Response.Listener<JSONArray>() {

                    @Override
                    public void onResponse(JSONArray response) {


                        int count = 0;
                        while (count<response.length()) {

                            try {

                                JSONObject jsonObject = response.getJSONObject(count);

                                String sourceLat = jsonObject.getString("sourceLatitude");
                                String sourceLng = jsonObject.getString("sourceLongitude");

                                String destLat = jsonObject.getString("destinationLatitude");
                                String destLng = jsonObject.getString("destinationLongitude");

                                Log.d(TAG, "Source Latlong: " + sourceLat + sourceLng);
                                Log.d(TAG, "Destination Latlong: " + destLat + destLng);


                                LatlngToAddress srcAddress = new LatlngToAddress();
                                srcAddress.latlngToAddress(sourceLat, sourceLng);
                                String source = srcAddress.address;

                                LatlngToAddress destAddress = new LatlngToAddress();
                                destAddress.latlngToAddress(destLat, destLng);
                                String destination = destAddress.address;

                                Log.d(TAG, "Source Loc: " + source);
                                Log.d(TAG, "Destination Loc: " + destination);

                                PassengerHistory passengerHistory = new PassengerHistory(
                                        jsonObject.getJSONObject("date").getString("date"),
                                        source,
                                        destination,
                                        jsonObject.getString("amount"));

                                arrayList.add(passengerHistory);

                                Log.d(TAG, "Booking History   " + passengerHistory.getBookingDate());
                                Log.d(TAG, "Booking History   " + passengerHistory.getSrcLoc());
                                Log.d(TAG, "Booking History   " + passengerHistory.getDestLoc());
                                Log.d(TAG, "Booking History   " + passengerHistory.getPassenAmount());

                                count++;

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(context, "Error !!!", Toast.LENGTH_SHORT).show();
                error.printStackTrace();
            }
        }) {

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {

                Map<String, String> params = new HashMap<>();

                //params.put("Content-Type", "application/json");
                params.put("Accept", "application/json");
                params.put("Authorization", "Bearer " + passenger.getPassenToken());

                return params;
            }
        };

        CustomSingleton.getInstance(context).addToRequestQueue(jsonArrayRequest);

        return arrayList;
    }
}
