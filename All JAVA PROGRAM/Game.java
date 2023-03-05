import java.util.Random;
import java.util.Scanner;

class TORandom {
    public int number;
    public int inputNumber;
    public int noOfGuess;

    public int getNoOfGuesses() {
        return noOfGuess;
    }

    public void setNoOfguesses(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    TORandom() {
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }

    void takeUserInput() {
        System.out.println("guess the number ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }

    boolean isCorrectNumber() {
        noOfGuess++;
        if (inputNumber == number) {
            System.out.println("yes you guessed it right it was" + "  " + number + " you guessed in " + " " + noOfGuess
                    + " number of guesses");
            return true;
        } else if (inputNumber < number) {
            System.out.println("to low.....");
        } else if (inputNumber > number) {
            System.out.println("to high");
            

        }
        return false;
    }

}

public class Game {
    public static void main(String[] args) {
        TORandom g = new TORandom();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }

}
