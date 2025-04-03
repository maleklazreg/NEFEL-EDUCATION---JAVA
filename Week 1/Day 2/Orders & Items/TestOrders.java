import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item("mocha", 4.50);
        Item item2 = new Item("latte", 4.00);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("cappuccino", 3.75);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.println("Printing order1 object directly:");
        System.out.println(order1);

        System.out.println("\nPredicting order1.total will print 0.0:");
        System.out.printf("Total: %s\n", order1.total);

        order2.items.add(item1);  
        order2.total += item1.price;

        order3.items.add(item4);  
        order3.total += item4.price;

        order4.items.add(item2);  
        order4.total += item2.price;

        order1.ready = true;


        order4.items.add(item2);  
        order4.items.add(item2);  
        order4.total += (item2.price * 2);

        order2.ready = true;

    
        System.out.println("\nFinal Order Status:");
        System.out.printf("Name: %s\nTotal: %.2f\nReady: %s\nItems: %s\n\n", 
            order1.name, order1.total, order1.ready, order1.items);
        System.out.printf("Name: %s\nTotal: %.2f\nReady: %s\nItems: %s\n\n", 
            order2.name, order2.total, order2.ready, order2.items);
        System.out.printf("Name: %s\nTotal: %.2f\nReady: %s\nItems: %s\n\n", 
            order3.name, order3.total, order3.ready, order3.items);
        System.out.printf("Name: %s\nTotal: %.2f\nReady: %s\nItems: %s\n", 
            order4.name, order4.total, order4.ready, order4.items);
    }
}