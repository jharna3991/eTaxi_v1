package projectetaxi.etaxi_v1;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ashim Bazracharya on 10/13/2017.
 */

public class PassengerLoginRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://192.168.100.4:8000/api/v1/passengers";
    private Map<String, String> params;

    public PassengerLoginRequest(String email, String password, Response.Listener<String> listener) {
        super(Request.Method.POST, REGISTER_REQUEST_URL, listener, null);

        params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {

        return params;
    }
}