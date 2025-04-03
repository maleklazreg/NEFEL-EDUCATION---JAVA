public class Phone extends Device {
    public void makeCall() {
        battery -= 5;
        System.out.println("You make a call.");
        displayBattery();
        checkBatteryCritical();  
    }
    
    public void playGame() {
        if (battery >= 25) {  
            System.out.println("You play a game.");
            displayBattery();
            checkBatteryCritical();  
        } else {
            System.out.println("Battery too low to play game! (Need at least 25%)");
            displayBattery();
        }
    }
    
    public void charge() {
        battery += 50;
        if (battery > 100) {  
            battery = 100;
        }
        System.out.println("You charge the phone.");
        displayBattery();
    }
    
    private void checkBatteryCritical() {
        if (battery < 10) {
            System.out.println("Warning: Battery critical! Please charge soon.");
        }
    }
}