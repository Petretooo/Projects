import java.util.ArrayList;
import java.util.List;

/*
public abstract class Person - правя абстрактерн клас Person, който ще бъде наследен от другите два класа Student и Teaсher
Защо съм го направил, защото Student и Teaсher имат нещо общо, нещо което задължително трябва да съдържат и това е име и ЕГН.
Абстрактния клас ще ги накара задължително да имплементират логиката.
 */
public abstract class Person {

    //Това са глобални променливи или член фунцкии или полета, има много синоними. Те дефинират променливите на две характеристики на дадения човек Името и ЕГН
    private String name;
    private String EGN;


    /*
    public Person(... - е конструктор, той създава обект от този клас. Моя конструктор е с два параметъра, за да могат да инициализират името и егенето
    с this. застъпваме член-функциите, полетата по-горе, за да знае компилатор какво имаме предвид
     */
    public Person(String name, String EGN) {
        this.setName(name);
        this.setEGN(EGN);
    }

    // Всички методи, които започват с get.. като getName, getEGN.. се наричат гетъри те не правят нищо друго освен да върнат резултат или при извикването на getEGN, да върне ЕГН
    // Те са публични, за да могат да се извикват извън класа
    public String getName() {
        return name;
    }

    //Всички методи, които започват с set.. като setName, setEGN.. се наричат сеетъри, те инициализират полетата над конструктора.
    //Те имат един параметър само името и задават това име на глобалната променлива
    //Те са private, за да запазя добра капсулация, за да не се извиквакват отвън и да се променят, защото това не би трябва да бъде позволено да се променя ЕГН-то примерно
    private void setName(String name) {
        this.name = name;
    }

    public String getEGN() {
        return EGN;
    }

    private void setEGN(String EGN) {
        this.EGN = EGN;
    }

    //абстрактен метод с модификатор protected, за да го виждат само децата на този клас за връшане на информация.
    protected abstract String getInfo();

    /*
    Това е по-интересния метод, той е пренаписан (override) от големия клас Object, това се наричва Dynamic (run-time) POLYMORPHISM
    Този метод служи да изведе после информацията за всекя личност
    В него съм направил един обект от StringBuilder, за да конкатенира бързо.
    Тази конкатенация се случва под метод .append() в него поставям какво искам да се слепи.
    .lineSeparator() - слепва един нов ред, това го правя, за да ги разделя с един ред, а не да са на един ред
    После трябва да го върна return....;

            return sb.toString().trim();
            връша  обекта до стринг и с трим() махаме вънпни интервали от двете страни на стринга
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + this.getName());
        sb.append(System.lineSeparator());
        sb.append("EGN: " + this.getEGN());
        sb.append(System.lineSeparator());
        return sb.toString().trim();
    }
}
