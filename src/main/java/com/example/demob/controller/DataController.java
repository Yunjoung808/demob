package com.example.demob.controller;

import com.example.demob.data.RequestEntity;
import com.example.demob.entity.Student;
import com.example.demob.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DataController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/get-json-data")
    @ResponseBody // list를 브라우저가 읽을 수 있도록 json으로 바꿔줌
    public List<Student> getJsonData(RequestEntity entity){
        System.out.println(entity.getName() + " " + entity.getAge());
        return studentRepository.findByNameAndAge(entity.getName(), entity.getAge());
    }


}
