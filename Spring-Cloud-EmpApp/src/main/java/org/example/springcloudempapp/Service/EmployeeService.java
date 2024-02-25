package org.example.springcloudempapp.Service;

import org.example.springcloudempapp.Entities.Employee;
import java.util.List;

public class EmployeeService {
    public List<Employee>getAll();
    public Employee addEmployee(Employee employee);
    public Employee deleteEmployee(int id);
    public Employee updateEmployee(int id, Employee employee);
    public Employee getEmployeeId(int id);
    public Employee getEmployeeByEmailId(String email);

}
