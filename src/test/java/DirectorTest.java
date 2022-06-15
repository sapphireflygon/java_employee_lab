import management.Director;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before(){
        director = new Director("Hansel", "SX000006F", 120000.00, "Ministry of Cat Memes", 2000000000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Hansel", director.getName());
    }

    @Test
    public void hasNatInsNumber(){
        assertEquals("SX000006F", director.getNatInsNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(120000.00, director.getSalary(), 0.00);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Ministry of Cat Memes", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(2000000000.00, director.getBudget(), 0.00);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.04);
        assertEquals(124800.00, director.getSalary(), 0.00);
    }

    @Test
    public void willNotRaiseSalaryIfPassedAnInvalidNumber(){
        director.raiseSalary(45.9);
        director.raiseSalary(-1.0);
        assertEquals(120000.00, director.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2400, director.payBonus(), 0.00);
    }

    @Test
    public void canChangeName(){
        director.setName("Stuart");
        assertEquals("Stuart", director.getName());
    }

    @Test
    public void willNotChangeNameIfNull(){
        director.setName(null);
        assertEquals("Hansel", director.getName());
    }
}
