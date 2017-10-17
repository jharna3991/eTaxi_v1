package projectetaxi.etaxi_v1;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.internal.NavigationMenu;
import android.support.design.internal.NavigationMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import static projectetaxi.etaxi_v1.R.id.lvHistory;
import static projectetaxi.etaxi_v1.R.id.nav_history;


/**
 * Created by Ashim Bazracharya on 10/14/2017.
 */

public class PassengerHistoryFragment extends Fragment {

    public PassengerHistoryFragment() {}

    public static String[] dateList = {"a", "b", "c"};

    ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View mView = inflater.inflate(R.layout.passenger_history, container, false);

        mListView = (ListView) mView.findViewById(lvHistory);

        final NavigationMenuView navHistory = mView.findViewById(nav_history);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                dateList
        );


        mListView.setAdapter(listViewAdapter);
//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                if(position == 0) {
//                    Toast.makeText(getActivity(), "a", Toast.LENGTH_SHORT).show();
//                }else if(position == 1) {
//                    Toast.makeText(getActivity(), "b", Toast.LENGTH_SHORT).show();
//                }else if(position == 2) {
//                    Toast.makeText(getActivity(), "c", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

//        navHistory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                final Response.Listener<String> responseListener = new Response.Listener<String>() {
//
//
//                    @Override
//                    public void onResponse(String response) {
//
//                        try {
//                            JSONObject jsonResponse = new JSONObject(response);
//                            boolean success = jsonResponse.getBoolean("success");
//
//                            if(success) {
//
//                                Intent intent = new Intent(DriverLoginActivity.this, DriverActivity.class);
//                                DriverLoginActivity.this.startActivity(intent);
//                                Toast.makeText(getApplicationContext(), token.getDriverToken(),
//                                        Toast.LENGTH_SHORT).show();
//                            } else {
//
//                                Toast.makeText(getApplicationContext(), "Login Failed, try again",
//                                        Toast.LENGTH_SHORT).show();
//
////                                AlertDialog.Builder builder = new AlertDialog.Builder(DriverRegisterActivity.this);
////                                builder.setMessage("Register Failed")
////                                        .setNegativeButton("Try Again", null)
////                                        .create()
////                                        .show();
//                            }
//                        } catch (JSONException e) {
//
//                            e.printStackTrace();
//                        }
//                    }
//                };
//
//                BookingHistoryRequest request = new BookingHistoryRequest(responseListener);
//                RequestQueue queue = Volley.newRequestQueue(PassengerHistoryFragment.this);
//                queue.add(request);
//            }
//
//        });

        return mView;
    }
}
