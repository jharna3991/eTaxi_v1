package projectetaxi.etaxi_v1;

/**
 * Created by Ashim Bazracharya on 10/15/2017.
 */

public class PassengerBookingHistory {

    private String date;
    private String sourceLoc;
    private String destinationLoc;
    private String amount;

    public PassengerBookingHistory(String date, String sourceLoc, String destinationLoc, String amount) {
        this.date = date;
        this.sourceLoc = sourceLoc;
        this.destinationLoc = destinationLoc;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSourceLoc() {
        return sourceLoc;
    }

    public void setSourceLoc(String sourceLoc) {
        this.sourceLoc = sourceLoc;
    }

    public String getDestinationLoc() {
        return destinationLoc;
    }

    public void setDestinationLoc(String destinationLoc) {
        this.destinationLoc = destinationLoc;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
