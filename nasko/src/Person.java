import java.util.ArrayList;
import java.util.List;

public abstract class Person {

    String name;
    String EGN;


    public Person(String name, String EGN) {
        this.setName(name);
        this.setEGN(EGN);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getEGN() {
        return EGN;
    }

    private void setEGN(String EGN) {
        this.EGN = EGN;
    }

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
