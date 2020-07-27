import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Peter", "JK3582H", 35000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Peter", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("JK3582H", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(35000.00, developer.getSalary(), 0.001);
    }
}
