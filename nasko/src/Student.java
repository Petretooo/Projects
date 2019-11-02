/*
Ще обясня само този клас, от двата класа Student и Teacher, защото другия е същия, но с други полета
Student наследява Person след което е задължен да инциализира бащиния клас
С extends се извършва наследяване към клас, а към интерфейс е с implements
 */
public class Student extends Person {

    //Полетата на Student
    //Особеното е, че facNumber има някаква стойност, в условието е обяснено да, че по default трябва да е 10101010 и така се получава това, като му го инициализираме предварително
   private String facNumber = "10101010";
   private int years;

   /*
   Съвсем обикновен конструктор с параметри, но има особеност
   super(name, EGN); - както споменах, трябва да инициализираме бащиния клас и именно така получава.
   Викаме конструктора на бащиния клас и му задаваме параметри
   super() трябва винаги да е на ПЪРВИ РЕД, или ще гръбне грешка ведбага при променя и няма да ти позволи компилация
    */
    public Student(String name, String EGN, String facNumber, int years) {
        super(name, EGN);
        this.setFacNumber(facNumber);
        this.setYears(years);
    }

    //гетъри и сетъри, няма да се спирам вече ги написах
    public int getYears() {
        return years;
    }

    private void setYears(int years) {
        this.years = years;
    }

    public String getFacNumber() {
        return facNumber;
    }

    /*
    Този сетър има особеност, има логика
    Ако номера е до 8 символа, ще го сложи, но ако е по-голям от 8 символа ще сложи автоматично дефаутната стойност 10101010
     */
    private void setFacNumber(String facNumber) {
        if (facNumber.length() <= 8) {
            this.facNumber = facNumber;
        }
    }


    //пренаписахме метода - полиморфизъм
    //връща инфорамцията от toString на бащиния клас, но съм го използвал никъде този метод,
    //просто го добавих за цвят да видиш един абстрактен метод какво представлява
    @Override
    protected String getInfo() {
        return super.toString();
    }

    /*
            Същия метод от бащиния клас, но имаме една особеност sb.append(Student.class.getSimpleName());
            Това се нарича РЕФЛЕКШЪН, тук вадя малкото име, така да се изразя на класа, за да се знае при печатането чия информация е
            После има още една особеност sb.append(super.toString());
            Тук викам резултатите от бащиния клас и го слепвам, тоест - name и EGN
         */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Student.class.getSimpleName());
        sb.append(System.lineSeparator());
        sb.append(super.toString());
        sb.append(System.lineSeparator());
        sb.append("FacNumber: " + this.getFacNumber());
        sb.append(System.lineSeparator());
        sb.append("Years: " + this.getYears());
        sb.append(System.lineSeparator());
        return sb.toString().trim();
    }
}
