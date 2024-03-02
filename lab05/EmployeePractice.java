
public class EmployeePractice {
    public static void main(String[] args) {
        Engineer eng = new Engineer(101,"Jane Smith", "012-34-5678", 120_345.27);
        Manager man = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Admin adm = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
        printEmployee(eng);
        printEmployee(man);
        printEmployee(adm);
        printEmployee(dir);

        eng.setName("Barbara Johnson-Smythe");
        eng.raiseSalary(10_000.00);
        printEmployee(eng);
    }
    public static void printEmployee (Employee emp){
        System.out.println();
        System.out.println("Employee id:          " + emp.getEmpId());
        System.out.println("Employee name:        " + emp.getName());
        System.out.println("Employee Soc Sec #:   " + emp.getSsn());
        System.out.println("Employee salary:      " + emp.getSalary());
    }
}

class Employee{
    private int empId;
    private String name;
    private String ssn;
    private  double salary;

    public Employee(int empId, String name, String ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseSalary(double increase){
        salary += increase;
    }
}

class Manager extends Employee{
    private String debtName;
    public Manager(int empId, String name, String ssn, double salary, String deptName){
        super(empId,name,ssn,salary);
        this.debtName = deptName;
    }

    public String getDebtName() {
        return debtName;
    }
}
class Engineer extends Employee{
    public Engineer(int empId, String name, String ssn, double salary){
        super(empId,name,ssn,salary);
    }
}
class Admin extends Employee{
    public Admin(int empId, String name, String ssn, double salary){
        super(empId,name,ssn,salary);
    }
}

class Director extends Manager{
    private double budget;
    public Director(int empId, String name, String ssn, double salary, String deptName, double budget){
        super(empId,name,ssn,salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}