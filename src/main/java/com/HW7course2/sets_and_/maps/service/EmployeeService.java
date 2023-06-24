
package com.HW7course2.sets_and_.maps.service;


import com.HW7course2.sets_and_.maps.employee.Employee;

import com.HW7course2.sets_and_.maps.exception.EmployeeAlreadyAddedInList;

import com.HW7course2.sets_and_.maps.exception.EmployeeNotFoundInList;

import com.HW7course2.sets_and_.maps.exception.EmployeeStorageIsFullList;


import java.util.Collection;


public interface EmployeeService {

    Employee add(String name, String lastName) throws EmployeeStorageIsFullList, EmployeeAlreadyAddedInList;


    Employee remove(String name, String lastName) throws EmployeeNotFoundInList;


    Employee find(String name, String lastName) throws EmployeeNotFoundInList;


    Collection<Employee> getAll();

}
