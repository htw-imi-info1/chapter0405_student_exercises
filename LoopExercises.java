import java.util.List;


public class LoopExercises
{
    List<Student> students;
    
    public LoopExercises() {
        ExampleData exampleData = new ExampleData();
        students = exampleData.generateStudents();
    }
    
}
