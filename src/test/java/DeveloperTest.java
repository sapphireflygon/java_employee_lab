import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Elin", "ZZ654321X", 40000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Elin", developer.getName());
    }

    @Test
    public void hasNatsInsNumber() {
        assertEquals("ZZ654321X", developer.getNatInsNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, developer.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.20);
        assertEquals(48000.00, developer.getSalary(), 0.00);
    }

    @Test
    public void willNotRaiseSalaryIfPassedAnInvalidNumber(){
        developer.raiseSalary(-0.2);
        developer.raiseSalary(8);
        assertEquals(40000.00, developer.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.00, developer.payBonus(), 0.00);
    }

    @Test
    public void canChangeName(){
        developer.setName("Sandra");
        assertEquals("Sandra", developer.getName());
    }

    @Test
    public void willNotChangeNameIfNull(){
        developer.setName(null);
        assertEquals("Elin", developer.getName());
    }
}
