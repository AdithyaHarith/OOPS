package oops.inherit;

public class EmployeeDemo {
    public static void main(String[] args) {

       EmployeeParent ep = new EmployeeParent();
        System.out.println(ep.calculateSalary());

        EmployeeChild ec = new EmployeeChild();
        System.out.println(ec.calculateSalary());



    }
}
