
//КЛАСА В КОЙТО СЕ СЛУЧВА МАГИЯТА

//ИМПОРТИРАМЕ СИ НЯКОИ БИБЛИОТЕЧКИ, КАТО ЗА РАБОТА СЪС СПИСЪЦИ
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Това е списък, структура от данни, която ще съхранява нашите хора
        // Списъка е на абстрактно ниво
        // От тип Person, за да може да направим поломорфизъм и да ги обединим в една колекция
        List<Person> personList = new ArrayList<>();

        // създавам обекти от моите учители и студенти
        // отново на абстрактно ниво Person, зашото мене ме интересува да създам човек, после решавам какъв ще е
        Person s1 = new Student("Atanas", "7598327556", "5366436", 25);
        Person s2 = new Student("Michael", "7598327556", "5366436", 34);
        Person t1 = new Teachers("John", "7598327556", "5366436", 35);
        Person t2 = new Teachers("Kevin", "7598327556", "5366436", 6);

        //Добавям ги в списъка си
        personList.add(s1);
        personList.add(s2);
        personList.add(t1);
        personList.add(t2);

        //Правя си два брояча за броене
        int teacherCount = 0;
        int studentCount = 0;
        //Цикъл foreach, който ще мине от първия до последняи елемент на списъка ми
        /*
        Вътре правя проверка от какъв тип е с instanceof
        Проверява дали примерно е Student и влиза в следващата проверка, където проверява дали годините са над 25 години
        и извежда информацията от toStrinc() за студента и увеличава брояча с единица, и принцира нов ред за разделение
        (Student) person).getYears() - това е костване на обекти, тежка операция, но се прави при изключения
        Преобразувам обект от тип Person до обект от тип Student
        Така същото го правя и с Teachers
         */
        for (Person person : personList) {
            if(person instanceof Student){
                if(((Student) person).getYears() > 25){
                    System.out.println(person);
                    studentCount++;
                    System.out.println();
                }
            } else if(person instanceof Teachers){
                if(((Teachers) person).getInternship() > 30){
                    System.out.println(person);
                    teacherCount++;
                    System.out.println();
                }
            }
        }
        //Тук мисля, че е ясно, принтирам броя чрез форматирано принтиране и извеждам нов ред
        System.out.printf("The count of teachers with more than 30 years internship are: %d", teacherCount).println();
        System.out.printf("Thi count of students older than 25 are: %d", studentCount).println();
        System.out.println();


        //принтирам всички от списъка
        System.out.println("All people in the collection! ->");
        for (Person person : personList) {
            System.out.println(person);
            System.out.println();
        }
    }
}
