package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNumber;
    protected double salary;

    public Employee(String name, String nationalInsuranceNumber, double salary) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String setName(String newName) {
        if (newName != "") { this.name = newName;}
        return this.name;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double salaryIncrease) {
        if (salaryIncrease > 0) {this.salary += salaryIncrease;}
        return this.salary;
    }

    public double payBonus() {
        this.salary += (salary*0.01);
        return this.salary;
    }

}