package projectetaxi.etaxi_v1;

/**
 * Created by Ashim Bazracharya on 10/15/2017.
 */

public class URLRequest {

    private static int num1 = 100;
    private static int num2 = 11;

    public static String passengerEmail = "bashirian.lila@example.org";
    public static String driverEmail;

    public static String driverLoginRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/driver/login";
    public static String driverRegisterRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/drivers";
    public static String passengerLoginRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/passenger/login";
    public static String passengerRegisterRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/passengers";
    public static String bookingHistoryRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/taxi_bookings/"
            +passengerEmail;
    public static String bookingRequest = "http://192.168."+num1+"."+num2+":8000/api/v1/taxi_bookings";
}
