import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("John", "JL949923B", 50000.00, "IT Department");
    }

    @Test
    public void hasName() {
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("JL949923B", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void hasDeptName() {
        assertEquals("IT Department", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000.00);
        assertEquals(51000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(50500.00, manager.payBonus(), 0.001);
    }
}
