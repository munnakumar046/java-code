/**
 * Pararmetrized
 */
class Employee
{
    private int empId;
    private String empName;
    private double empSal;

    public Employee(int empId,String empName,double empSal) // constructor
    {
        this.empId=empId;
        this.empName=empName;
        this.empSal=empSal;
    }
    public void getEmployeeDetail() //method
    {
        System.out.println("employee Id:"+ empId);
        System.out.println("employe Name:"+ empName);
        System.out.println("employe Salary:"+ empSal);

    }
}
public class Pararmetrized 
{
    public static void main(String[] args) {
        Employee e=new Employee(146, "munna", 30000d);  
        e.getEmployeeDetail();
    }
    
}