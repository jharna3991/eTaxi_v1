package projectetaxi.etaxi_v1;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

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

    Context context;
    PassengerLoginActivity passenger = new PassengerLoginActivity();
    ArrayList<PassengerHistory> arrayList = new ArrayList<>();
    String url = URLRequest.bookingRequest + "/" + passenger.getPassenEmail();

    public BackgroundTaskPassengerHistory(Context context) {
        this.context = context;
    }

    public ArrayList<PassengerHistory> getList() {

        final JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        int count = 0;
                        while (count<response.length()) {

                            try {
                                JSONObject jsonObject = response.getJSONObject(count);
                                PassengerHistory passengerHistory = new PassengerHistory(
                                        jsonObject.getJSONObject("date").getString("date"),
                                        jsonObject.getString("sourceLatitude"),
                                        jsonObject.getString("sourceLongitude"),
                                        jsonObject.getString("destinationLatitude"),
                                        jsonObject.getString("destinationLongitude"),
                                        jsonObject.getString("amount"));

                                arrayList.add(passengerHistory);

                                Log.d(TAG, "Booking History   " + passengerHistory.getBookingDate());
                                Log.d(TAG, "Booking History   " + passengerHistory.getSrcLat());
                                Log.d(TAG, "Booking History   " + passengerHistory.getSrcLong());
                                Log.d(TAG, "Booking History   " + passengerHistory.getDestLat());
                                Log.d(TAG, "Booking History   " + passengerHistory.getDestLong());
                                Log.d(TAG, "Booking History   " + passengerHistory.getPassenAmount() + "\n");

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

        PassengerHistorySingleton.getInstance(context).addToRequestQueue(jsonArrayRequest);

        return arrayList;
    }
}
