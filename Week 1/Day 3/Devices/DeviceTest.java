public class DeviceTest {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        
        System.out.println("Initial battery status:");
        myPhone.displayBattery();
        System.out.println();
        
        System.out.println("Making three calls:");
        myPhone.makeCall();
        myPhone.makeCall();
        myPhone.makeCall();
        System.out.println();
        
        System.out.println("Playing games twice:");
        myPhone.playGame();
        myPhone.playGame();
        System.out.println();
        
        System.out.println("Charging phone:");
        myPhone.charge();
    }
}