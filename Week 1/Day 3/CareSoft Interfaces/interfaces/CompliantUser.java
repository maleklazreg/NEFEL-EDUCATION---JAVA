package interfaces;

public interface CompliantUser {
    boolean assignPin(int pin);
    boolean accessAuthorized(Integer confirmedAuthID);
}