package rockpaperscissors;

/*
import java.util.Scanner;
import java.util.Random;
public class Main {

    public enum RPS {
        ROCK("rock"),
        PAPER("paper"),
        SCISSORS("scissors");

        private final String value;
        RPS (final String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private static final String END_TOKEN = "!exit";
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String userHand = scanner.nextLine();
            if (isGameOver(userHand)) {
                break;
            }
            Random random = new Random();
            int randomInt = random.nextInt(3);
            System.out.println(compareResults(userHand, giveRandomInput(randomInt)));
        }
        System.out.println("Bye!");
    }

    public static String compareResults(String userHand, String randomInput) {
        if (userHand.equals(randomInput)){
            return "There is a draw (" + userHand +")";
        }
        if ((userHand.equals(RPS.ROCK.getValue()) && randomInput.equals(RPS.PAPER.getValue())) ||
                (userHand.equals(RPS.PAPER.getValue()) && randomInput.equals(RPS.SCISSORS.getValue())) ||
                (userHand.equals(RPS.SCISSORS.getValue()) && randomInput.equals(RPS.ROCK.getValue()))) {
            return "Sorry, but the computer chose " + randomInput;
        }
        if ((randomInput.equals(RPS.ROCK.getValue()) && userHand.equals(RPS.PAPER.getValue())) ||
                (randomInput.equals(RPS.PAPER.getValue()) && userHand.equals(RPS.SCISSORS.getValue())) ||
                (randomInput.equals(RPS.SCISSORS.getValue()) && userHand.equals(RPS.ROCK.getValue()))) {
            return "Well done. The computer chose " + randomInput + " and failed";
        }
        return "Invalid input";
    }

    public static String giveRandomInput(int randomInt) {
        switch (randomInt) {
            case 0:
                return "paper";
            case 1:
                return "scissors";
            case 2:
                return "rock";
            default:
                return "somethingelse";
        }
    }

    public static boolean isGameOver(String userInput) {
        if (userInput.equals(END_TOKEN)) {
            return true;
        }
        return false;
    }
}

 */
