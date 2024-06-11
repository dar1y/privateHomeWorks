package homeWork4.third;

public class SalaryMain {
    public static void main(String[] args) {
        FullTimeEmployee david = new FullTimeEmployee("David",3000);
        PartTimeEmployee alicia = new PartTimeEmployee("Alicia", 15,25);
        david.calculateSalary();
        alicia.calculateSalary();
    }
}
