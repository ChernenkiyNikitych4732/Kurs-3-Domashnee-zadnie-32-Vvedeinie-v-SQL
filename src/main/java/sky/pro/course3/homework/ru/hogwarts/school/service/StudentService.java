package sky.pro.course3.homework.ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import sky.pro.course3.homework.ru.hogwarts.school.model.Faculty;
import sky.pro.course3.homework.ru.hogwarts.school.model.Student;
import sky.pro.course3.homework.ru.hogwarts.school.repositories.StudentRepository;

import java.util.Collection;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudent(long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(long id) {

        if (studentRepository.existsById(id)){
            studentRepository.deleteById(id);
        }

    }

    public Collection<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Collection<Student> getStudentByAge(int age) {
        return studentRepository.findStudentsByAge(age);
    }

    public Collection<Student> getStudentByAgeBetween(int startAge, int endAge) {
        return studentRepository.findStudentsByAgeBetween(startAge, endAge);
    }

    public Faculty getFacultyNameByStudentId(long id) {

        Student student = findStudent(id);

        if (student == null) {
            return null;
        }
        return student.getFaculty();
    }

}
