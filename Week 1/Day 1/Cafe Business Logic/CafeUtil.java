import java.util.ArrayList;
import java.util.Arraylist;

public class CafeUtil {
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public int getStrakeGoal() {
        return getStreakGoal(10);
    }

    public double getOrderTolat(double[] prices){
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.print("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}