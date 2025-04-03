package zookeeper.animals;

public class Gorilla extends Mammal {
    public Gorilla() {
        super(); 
    }
    
    public void throwSomething() {
        energy -= 5;
        System.out.println("Gorilla has thrown something!");
        displayEnergy();
    }
    
    public void eatBananas() {
        energy += 10;
        System.out.println("Gorilla is satisfied with bananas!");
        displayEnergy();
    }
    
    public void climb() {
        energy -= 10;
        System.out.println("Gorilla has climbed a tree!");
        displayEnergy();
    }
}