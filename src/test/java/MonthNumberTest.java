import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import dev.arturo.models.MonthNumber;

public class MonthNumberTest {
    MonthNumber monthNumber = new MonthNumber(3);


    @Test
    void testGetDay() {
        assertThat(monthNumber.getDay(), is(3));
    }

    @Test
    void testSetDay() {
        monthNumber.setDay(12);
        assertThat(monthNumber.getDay(), is(12));
    }
}
