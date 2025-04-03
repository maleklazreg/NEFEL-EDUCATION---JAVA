package ZooKeeperTest;

import zookeeper.animals.Bat;
import zookeeper.animals.Gorilla;

public class ZooKeeperTest {
    public static void main(String[] args) {
        System.out.println("=== Gorilla Test ===");
        Gorilla gorilla = new Gorilla();
        
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        
        gorilla.eatBananas();
        gorilla.eatBananas();
        
        gorilla.climb();
        
        System.out.println("Final Gorilla Energy:");
        gorilla.displayEnergy();
        System.out.println();
        
        System.out.println("=== Bat Test ===");
        Bat bat = new Bat();
        
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        
        bat.eatHumans();
        bat.eatHumans();
        
        bat.fly();
        bat.fly();
        
        System.out.println("Final Bat Energy:");
        bat.displayEnergy();
    }
}