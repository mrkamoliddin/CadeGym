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
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
    public String editEmployee(@PathVariable("id") Integer id, Model model){
        model.addAttribute("employee", employeeService.getById(id));
        return "edit_employee";
    }

    @PostMapping("/edit")
    public String submitEdition( Model model, Employee employee){
        employeeService.update(employee);
        model.addAttribute("empList", employeeService.getList());
        return "employeePage";
    }

    @GetMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id, Model model){
        employeeService.deleteById(id);
        model.addAttribute("empList", employeeService.getList());
        return "employeePage";
    }

    public static void main(String[] args) {
        int[] array = {1,23,12,234,54,12,123,-123,1};
        for (int i = 0; i < array.length - 1; i++){
            for (int k = 0; k < array.length - 1 - i; k++){
                if (array[k] > array[k+1]){
                    int temp = array[k];
                    array[k] = array[k+1];
                    array[k+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array,-123));;
        }
    }