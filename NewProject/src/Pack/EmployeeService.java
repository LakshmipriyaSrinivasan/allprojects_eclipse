package Pack;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;
	
	public void insert(Employee e) {
		dao.insert(e);
	}
	public void delete(Employee e) {
		dao.delete(e);
	}
	public void updateName(String name,int id) {
		dao.updateName(name,id);
	}
	public void updateSalary(double salary,int id) {
		dao.updateSalary(salary,id);
	}
	public void updateDesignation(String designation,int id) {
		dao.updateDesignation(designation,id);
	}
	public List<Employee> display() {
		return dao.display();
	}
}

	
	
	
