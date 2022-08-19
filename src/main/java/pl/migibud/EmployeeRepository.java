package pl.migibud;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
	public List<Employee> findAll();
	public Employee save(Employee employee);

	public List<Employee> findAllByOrderByFirstNameAsc();

	public Optional<Employee> findById(Integer id);
	void deleteById(Integer id);
}
