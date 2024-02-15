public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmpId(101);
        System.out.println("Employee id: " + emp.getEmpId());

        emp.setName("Assanali");
        System.out.println("Employee name: " + emp.getName());

        emp.setSalary(1000000);
        System.out.println("Employee salary: " + emp.getSalary());

        emp.setSsn("012-1240214");
        System.out.println("Employee ssn: "+ emp.getSsn());

    }
}

class Employee {
    int empId;
    String name, ssn;
    double salary;

//    Constructor
    public Employee(){}

    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}