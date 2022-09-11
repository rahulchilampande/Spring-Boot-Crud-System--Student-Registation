package example.com.practice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.com.practice.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
}
