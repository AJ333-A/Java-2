import java.util.Scanner;

//main class
public class Mainapp {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter name: ");
            String name = scn.nextLine();
            System.out.println("Enter salary: ");
            double salary = scn.nextDouble();
            scn.nextLine(); // consume the leftover newline
            Employee e = new Employee(name, salary);
            e.displayDetails();
            SalaryCalculator calculator = new SalaryCalculator();
            calculator.calculateBonus(e);
           
        }
    }
}


//first class
class Employee{
    String name;
    double salary ;
    //constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;}

        public void displayDetails(){
            System.out.println("Name: "+name);
    System.out.println("Salary: "+salary);
    }
}
//second class
class SalaryCalculator{
    //method
    public void calculateBonus(Employee employee){
        double bonus = employee.salary * 0.1;
        System.out.println("Bonus: "+bonus);
    }
}
