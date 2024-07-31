import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import dev.arturo.models.MonthNumber;
import dev.arturo.models.NumberOfDays;

public class NumberOfDaysTest {

    NumberOfDays numberOfDays = new NumberOfDays();
    MonthNumber monthNumber = new MonthNumber(0);

    @Test
    void testDaysAndMonth() {
    monthNumber.setDay(1);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("January, 31 days"));

    monthNumber.setDay(2);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("February, 28 days"));
   
    monthNumber.setDay(3);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("March, 31 days"));

    monthNumber.setDay(4);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("April, 30 days"));

    monthNumber.setDay(5);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("May, 31 days"));
    
    monthNumber.setDay(6);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("June, 30 days"));
    
    monthNumber.setDay(7);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("July, 31 days"));
    
    monthNumber.setDay(8);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("August, 31 days"));
    
    monthNumber.setDay(9);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("September, 30 days"));
    
    monthNumber.setDay(10);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("October, 31 days"));
    
    monthNumber.setDay(11);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("November, 30 days"));
    
    monthNumber.setDay(12);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("December, 31 days"));
    
    monthNumber.setDay(0);
    assertThat(numberOfDays.daysAndMonth(monthNumber), is("Invalid month number"));

    
    
    }
}
