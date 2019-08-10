package dao;

import student.Student;

public class StudentService implements StudentInterfaceDao {

    @Override
    public void showLastName(Student student) {

        System.out.println(student.getLastName());
    }

    @Override
    public void showFullName(Student student) {
        System.out.println("LastName : "+ student.getLastName() + ", FirstName: " + student.getFirstName());
    }

    
}
