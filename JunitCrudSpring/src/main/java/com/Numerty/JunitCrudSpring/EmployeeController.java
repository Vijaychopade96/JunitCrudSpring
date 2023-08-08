package com.Numerty.JunitCrudSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private Service service;

    @PostMapping("/save")
    public Employee save(Employee employee){
        return service.saveEmployee(employee);
    }
    @GetMapping("/list")
    public List<Employee>All(){
        return service.getList();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Long id){
        service.deleteEmployee(id);
    }



}
