//СЪЩОТО КАТО ПРИ STUDENT, НО С ДРУГИ ПОЛЕТА

public class Teachers extends Person {

    private String department;
    private int internship;

    public Teachers(String name, String EGN, String department, int internship) {
        super(name, EGN);
        this.setDepartment(department);
        this.setInternship(internship);
    }

    public String getDepartment() {
        return department;
    }

    private void setDepartment(String department) {
        this.department = department;
    }

    public int getInternship() {
        return internship;
    }

    private void setInternship(int internship) {
        this.internship = internship;
    }


    @Override
    protected String getInfo() {
        return super.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Student.class.getSimpleName());
        sb.append(System.lineSeparator());
        sb.append(super.toString());
        sb.append(System.lineSeparator());
        sb.append("Department: " + this.getDepartment());
        sb.append(System.lineSeparator());
        sb.append("Internship: " + this.getInternship());
        sb.append(System.lineSeparator());
        return sb.toString().trim();
    }
}
