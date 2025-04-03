public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        double mochaPrice = 3.5;
        double coffeePrice = 2.0;
        double lattePrice = 4.5;
        double cappuccinoPrice = 5.0;
    
        String customer1 = "Cindhuri";
        String customer2 = "Noah";
        String customer3 = "Sam";
        String customer4 = "Oliver";
    
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + coffeePrice);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        System.out.println(generalGreeting + customer2);
        double samTotal = lattePrice * 2;
        System.out.println(displayTotalMessage + samTotal);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(generalGreeting + customer3);
        double oliverCoffeeCharge = coffeePrice;
        double oliverLatteCharge = lattePrice;
        double oliverTotal = oliverCoffeeCharge + oliverLatteCharge;
        System.out.println(displayTotalMessage + oliverTotal);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }
    }
}