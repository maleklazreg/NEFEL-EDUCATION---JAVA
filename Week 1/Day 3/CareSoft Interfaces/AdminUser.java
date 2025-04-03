import interfaces.CompliantUser;
import interfaces.CompliantAdmin;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser implements CompliantUser, CompliantAdmin {
    private Integer employeeID;
    private int pin;
    private String role;
    private ArrayList<String> securityIncidents;

    public AdminUser(Integer id, String role) {
        this.employeeID = id;
        this.role = role;
        this.securityIncidents = new ArrayList<>();
    }

    @Override
    public boolean assignPin(int pin) {
        if (String.valueOf(pin).length() >= 6) {
            this.pin = pin;
            return true;
        }
        return false;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (this.employeeID.equals(confirmedAuthID)) {
            return true;
        } else {
            newIncident(confirmedAuthID);
            return false;
        }
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return securityIncidents;
    }

    private void newIncident(Integer confirmedAuthID) {
        String report = String.format(
            "[Datetime Submitted: %s, ID: %d\nNotes: AUTHORIZATION ATTEMPT FAILED FOR THIS USER\n]",
            new Date(), this.employeeID
        );
        securityIncidents.add(report);
    }

    public Integer getEmployeeID() {
        return employeeID;
    }
}