package management;

public class Director extends Manager{
    private double budget;

    public Director(String name, String natInsNumber, double salary, String deptName, double budget) {
        super(name, natInsNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus() {
        double salary = this.getSalary();
        return salary * 0.02;
    }
}
