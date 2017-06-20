/**
 * Created by root on 19.03.17.
 */
import java.io.*;
public class EmployeeTest {

    public static void main(String args[]) {

        Employee empOne = new Employee("Edytka");
        Employee empTwo = new Employee("Lola");

        empOne.empAge(37);
        empOne.empDesignation("degustator");
        empOne.empSalary(1500);
        empOne.printEmployee();

        empTwo.empAge(17);
        empTwo.empDesignation("school girl");
        empTwo.empSalary(987);
        empTwo.printEmployee();
    }
}
