package sky.pro.course3.homework.ru.hogwarts.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sky.pro.course3.homework.ru.hogwarts.school.model.Faculty;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Collection<Faculty> findFacultyByNameIgnoreCase(String name);

    Collection<Faculty> findFacultyByColorIgnoreCase(String color);
}
