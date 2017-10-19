//package projectetaxi.etaxi_v1;
//
//import com.android.volley.AuthFailureError;
//import com.android.volley.Response;
//import com.android.volley.toolbox.StringRequest;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by Ashim Bazracharya on 10/15/2017.
// */
//
//public class BookingHistoryRequest extends StringRequest {
//
//
//    private static final String URL = URLRequest.bookingHistoryRequest;
//
//    public BookingHistoryRequest(Response.Listener<String> listener) {
//        super(Method.GET, URL, listener, null);
//    }
//
//    @Override
//    public Map<String, String> getHeaders() throws AuthFailureError{
//
//        Map<String, String> headers = new HashMap<>();
//
//        headers.put("Authorization", "Bearer " + token);
//
//        return headers;
//    }
//}
