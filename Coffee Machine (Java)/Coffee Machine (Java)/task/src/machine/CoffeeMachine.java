package machine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class CoffeeMachine {
    static final int WATER_PER_CUP = 200;
    static final int MILK_PER_CUP = 50;
    static final int COFFEE_PER_CUP = 15;
    static Scanner scanner =  new Scanner(System.in);

    static Machine machine = new Machine(400, 540, 120, 9, 550);
    public static void main(String[] args) {
        boolean loopAlive = true;
        while (loopAlive) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String command = scanner.nextLine();

            int order = processCommand(command);

            switch (order) {
                case 1:
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String coffeeSortString = scanner.nextLine();
                    int coffeeSort;
                    try{
                        coffeeSort = Integer.parseInt(coffeeSortString);
                    } catch (NumberFormatException e) {
                        break;
                    }

                    switch (coffeeSort) {
                        case 1:
                            Coffee espresso = new Espresso();
                            if (espresso.validateAmounts(machine)) {
                                espresso.makeCoffe(machine);
                            }
                            break;
                        case 2:
                            Coffee latte = new Latte();
                            if (latte.validateAmounts(machine)) {
                                latte.makeCoffe(machine);
                            }
                            break;
                        case 3:
                            Coffee cappucino = new Cappucino();
                            if (cappucino.validateAmounts(machine)) {
                                cappucino.makeCoffe(machine);
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Write how many ml of water you want to add:");
                    int water = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    int milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int beans = scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    int cups = scanner.nextInt();
                    machine.fillMachine(water, milk, beans, cups);
                    break;
                case 3:
                    System.out.println("I gave you $" + machine.takeMoney());
                    break;
                case 4:
                    machine.printState();
                    break;
                case 5:
                    loopAlive = false;
                    break;

            }
        }


        /*System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        List<Integer> possibleCups= new ArrayList<>();
        possibleCups.add(water / WATER_PER_CUP);
        possibleCups.add(milk / MILK_PER_CUP);
        possibleCups.add(coffee / COFFEE_PER_CUP);

        int maxCups = Collections.min(possibleCups);
        int difference = maxCups - cups;

        switch ((difference < 0) ? 0 :
                (difference == 0) ? 1 : 2) {
            case 0:
                System.out.println("No, I can only make " + maxCups + " cup(s) of coffee");
                break;
            case 1:
                System.out.println("Yes, I can make that amount of coffee");
                break;
            case 2:
                System.out.println("Yes, I can make that amount of coffee (and even " + difference + " more than that)");
                break;
        }*/
    }


    public static int processCommand(String input) {
        switch (input) {
            case "buy":
                return 1;
            case "fill":
                return 2;
            case "take":
                return 3;
            case "remaining":
                return 4;
            case "exit":
                return 5;
        }
        return 0;
    }
}
