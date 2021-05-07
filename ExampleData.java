
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ExampleData
{
    private Random rand = new Random();
    
    public List<Student> generateStudents(){
        ArrayList<Student> students = new ArrayList<>();
        String[] names = {"Davis Caffee", "Hyacinth Harvison", "Chong Heflin", "Eladia Mccafferty", "An Diggins", "Vivien Boulton", "Brenda Macken", "Lang Elser", "Cleta Familia", "Marcelle Bonomo", "Cammy Vicknair", "Mauricio Verdin", "Maryalice Milliken", "Sarina Basil", "Lakendra Summey", "Chester Tait", "Chase Bushey", "Arlette Plaza", "Zaida Mcglamery", "Haley Woodworth", "Hermina Schwandt", "Horace Keen", "Eusebio Gabourel", "Lauri Noe", "Magali Gaitan", "Josie Orlowski", "Shakita Evert", "Johnathon Nordin", "Georgann Chattin", "Yung Burkitt"};
        
        for (String name : names) {
            students.add(new Student(name, randomNumberBetween(1, 10), randomNumberBetween(1980, 2000), randomNumberBetween(565000, 569000)));
        }
        
        return students;
    }
    
    private int randomNumberBetween(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }
}
