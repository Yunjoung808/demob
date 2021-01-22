package com.example.demob.repository;

import com.example.demob.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAll();
    Student findById(Long id);
    Student findByName(String name);
    List<Student> findByNameAndAge (String name, int age);


}
