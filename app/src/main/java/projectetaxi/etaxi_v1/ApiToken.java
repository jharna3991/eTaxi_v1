package projectetaxi.etaxi_v1;

/**
 * Created by Ashim Bazracharya on 10/13/2017.
 */

public class ApiToken {

    private  String driverToken;
    private String pasengerToken;

    public String getDriverToken() {
        return driverToken;
    }

    public void setDriverToken(String driverToken) {
        this.driverToken = driverToken;
    }

    public String getPasengerToken() {
        return pasengerToken;
    }

    public void setPasengerToken(String pasengerToken) {
        this.pasengerToken = pasengerToken;
    }
}
