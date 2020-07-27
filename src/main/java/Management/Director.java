package Management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String nationalInsuranceNumber, double salary, String deptName, double budget)
    {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus() {
        this.salary += (salary*0.02);
        return this.salary;
    }

}


