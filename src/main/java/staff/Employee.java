package staff;

import java.util.Locale;
import java.util.Objects;

public abstract class Employee {
    private String name;
    private String natInsNumber;
    private double salary;

    public Employee(String name, String natInsNumber, double salary) {
        this.name = name;
        this.natInsNumber = natInsNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNatInsNumber() {
        return this.natInsNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double incrementToIncrease) {
        if (incrementToIncrease > 0 && incrementToIncrease <= 1) {
            this.salary = (1 + incrementToIncrease) * this.salary;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
