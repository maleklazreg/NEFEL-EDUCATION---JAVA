import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        System.out.println("----- Ten Rolls Test -----");
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        System.out.println("\n----- Random Letter Test -----");
        System.out.println("Random letter: " + generator.getRandomLetter());

        System.out.println("\n----- Generate Password Test -----");
        System.out.println("Random password: " + generator.generatePassword());

        System.out.println("\n----- Password Set Test -----");
        ArrayList<String> passwordSet = generator.getNewPasswordSet(3);
        System.out.println("Password set: " + passwordSet);

        System.out.println("\n----- Shuffle Array Test -----");
        int[] testArray = {1, 2, 3, 4, 5};
        System.out.println("Before shuffle: " + Arrays.toString(testArray));
        generator.shuffleArray(testArray);
        System.out.println("After shuffle: " + Arrays.toString(testArray));
    }
}