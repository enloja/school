import dao.StudentService;
import student.Student;

public class SchoolController {

    public static void main(String[] args){


        StudentService service = new StudentService();


        Student eddy = new Student("Gaspard", "Eddy", 53, "24-01-1985");
        service.showLastName(eddy);
        service.showFullName(eddy);

    }


}
