import java.util.List;


public class StreamExercises
{
    List<Student> students;
    
    public StreamExercises() {
        ExampleData exampleData = new ExampleData();
        students = exampleData.generateStudents();
    }
    
    public int numberOfStudents() {
        return students.size();
    }
}
