package com.SpringApi.SpringApi.Repository;

import com.SpringApi.SpringApi.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
