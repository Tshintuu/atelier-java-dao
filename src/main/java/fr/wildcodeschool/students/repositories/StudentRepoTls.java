package fr.wildcodeschool.students.repositories;

import fr.wildcodeschool.students.interfaces.StudentDao;
import fr.wildcodeschool.students.models.Student;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class StudentRepoTls implements StudentDao {
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bernard"));
        students.add(new Student("Hoagie"));
        students.add(new Student("Laverne"));
        return students;
    }
}