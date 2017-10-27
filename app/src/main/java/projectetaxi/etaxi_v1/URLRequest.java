package projectetaxi.etaxi_v1;

/**
 * Created by Ashim Bazracharya on 10/15/2017.
 */

public class URLRequest {

    private static int num1 = 100;
    private static int num2 = 4;
    private static String API_KEY = "AIzaSyC8rwIajQlMPMrX_CRjSVehZioQ-fdAvtU";
    private static String latitude;
    private static String longitude;

    public static String getLatitude() {
        return latitude;
    }

    public static void setLatitude(String latitude) {
        URLRequest.latitude = latitude;
    }

    public static String getLongitude() {
        return longitude;
    }

    public static void setLongitude(String longitude) {
        URLRequest.longitude = longitude;
    }

    public static String driverLoginRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/driver/login";
    public static String driverRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/drivers";
    public static String passengerLoginRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/passenger/login";
    public static String passengerRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/passengers";
    public static String bookingHistoryRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/taxi_booking/history";
    public static String bookingRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/taxi_bookings";
    public static String getAddressFromLatlongUrl = "https://maps.googleapis.com/maps/api/geocode/json?latlng="
            + latitude + ","
            + longitude + "&key="
            + API_KEY;
}
