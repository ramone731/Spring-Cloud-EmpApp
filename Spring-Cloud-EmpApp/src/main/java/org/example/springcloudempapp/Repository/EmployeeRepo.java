package org.example.springcloudempapp.Repository;
import org.example.springcloudempapp.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo extends EnableJpaRepositories <Employee, Integer> {
    //declarative prog
    public Employee findByEmail(String email);


}
