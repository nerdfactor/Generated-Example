package eu.nerdfactor.springutil.generatedexample.repository;

import eu.nerdfactor.springutil.generatedexample.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Employees.<br>
 * A very simple {@link CrudRepository} that will just be able to access data.
 * The controller won't be able to provide sorting and filtering.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
