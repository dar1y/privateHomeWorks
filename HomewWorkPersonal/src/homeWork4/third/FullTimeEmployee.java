package homeWork4.third;

public class FullTimeEmployee extends Employee{
    double monthlySalary;
    @Override
    void calculateSalary() {
        System.out.println("the salary of the employee: " + name + " is " + monthlySalary + " dollars");
    }

    public FullTimeEmployee(String name,double monthlySalary) {
        super.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                '}';
    }
}
