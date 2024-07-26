import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*; 


import dev.arturo.models.MonthNumber;

public class MonthTest {

    MonthNumber monthNumber = new MonthNumber();
    @Test
    void testDaysAndMonth() {
        assertThat(monthNumber.daysAndMonth(3), is("March, 31 days"));
    }
}
