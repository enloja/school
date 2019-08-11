package dao;

import student.Student;

public class StudentService implements StudentInterfaceDao {

    @Override
    public void showLastName(Student student) {

        if(student.getLastName()== null){
            System.out.println("The last Name is empty");
        }
        else {
            System.out.println(student.getLastName());
        }
    }

    @Override
    public void showFullName(Student student) {
        System.out.println("LastName : "+ student.getLastName() + ", FirstName: " + student.getFirstName());
    }


}
