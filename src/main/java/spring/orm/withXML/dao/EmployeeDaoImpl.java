package spring.orm.withXML.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import spring.orm.withXML.entities.Employee;

public class EmployeeDaoImpl{

	private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public void insert(Employee e) {
        int r = (int) hibernateTemplate.save(e);
        System.out.println(r+" row inserted");
    }
    @Transactional
    public void deleteById(int id) {
    	Employee e = hibernateTemplate.get(Employee.class, id);
    	hibernateTemplate.delete(e);    	
    }
    @Transactional
    public void update(Employee e) {
    	hibernateTemplate.update(e);
    }
    
    public Employee getEmployee(int id) {
    	Employee e = hibernateTemplate.get(Employee.class, id);
    	return e;
    }

    public List<Employee> getAllEmployee() {
    	List<Employee> e = hibernateTemplate.loadAll(Employee.class);
    	return e;
    }
}
