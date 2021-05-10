package spring.orm.withXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.orm.withXML.dao.EmployeeDaoImpl;
import spring.orm.withXML.entities.Employee;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/orm/withXML/config.xml");

		EmployeeDaoImpl edao = context.getBean("edao", EmployeeDaoImpl.class);
		Employee e = new Employee(103, "Sourabh", "Sagar");
		// Insert data
		// edao.insert(e);

		// delete data
		//edao.deleteById(103);

		// update row data
		// edao.update(e);

		// get employee by id
		// System.out.println(edao.getEmployee(101));

		// get all employees
		 edao.getAllEmployee().forEach(System.out::println);
	}
}
