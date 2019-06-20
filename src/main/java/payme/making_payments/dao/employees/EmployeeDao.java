package payme.making_payments.dao.employees;

import java.util.List;

public interface EmployeeDao {

    void create(Employee employee);

    void update(Employee employee);

    void deleteById(Integer id);

    Employee getById(Integer id);

    List<Employee> getList();

}
