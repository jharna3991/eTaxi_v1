package projectetaxi.etaxi_v1;

/**
 * Created by Ashim Bazracharya on 10/21/2017.
 */

public class PassengerHistory {

    private String bookingDate, srcLoc, destLoc, passenAmount;

    public PassengerHistory() {

    }

    public PassengerHistory(String bookingDate,
                            String srcLoc,
                            String destLoc,
                            String passenAmount
    ) {
        this.bookingDate = bookingDate;
        this.srcLoc = srcLoc;
        this.destLoc = destLoc;
        this.passenAmount = passenAmount;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getSrcLoc() {
        return srcLoc;
    }

    public void setSrcLoc(String srcLoc) {
        this.srcLoc = srcLoc;
    }

    public String getDestLoc() {
        return destLoc;
    }

    public void setDestLoc(String destLoc) {
        this.destLoc = destLoc;
    }

    public String getPassenAmount() {
        return passenAmount;
    }

    public void setPassenAmount(String passenAmount) {
        this.passenAmount = passenAmount;
    }
}
