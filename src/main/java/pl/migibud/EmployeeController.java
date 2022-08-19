package pl.migibud;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

	private final EmployeeRepository repository;

	@GetMapping("/list")
	public String listEmployees(Model theModel){
		theModel.addAttribute("employees",repository.findAllByOrderByFirstNameAsc());
		return "employees/list-employees";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model){
		Employee theEmployee = new Employee();
		model.addAttribute("employee",theEmployee);
		return "employees/employee-form";
	}


	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") Integer theId,Model theModel){
		Employee theEmployee = repository.findById(theId).get();
		theModel.addAttribute("employee",theEmployee);
		return "employees/employee-form";

	}

	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") Integer theId){
		repository.deleteById(theId);
		return "redirect:/employees/list";

	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
		repository.save(theEmployee);
		return "redirect:/employees/list";
	}

}
