package statepattern.after;

public class Main {

    public static void main(String[] args) {
        GachaMachine gachaMachine = new GachaMachine(5);

        System.out.println(gachaMachine);

        gachaMachine.insertQuarter();
        gachaMachine.turnCrank();
        gachaMachine.insertQuarter();
        gachaMachine.turnCrank();
        gachaMachine.ejectQuarter();

        System.out.println(gachaMachine);

        gachaMachine.insertQuarter();
        gachaMachine.insertQuarter();
        gachaMachine.turnCrank();
        gachaMachine.insertQuarter();
        gachaMachine.turnCrank();
        gachaMachine.insertQuarter();
        gachaMachine.turnCrank();

        System.out.println(gachaMachine);
    }
}
