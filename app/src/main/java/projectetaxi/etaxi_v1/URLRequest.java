package projectetaxi.etaxi_v1;

/**
 * Created by Ashim Bazracharya on 10/15/2017.
 */

public class URLRequest {

    private static int num1 = 100;
    private static int num2 = 4;

    public static String driverLoginRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/driver/login";
    public static String driverRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/drivers";
    public static String passengerLoginRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/passenger/login";
    public static String passengerRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/passengers";
    public static String bookingHistoryRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/taxi_booking/history";
    public static String bookingRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/taxi_bookings";
}
