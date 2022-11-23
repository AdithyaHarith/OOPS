package oops.inherit;

public class EmployeeChild extends EmployeeParent {

    public int calculateSalary() { // overrides parent method
        int basicPay=30000;
        int netPay=basicPay-1000;
        return netPay;
    }


}
