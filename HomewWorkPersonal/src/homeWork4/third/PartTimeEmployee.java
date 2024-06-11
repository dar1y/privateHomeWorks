package homeWork4.third;

public class PartTimeEmployee extends Employee{
    double hourlyRate;
    double hoursInWeekWorked;
    @Override
    void calculateSalary() {
        System.out.println("the salary of the employee: " + name + " is " + hoursInWeekWorked * hourlyRate * 4 + " dollars");
    }

    public PartTimeEmployee(String name,double hourlyRate, double hoursWorked) {
        super.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursInWeekWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursInWeekWorked +
                ", name='" + name + '\'' +
                '}';
    }
}
