import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args){
        Item mocha = new Item("mocha", 4.50);
        Item latte = new Item("latte", 4.00);
        Item dripCoffee = new Item("drip coffee", 2.50);
        Item cappuccino = new Item("cappuccino", 3.75);

        
        Order guest1 = new Order();
        Order guest2 = new Order();

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Sam");

        guest1.addItem(mocha);
        guest1.addItem(dripCoffee);

        guest2.addItem(latte);
        guest2.addItem(cappuccino);

        order1.addItem(dripCoffee);
        order1.addItem(cappuccino);

        order2.addItem(mocha);
        order2.addItem(latte);

        order3.addItem(latte);
        order3.addItem(cappuccino);

        order1.setReady(true);  
        guest2.setReady(true); 
        System.out.println("Status Messages:");
        System.out.println(guest1.getStatusMessage());
        System.out.println(guest2.getStatusMessage());
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());

        System.out.println("\nOrder Totals:");
        System.out.println("Guest 1 Total: " + guest1.getOrderTotal());
        System.out.println("Guest 2 Total: " + guest2.getOrderTotal());
        System.out.println("Cindhuri Total: " + order1.getOrderTotal());
        System.out.println("Jimmy Total: " + order2.getOrderTotal());
        System.out.println("Sam Total: " + order3.getOrderTotal());

        System.out.println("\nFull Order Details:");
        guest1.display();
        System.out.println();
        guest2.display();
        System.out.println();
        order1.display();
        System.out.println();
        order2.display();
        System.out.println();
        order3.display();
    }
}