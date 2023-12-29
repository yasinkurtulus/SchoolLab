import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class DepartmentSystem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number Of Departments:");
        int dCount=input.nextInt();
        Department[] departments = new Department[dCount];
        for (int j=0;j<dCount;j++) {
            System.out.println("Enter Department Name "+(j+1)+":");
            String dname = input.nextLine();
            input.nextLine();
            System.out.println("Enter Employee Number:");
            int eCount = input.nextInt();
            Employee[] employees = new Employee[eCount];
            for (int i = 0; i < eCount; i++) {
                System.out.println("Enter id for employee " + (i+1));
                int id = input.nextInt();
                System.out.println("Enter name employee " + (i+1));
                String name = input.next();

                employees[i] = new Employee(id, name);
            }
             departments[j]=new Department(dname,employees);

        }
        for (int i=0;i<dCount;i++){
            departments[i].print();
        }



    }



}
class Employee{
int id;
String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printEmployee(){
        System.out.println("Employee Id:"+getId());
        System.out.println("Employee Name:"+getName());
    }
}
class Department{
 static int departmentCount=0;
        int departmentid;
        String departmantName;
        Employee[] employees;

    public Department(String departmantName, Employee[] employees) {
        departmentCount++;
        departmentid = departmentCount;
        this.departmantName = departmantName;
        this.employees = employees;
    }

    public String getDepartmantName() {
        return departmantName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    public  void print(){
        System.out.println("Departmant id:"+departmentid);
        System.out.println("Departmant name:"+departmantName);
        System.out.println("Number Of Emoloyees:"+employees.length);
        System.out.println("List Of Employees:");
        for (int i=0;i<employees.length;i++){
            employees[i].printEmployee();
        }

    }
}
