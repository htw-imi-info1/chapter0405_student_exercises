
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ExampleData
{   
    public List<Student> generateStudents(){
        ArrayList<Student> students = new ArrayList<>();
        
        String[] names = {"Davis Caffee", "Hyacinth Harvison", "Chong Heflin", "Eladia Mccafferty", "An Diggins", "Vivien Boulton", "Brenda Macken", "Lang Elser", "Cleta Familia", "Marcelle Bonomo", "Cammy Vicknair", "Mauricio Verdin", "Maryalice Milliken", "Sarina Basil", "Lakendra Summey", "Chester Tait", "Chase Bushey", "Arlette Plaza", "Zaida Mcglamery", "Haley Woodworth", "Hermina Schwandt", "Horace Keen", "Eusebio Gabourel", "Lauri Noe", "Magali Gaitan", "Josie Orlowski", "Shakita Evert", "Johnathon Nordin", "Georgann Chattin", "Yung Burkitt"};
        int[] semester = {1, 8, 6, 10, 3, 5, 5, 5, 9, 1, 2, 5, 10, 9, 1, 7, 8, 10, 2, 10, 3, 2, 6, 1, 10, 2, 4, 4, 1, 2};
        int[] birthyears = {1984,1996,1988,1986,1990,1986,1990,1995,1990,1995,1987,1980,1990,1999,1983,1997,1998,1991,1993,1991,1981,1997,1981,1999,1986,1995,1993,2000,1990,1982};
        int[] matrikel = {566544,568725,567592,568562,566205,566512,565108,565027,565172,567914,568925,568866,567398,565297,568249,567934,568562,565228,567714,566106,567326,568100,568500,566898,567247,567625,567552,565525,566976,568855};
        
        for (int i = 0; i < 30; i++) {
            students.add(new Student(names[i], semester[i], birthyears[i], matrikel[i]));
        }
        
        return students;
    }
}
