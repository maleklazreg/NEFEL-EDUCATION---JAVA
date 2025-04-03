import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    private Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rolls.add(randMachine.nextInt(20) + 1);
        }
        return rolls;
    }

    public char getRandomLetter() {
        // char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                          'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        int randomIndex = randMachine.nextInt(26);
        // return alphabet[randMachine.nextInt(alphabet.length)];

        return alphabet[randomIndex];
        // THIS IS A ANATHER METHOD 

    }

    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

    public void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int randomIndex = randMachine.nextInt(i + 1);
            
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}