package projectetaxi.etaxi_v1;

/**
 * Created by Ashim Bazracharya on 10/13/2017.
 */

public class ApiToken {

    private  String driverToken;
    private String passengerToken;

    public String getDriverToken() {
        return driverToken;
    }

    public void setDriverToken(String driverToken) {
        this.driverToken = driverToken;
    }

    public String getPassengerToken() {
        return passengerToken;
    }

    public void setPassengerToken(String passengerToken) {
        this.passengerToken = passengerToken;
    }
}
