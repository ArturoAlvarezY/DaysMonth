package dev.arturo;

import dev.arturo.models.MonthNumber;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        MonthNumber monthNumber = new MonthNumber();

        System.out.println(monthNumber.daysAndMonth(13));
        System.out.println(monthNumber.daysAndMonth(3));
    }
}
