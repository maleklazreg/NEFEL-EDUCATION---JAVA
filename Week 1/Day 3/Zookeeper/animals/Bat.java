package zookeeper.animals;

public class Bat extends Mammal {
    public Bat() {
        this.energy = 300;  
    }
    
    public void fly() {
        energy -= 50;
        System.out.println("Bat takes flight! *flap flap*");
        displayEnergy();
    }
    
    public void eatHumans() {
        energy += 25;
        System.out.println("Bat has eaten a human! Nom nom nom!");
        displayEnergy();
    }
    
    public void attackTown() {
        energy -= 100;
        System.out.println("Bat attacks a town! Chaos ensues!");
        displayEnergy();
    }
}