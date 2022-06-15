package management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, String natInsNumber, double salary, String deptName) {
        super(name, natInsNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
