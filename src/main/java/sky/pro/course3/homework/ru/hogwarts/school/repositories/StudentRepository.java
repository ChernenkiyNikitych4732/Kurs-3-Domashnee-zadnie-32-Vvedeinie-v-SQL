package sky.pro.course3.homework.ru.hogwarts.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sky.pro.course3.homework.ru.hogwarts.school.model.Student;

import java.util.Collection;

public interface StudentRepository extends JpaRepository <Student, Long> {

    Collection<Student> findStudentsByAge(int age);
    Collection<Student> findStudentsByAgeBetween(int startAge, int endAge);
}
