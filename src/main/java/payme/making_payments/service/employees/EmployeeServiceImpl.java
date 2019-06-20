package payme.making_payments.service.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import payme.making_payments.dao.employees.Employee;
import payme.making_payments.dao.employees.EmployeeDao;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
        return this;
    }

    @Override
    public void create(Employee employee) {
        employeeDao.create(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public void deleteById(Integer id) {
        employeeDao.deleteById(id);
    }

    @Override
    public Employee getById(Integer id) {
        return employeeDao.getById(id);
    }

    @Override
    public List<Employee> getList() {
        return employeeDao.getList();

    }
}
