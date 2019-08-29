package tws.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Employee;
import tws.mapper.EmployeeMapper;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> list = employeeMapper.getAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<List<Employee>> addEmployee(@RequestBody Employee employee) {

        return ResponseEntity.created(null).build();
    }
    /*@PutMapping(consumes = "application/json")
    public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee employee) {
        list.add(5,employee);
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Employee>> updateEmployee(@PathVariable int id) {
        Employee employee = null;
        for(Employee e:list){
            if(e.getId() == id){
                employee = e;
            }
        }
        list.remove(employee);
        return ResponseEntity.ok(list);
    }*/
}
