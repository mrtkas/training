package machine;

public class Latte extends Coffee {
    static final int WATER_PER_CUP = 350;
    static final int MILK_PER_CUP = 75;
    static final int COFFEE_PER_CUP = 20;
    static final int MONEY_PER_CUP = 7;
    @Override
    void makeCoffe(Machine machine) {
        machine.setMoney(machine.getMoney() + MONEY_PER_CUP);
        machine.setWater(machine.getWater() - WATER_PER_CUP);
        machine.setBeans(machine.getBeans() - COFFEE_PER_CUP);
        machine.setMilk(machine.getMilk() - MILK_PER_CUP);
        machine.setCups(machine.getCups() - 1);
    }

    @Override
    boolean validateAmounts(Machine machine) {
        if (machine.getWater() - WATER_PER_CUP < 0) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        if (machine.getMilk() - MILK_PER_CUP < 0) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        if (machine.getBeans() - COFFEE_PER_CUP < 0) {
            System.out.println("Sorry, not enough coffee!");
            return false;
        }
        System.out.println("I have enough resources, making you a coffee!");
        return true;
    }
}
