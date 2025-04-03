import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;
    
    public CoffeeKiosk() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }
    
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price, menu.size());
        menu.add(newItem);
    }
    
    public void displayMenu() {
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }
    
    public void newOrder() {
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        
        Order newOrder = new Order(name);
        orders.add(newOrder);
        
        displayMenu();
        
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        while (!itemNumber.equals("q")) {
            try {
                int index = Integer.parseInt(itemNumber);
                if (index >= 0 && index < menu.size()) {
                    newOrder.addItem(menu.get(index));
                } else {
                    System.out.println("Invalid item number!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or q to quit!");
            }
            
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        
        System.out.println("Order for " + newOrder.getName() + ":");
        for (Item item : newOrder.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
    
    public void addMenuItemByInput() {
        System.out.println("Please enter item name:");
        String name = System.console().readLine();
        
        System.out.println("Please enter item price:");
        String priceStr = System.console().readLine();
        
        try {
            double price = Double.parseDouble(priceStr);
            addMenuItem(name, price);
            System.out.println("Item added successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid price format!");
        }
    }
}