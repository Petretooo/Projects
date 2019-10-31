public class Student extends Person {

    String facNumber = "10101010";
    int years;

    public Student(String name, String EGN, String facNumber, int years) {
        super(name, EGN);
        this.setFacNumber(facNumber);
        this.setYears(years);
    }

    public int getYears() {
        return years;
    }

    private void setYears(int years) {
        this.years = years;
    }

    public String getFacNumber() {
        return facNumber;
    }

    private void setFacNumber(String facNumber) {
        if (facNumber.length() <= 8) {
            this.facNumber = facNumber;
        }
    }

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
