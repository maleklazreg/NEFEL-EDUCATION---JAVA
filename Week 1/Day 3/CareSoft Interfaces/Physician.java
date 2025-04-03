import interfaces.CompliantUser;
import java.util.Date;

public class Physician implements CompliantUser {
    private int id;
    private int pin;


    public Physician(int id) {
        this.id = id;
    }

    @Override
    public boolean assignPin(int pin) {
        if (String.valueOf(pin).length() == 4) {
            this.pin = pin;
            return true;
        }
        return false;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        return this.id == confirmedAuthID;
    }

    public int getId() {
        return id;
    }
}