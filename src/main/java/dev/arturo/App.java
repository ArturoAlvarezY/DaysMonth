package dev.arturo;

import dev.arturo.models.MonthNumber;
import dev.arturo.models.NumberOfDays;

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
        MonthNumber monthNumber = new MonthNumber(3);
        NumberOfDays numberOfDays = new NumberOfDays();  
        
        System.out.println(numberOfDays.daysAndMonth(monthNumber));
    }
}
