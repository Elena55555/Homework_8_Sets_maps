
package com.HW7course2.sets_and_.maps.controller;

import com.HW7course2.sets_and_.maps.employee.Employee;

import com.HW7course2.sets_and_.maps.service.EmployeeService;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


import java.util.Collection;



@RestController



@RequestMapping("/employees")





public class EmployeeController {



    @ExceptionHandler({RuntimeException.class})

    public ResponseEntity< String> handleException (Exception e) {

        ResponseEntity<String> responseEntity = new ResponseEntity<String>(e.getMessage(),

                HttpStatus.INTERNAL_SERVER_ERROR);

        System.out.println(responseEntity);



        return responseEntity;

    }



    private  final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



    @GetMapping("/add")


    public Employee addEmployee(


            @RequestParam ("name") String name,


            @RequestParam ("lastName") String lastName


    ) {


        return   employeeService.add(name,lastName);


    }


    @GetMapping("/remove")


    public Employee removeEmployee(


            @RequestParam ("name") String name,


            @RequestParam ("lastName") String lastName


    ) {


        return employeeService.remove(name, lastName);


    }


    @GetMapping("/find")


    public Employee findEmployee(


            @RequestParam ("name") String name,


            @RequestParam ("lastName") String lastName


    ) {


        return employeeService.find(name, lastName);


    }


    @GetMapping("/allEmployees")


    public Collection <Employee>  getAllEmployees() {



        return employeeService.getAll();



    }
}
