import java.util.ArrayList;

public class Order {
    private String name;
    private ArrayList<Item> items;
    
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) { items.add(item); }
    public String getName() { return name; }
    public ArrayList<Item> getItems() { return items; }
}