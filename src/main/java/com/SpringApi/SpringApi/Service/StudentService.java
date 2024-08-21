package com.SpringApi.SpringApi.Service;

import com.SpringApi.SpringApi.Entity.Student;
import com.SpringApi.SpringApi.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){
        return studentRepo.save(student);

    }

}
