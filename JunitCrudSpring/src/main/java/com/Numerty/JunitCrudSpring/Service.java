package com.Numerty.JunitCrudSpring;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private EmployeeRepository repository;
    public Employee saveEmployee(Employee employee){
        return repository.save(employee);
    }

    public List<Employee> getList(){
        return repository.findAll();
    }

    public void deleteEmployee(Long id){
        repository.deleteById(id);

    }


}
