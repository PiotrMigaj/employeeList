package pl.migibud;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private List<Employee> theEmployees;

	@PostConstruct
	private void loadData(){
		theEmployees = List.of(
			new Employee(1,"Piotr","Migaj","pmigaj@gmail.com"),
			new Employee(2,"Anna","Migaj","amigaj@gmail.com"),
			new Employee(3,"Barbara","Migaj","bmigaj@gmail.com")
		);
	}

	@GetMapping("/list")
	public String listEmployees(Model theModel){
		theModel.addAttribute("employees",theEmployees);
		return "list-employees";
	}

}
