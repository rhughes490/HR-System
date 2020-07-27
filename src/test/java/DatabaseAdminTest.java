import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

        @Before
        public void before() {
            databaseAdmin = new DatabaseAdmin("Luke", "JG908391N", 40000.00);
        }

        @Test
        public void hasName() {
            assertEquals("Luke", databaseAdmin.getName());
        }

        @Test
        public void hasNationalInsuranceNumber() {
            assertEquals("JG908391N", databaseAdmin.getNationalInsuranceNumber());
        }

        @Test
        public void hasSalary() {
            assertEquals(40000.00, databaseAdmin.getSalary(), 0.001);
        }
}