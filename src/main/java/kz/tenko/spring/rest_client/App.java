package kz.tenko.spring.rest_client;

import kz.tenko.spring.rest_client.configuration.MyConfig;
import kz.tenko.spring.rest_client.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();  // all
//        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(9);  // one
//        System.out.println(empById);

//        Employee emp = new Employee("fff", "ddd", "yyy", 100);   // save
//        emp.setId(12);
//        communication.saveEmployee(emp);


        communication.deleteEmployee(12);    // delete
    }
}
