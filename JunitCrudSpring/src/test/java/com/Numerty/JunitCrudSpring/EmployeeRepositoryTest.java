package com.Numerty.JunitCrudSpring;




import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest
class EmployeeRepositoryTest {
    @Autowired
    private  EmployeeRepository employeeRepository;





    @Test
    public void saveEmployee() {
   Employee employee=new Employee(21,"Vk","vk","vijay@gmail.com");

        employeeRepository.save(employee);
    }


    @Test
    public void getEmployeeList() {
       Employee employee=new Employee();
       employeeRepository.findAll();
    }
    @Test
    public void deleteEmployee() {
        Employee employee = employeeRepository.findById(2L).get();
        employeeRepository.delete(employee);

    }

    @Test
    public void updateEmployeeTest() {

        Employee employee = employeeRepository.findById(1L).get();

        employee.setEmail("ram@gmail.com");

        Employee employeeUpdated = employeeRepository.save(employee);

        Assertions.assertThat(employeeUpdated.getEmail()).isEqualTo("ram@gmail.com");


    }

    }