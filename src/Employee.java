import java.util.Objects;
public class Employee {
    private Name fullName;
    private int  departmentNumber;
    private double salary;
    static int id = 0;

    public Employee(Name fullName,int  departmentNumber,double salary){
        this.fullName = fullName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        id++;
    }
    public Name getFullName(){
        return this.fullName;
    }
    public int getDepartmentNumber(){
        return this.departmentNumber;
    }
    public void setDepartmentNumber(int departmentNumber){
        this.departmentNumber = departmentNumber;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника : " + fullName + " ; " + " номер отдела сотрудника : "  + departmentNumber + " ; " +  " размер зп сотрудника в месяц : " + salary ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentNumber == employee.departmentNumber && Double.compare(employee.salary, salary) == 0 && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName,departmentNumber, salary, id);
    }




}
