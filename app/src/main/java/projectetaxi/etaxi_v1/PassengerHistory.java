package projectetaxi.etaxi_v1;

/**
 * Created by Ashim Bazracharya on 10/21/2017.
 */

public class PassengerHistory {

    private String bookingDate, srcLat, srcLong, destLat, destLong, passenAmount;

    public PassengerHistory(String bookingDate, String srcLat, String srcLong, String destLat, String destLong, String passenAmount) {
        this.bookingDate = bookingDate;
        this.srcLat = srcLat;
        this.srcLong = srcLong;
        this.destLat = destLat;
        this.destLong = destLong;
        this.passenAmount = passenAmount;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getSrcLat() {
        return srcLat;
    }

    public void setSrcLat(String srcLat) {
        this.srcLat = srcLat;
    }

    public String getSrcLong() {
        return srcLong;
    }

    public void setSrcLong(String srcLong) {
        this.srcLong = srcLong;
    }

    public String getDestLat() {
        return destLat;
    }

    public void setDestLat(String destLat) {
        this.destLat = destLat;
    }

    public String getDestLong() {
        return destLong;
    }

    public void setDestLong(String destLong) {
        this.destLong = destLong;
    }

    public String getPassenAmount() {
        return passenAmount;
    }

    public void setPassenAmount(String passenAmount) {
        this.passenAmount = passenAmount;
    }
}
