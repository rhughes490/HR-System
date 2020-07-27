import Management.Director;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Erik", "JK097703B", 100000.00, "Manufacturing", 500000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Erik", director.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("JK097703B", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000.00, director.getSalary(), 0.001);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Manufacturing", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000.00);
        assertEquals(101000.00, director.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(102000.00, director.payBonus(), 0.001);
    }

    @Test
    public void hasBudget() {
        assertEquals(500000.00, director.getBudget(), 0.001);
    }

}
