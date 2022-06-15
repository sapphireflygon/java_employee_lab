import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Data", "DD758585C", 38000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Data", databaseAdmin.getName());
    }

    @Test
    public void hasNatInsNumber(){
        assertEquals("DD758585C", databaseAdmin.getNatInsNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(38000.00, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(0.3);
        assertEquals(49400.00, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void willNotRaiseSalaryIfPassedAnInvalidNumber(){
        databaseAdmin.raiseSalary(1.2);
        databaseAdmin.raiseSalary(-8.99);
        assertEquals(38000.00, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(380.00, databaseAdmin.payBonus(), 0.00);
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Lore");
        assertEquals("Lore", databaseAdmin.getName());
    }

    @Test
    public void willNotChangeNameIfNull(){
        assertEquals("Data", databaseAdmin.getName());
    }
}
