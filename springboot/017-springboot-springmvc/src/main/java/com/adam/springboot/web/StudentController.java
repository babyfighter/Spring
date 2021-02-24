package com.adam.springboot.web;


import com.adam.springboot.mode.Student;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController//相当于控制层类上加@Controller +方法上加@ResponseBody
//当前控制层类中所有方法返回对象都是JSON

public class StudentController {
    @RequestMapping(value = "/student")
//    @ResponseBody
    public Object student(){
        Student student = new Student();
        student.setId(1001);
        student.setName("zhangsan");
        return student;
    }

    //该方法请求方式支持get和post
    @RequestMapping(value = "/queryStudentById")
    public Object queryStudentById(Integer id){
        Student student = new Student();
        student.setId(id);
        return  student;
    }

//    @RequestMapping(value = "/queryStudentById2", method = RequestMethod.GET)
    @GetMapping(value = "/queryStudentById2")//相当于上面一句话，只接受get请求
    //该注解再查询数据时使用
    public Object queryStudentById2(){
        return "only GET Method";
    }

//    @RequestMapping(value = "/queryStudentById3",method = RequestMethod.POST)
    @PostMapping(value = "/insert")
    //通常在新增数据的时候使用
    public Object insert(){
        return "insert success";
    }

//    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @DeleteMapping(value = "/delete")
    public Object delete(){
        return "delete student";
    }

//    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @PutMapping(value = "/update")
    public Object update(){
        return "update student info";
    }

}

