package student;

public class Student {

    // declarations des variables
    String lastName;
    String firstName;
    int age;
    String birthday;


    // creation du constructeur
    public Student (String lastName, String firstName, int age, String birthday) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.birthday = birthday;
    }



    public String getLastName(){
        return  lastName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void saveStudent (){

    }
}
