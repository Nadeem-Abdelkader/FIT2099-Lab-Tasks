import java.util.ArrayList;

public class Unit {
    ArrayList<Student> students = new ArrayList<>();
    String unit_code;
    String unit_name;

    public Unit(String unit_code, String unit_name) {
        this.unit_code = unit_code;
        this.unit_name = unit_name;
    }

    public String description(){
        return unit_code + " " + unit_name;
    }

    public void enrolStudent(Student newStudent) {
        students.add(newStudent);
    }

}
