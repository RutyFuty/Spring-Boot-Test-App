package rutyfuty.springboottestapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rutyfuty.springboottestapp.model.Student;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //SELECT * FROM student WHERE email = ?;
//    @Query("select s from Student s where s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

}
