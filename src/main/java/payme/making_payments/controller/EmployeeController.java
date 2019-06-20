package payme.making_payments.controller;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import payme.making_payments.dao.employees.Employee;
import payme.making_payments.service.employees.EmployeeService;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
        return this;
    }

    @GetMapping("/employee")
    public String showEmployeePage(Model model){
        model.addAttribute("empList", employeeService.getList());
        return "employeePage";
    }

    @GetMapping("/employees/add")
    public String addEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "add_employee";
    }

    @PostMapping("/doregister")
    public String doRegister(Employee employee, Model model){
        employeeService.create(employee);
        model.addAttribute("empList", employeeService.getList());
        return "employeePage";
    }

    @GetMapping("/employees/edit/{id}")
    public String editEmployee(@PathVariable("id") Integer id, Model model ){
        model.addAttribute("employee", employeeService.getById(id));
        return "edit_employee";
    }

    @PostMapping("/edit")
    public String submitEdition( Model model, Employee employee){
        employeeService.update(employee);
        System.out.println(employee.getId());
        model.addAttribute("empList", employeeService.getList());
        System.out.println(employee.toString());
        return "employeePage";
    }

    @GetMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id, Model model){
        employeeService.deleteById(id);
        model.addAttribute("empList", employeeService.getList());
        return "employeePage";
    }
}
