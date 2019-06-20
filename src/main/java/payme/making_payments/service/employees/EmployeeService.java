package payme.making_payments.service.employees;

import payme.making_payments.dao.employees.Employee;

import java.util.List;

public interface EmployeeService {

    void create(Employee employee);

    void update(Employee employee);

    void deleteById(Integer id);

    Employee getById(Integer id);

    List<Employee> getList();

}
