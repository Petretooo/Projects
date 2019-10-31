import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        Person s1 = new Student("Atanas", "7598327556", "5366436", 25);
        Person s2 = new Student("Michael", "7598327556", "5366436", 34);
        Person t1 = new Teachers("John", "7598327556", "5366436", 35);
        Person t2 = new Teachers("Kevin", "7598327556", "5366436", 6);

        personList.add(s1);
        personList.add(s2);
        personList.add(t1);
        personList.add(t2);


        int teacherCount = 0;
        int studentCount = 0;
        for (Person person : personList) {
            if(person instanceof Student){
                if(((Student) person).years > 25){
                    System.out.println(person);
                    studentCount++;
                    System.out.println();
                }
            } else if(person instanceof Teachers){
                if(((Teachers) person).internship > 30){
                    System.out.println(person);
                    teacherCount++;
                    System.out.println();
                }
            }
        }
        System.out.printf("The count of teachers with more than 30 years internship is: %d", teacherCount).println();
        System.out.printf("Thi count of students older than 25 is: %d", studentCount).println();
        System.out.println();


        System.out.println("All people in the collection! ->");
        for (Person person : personList) {
            System.out.println(person);
            System.out.println();
        }
    }
}
