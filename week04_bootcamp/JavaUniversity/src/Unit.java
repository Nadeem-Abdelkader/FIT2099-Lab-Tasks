import java.util.ArrayList;

public class Unit {
    ArrayList<String> enrolledStudents = new ArrayList<String>();
    String unit_code;
    String unit_name;

    public Unit(String unit_code, String unit_name) {
        this.unit_code = unit_code;
        this.unit_name = unit_name;
    }

    public String description(){
        return unit_code + " " + unit_name;
    }
    public Student[] returnStudents(University university)
    {

        Student[] array = new Student[enrolledStudents.size()];

        for(int i = 0; i<enrolledStudents.size();i++)
        {
            if(university.getStudents().containsKey(enrolledStudents.get(i)))
            {
                array[i] = university.getStudents().get(enrolledStudents.get(i));
            }
        }
        return array;
    }
    public void enrolStudent(String newStudentId) {
        enrolledStudents.add(newStudentId);
    }


}
