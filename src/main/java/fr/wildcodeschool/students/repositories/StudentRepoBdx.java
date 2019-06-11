package fr.wildcodeschool.students.repositories;

import fr.wildcodeschool.students.interfaces.StudentDao;
import fr.wildcodeschool.students.models.Student;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class StudentRepoBdx implements StudentDao {
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jean-Jacques"));
        students.add(new Student("Marise"));
        students.add(new Student("Louis-Marie"));
        return students;
    }
}