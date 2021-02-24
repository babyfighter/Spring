package com.adam.dao;


import com.adam.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {

    private static Map<Integer, Department> deparments = null;

    static{
        deparments = new HashMap<Integer, Department>();
        deparments.put(101, new Department(101, "教学部"));
        deparments.put(102, new Department(102, "市场部"));
        deparments.put(103, new Department(103, "教研部"));
        deparments.put(104, new Department(104, "运营部"));
        deparments.put(105, new Department(105, "后勤部"));
    }

    public Collection<Department> getDeparments(){
        return  deparments.values();
    }

    public Department getDepartmentById(Integer id){
        return  deparments.get(id);
    }
}
