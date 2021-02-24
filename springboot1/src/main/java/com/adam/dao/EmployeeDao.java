package com.adam.dao;

import com.adam.pojo.Department;
import com.adam.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;

    static{
        employees = new HashMap<Integer, Employee>();
        employees.put(101, new Employee(1001,"AA","a123@qq.com",0,new Department(101,"教学部")));
        employees.put(102, new Employee(1002,"BB","b123@qq.com",1,new Department(101,"市场部")));
        employees.put(103, new Employee(1003,"CC","c123@qq.com",0,new Department(101,"教研部")));
        employees.put(104, new Employee(1004,"DD","d123@qq.com",1,new Department(101,"运营部")));
        employees.put(105, new Employee(1005,"EE","e123@qq.com",0,new Department(101,"后勤部")));
    }

    private static Integer initId=1006;

    public void save(Employee employee){
        if (employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        employees.put(employee.getId(),employee);
    }

    public Collection<Employee> getAll(){
        return  employees.values();
    }

    public Employee getEmployeeById(Integer id){
        return  employees.get(id);
    }

    public void delete(Integer id){
        employees.remove(id);
    }


}
