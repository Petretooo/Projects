public class Teachers extends Person {

    String department;
    int internship;

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
