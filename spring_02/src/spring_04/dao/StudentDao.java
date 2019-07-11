package spring_04.dao;

import spring_04.entity.Student;

public interface StudentDao  {

    public void insertStudent(Student student);

    public void deleteStudentById(Integer id);

    public void updateStudent(Student student);

    public Student queryStudentById(Integer id);

}
