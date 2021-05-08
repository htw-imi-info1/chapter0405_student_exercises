
/**
 * Class Representing a Student at HTW Berlin.
 *
 * @author Barne Kleinen
 */
public class Student
{
    private String name;
    private int semester;
    private int yearOfBirth;
    private int enrolmentNumber;

    public Student(String name, int semester, int yearOfBirth, int enrolmentNumber)
    {
        this.name = name; 
        this.semester = semester;
        this.yearOfBirth = yearOfBirth;
        this.enrolmentNumber = enrolmentNumber;
    }

    public String getName(){
        return name;
    }

    public int getSemester(){
        return semester;
    }

    public int getYearOfBirth(){ 
        return yearOfBirth;
    }

    public int getEnrolmentNumber(){
        return enrolmentNumber;
    }
    
    public String getDescription(){
        return getName() + " (" + getEnrolmentNumber() + ")";
    }

}
