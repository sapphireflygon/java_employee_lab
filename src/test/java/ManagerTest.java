import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mr Blobby", "AA123456C", 45000.00, "Blobby World" );
    }

    @Test
    public void hasName(){
        assertEquals("Mr Blobby", manager.getName());
    }

    @Test
    public void hasNatInsNumber(){
        assertEquals("AA123456C", manager.getNatInsNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(45000.00, manager.getSalary(), 0.00);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Blobby World", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.05);
        assertEquals(47250.00, manager.getSalary(), 0.00);
    }

    @Test
    public void willNotRaiseSalaryIfPassedAnInvalidNumber(){
        manager.raiseSalary(-0.67);
        manager.raiseSalary(987234);
        manager.raiseSalary(-8976);
        assertEquals(45000.00, manager.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(450.00, manager.payBonus(), 0.00);
    }

    @Test
    public void canChangeName(){
        manager.setName("Mark");
        assertEquals("Mark", manager.getName());
    }

    @Test
    public void willNotChangeNameIfNull(){
        manager.setName(null);
        assertEquals("Mr Blobby", manager.getName());
    }

}
