package projectetaxi.etaxi_v1;

import android.content.Context;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ashim Bazracharya on 10/25/2017.
 */

public class LatlngToAddress {


    Context context;
    final String TAG = this.getClass().getName();

    public static String address;

    private static String API_KEY = "AIzaSyC8rwIajQlMPMrX_CRjSVehZioQ-fdAvtU";


    String googleLatlngToAddressUrl;


    public void getResponseAddress(String lat, String lng, final VolleyCallback callback) {

        googleLatlngToAddressUrl = "https://maps.googleapis.com/maps/api/geocode/json?latlng="
                + lat + ","
                + lng;

        Log.d(TAG, "Google URL-------> " + googleLatlngToAddressUrl);


        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(

                Request.Method.POST, googleLatlngToAddressUrl, null, new Response.Listener<JSONObject>() {

            //String address;

            @Override
            public void onResponse(JSONObject response) {

                try {

                    JSONArray jsonArray = response.getJSONArray("results");
                    address = jsonArray.getJSONObject(0).getString("formatted_address");

                    callback.onSuccessResponse(address);

                    Log.d(TAG, "On Response: " + address);

//                    sharedPreferences = context.getSharedPreferences(addressName, Context.MODE_PRIVATE);
//                    SharedPreferences.Editor editor = sharedPreferences.edit();
//                    editor.putString(addressKey, address);
//                    editor.apply();


                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {}

        }) {

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {

                Map<String, String> params = new HashMap<>();

                //params.put("Content-Type", "application/json");
                params.put("Accept", "application/json");
                params.put("Authorization", "Bearer " + API_KEY);

                return params;
            }

        };

        CustomSingleton.getInstance(context).addToRequestQueue(jsonObjectRequest);
//
//        sharedPreferences = context.getApplicationContext().getSharedPreferences(addressName, Context.MODE_PRIVATE);
//        String address = sharedPreferences.getString(addressKey, null);
    }

    public void latlngToAddress(String lat, String lng) {

        getResponseAddress(lat, lng, new VolleyCallback() {

            @Override
            public String onSuccessResponse(String result) {

                Log.d(TAG, "On Success Response Parameter: " + address);
                Log.d(TAG, "On Success Response: " + address);
                address = result;
                return address;
            }
        });

        Log.d(TAG, "Address Outside " + address);
    }

}
