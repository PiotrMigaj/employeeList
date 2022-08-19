package pl.migibud;

import java.util.List;

public interface EmployeeRepository {
	public List<Employee> findAll();
	public Employee save(Employee employee);

	public List<Employee> findAllByOrderByFirstNameAsc();
}
