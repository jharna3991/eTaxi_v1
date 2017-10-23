package projectetaxi.etaxi_v1;

/**
 * Created by Ashim Bazracharya on 10/18/2017.
 */

public class BookingData {

    public static String roadType = "City Road";
    public static String driverEmail = "xxx@xxx.com";
    public static String passengerEmail;
    public static String srcLat;
    public static String srcLong;
    public static String destLat;
    public static String destLong;
//    public static String bookingStatus = "Confirm";
    public static String amount = "150.00";

    public static String getRoadType() {
        return roadType;
    }

    public static void setRoadType(String roadType) {
        BookingData.roadType = roadType;
    }

    public static String getDriverEmail() {
        return driverEmail;
    }

    public static void setDriverEmail(String driverEmail) {
        BookingData.driverEmail = driverEmail;
    }

    public static String getPassengerEmail() {
        return passengerEmail;
    }

    public static void setPassengerEmail(String passengerEmail) {
        BookingData.passengerEmail = passengerEmail;
    }

    public static String getSrcLat() {
        return srcLat;
    }

    public static void setSrcLat(String srcLat) {
        BookingData.srcLat = srcLat;
    }

    public static String getSrcLong() {
        return srcLong;
    }

    public static void setSrcLong(String srcLong) {
        BookingData.srcLong = srcLong;
    }

    public static String getDestLat() {
        return destLat;
    }

    public static void setDestLat(String destLat) {
        BookingData.destLat = destLat;
    }

    public static String getDestLong() {
        return destLong;
    }

    public static void setDestLong(String destLong) {
        BookingData.destLong = destLong;
    }

//    public static String getBookingStatus() {
//        return bookingStatus;
//    }
//
//    public static void setBookingStatus(String bookingStatus) {
//        BookingData.bookingStatus = bookingStatus;
//    }

    public static String getAmount() {
        return amount;
    }

    public static void setAmount(String amount) {
        BookingData.amount = amount;
    }
}