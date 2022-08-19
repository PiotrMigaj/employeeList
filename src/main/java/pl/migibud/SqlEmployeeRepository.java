package pl.migibud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SqlEmployeeRepository extends EmployeeRepository, JpaRepository<Employee,Integer>{
}
