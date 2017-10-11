package projectetaxi.etaxi_v1;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ashim Bazracharya on 10/10/2017.
 */

public class DriverRegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "192.168.100.4:8000/api/v1/drivers";
    private Map<String, String> params;

    public DriverRegisterRequest(String name, String email, String password, String mobileNum,
                                 String licNum, String taxiNum, String address,
                                 Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);

        params = new HashMap<>();
        params.put("name", name);
        params.put("email", email);
        params.put("password", password);
        params.put("mobileNumber", mobileNum);
        params.put("licenseNumber", licNum);
        params.put("taxiNumber", taxiNum);
        params.put("address", address);
    }

    @Override
    public Map<String, String> getParams() {

        return params;
    }
}
