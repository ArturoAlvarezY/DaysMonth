import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import dev.arturo.models.Months;

public class MonthsTest {
    @Test
    void testGetDays() {
        Months months = new Months("March", 31);
        assertThat(months.getDays(), equalTo(31));
        
    }

    @Test
    void testGetMonthName() {
        Months months = new Months("July", 31);

        assertThat(months.getMonthName(), equalTo("July"));
    }

    @Test
    void testSetDays() {
        Months months = new Months("March", 31);

       months.setDays(28);

       assertThat(months.getDays(), is(28));
    }

    @Test
    void testSetMonthName() {

        Months months = new Months("February", 31);

        months.setMonthName("January");

        assertThat(months.getMonthName(), is("January"));
    }
}
