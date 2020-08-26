import java.util.ArrayList;

public class Unit {
    ArrayList<String> enrolledStudents = new ArrayList<String>();
    String unit_code;
    String unit_name;
    static int counter;


    public Unit(String unit_code, String unit_name) {
        this.unit_code = unit_code;
        this.unit_name = unit_name;
        counter += 1;
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
    public int totalMarks(Student student)
    {
        int totalMarks = 0;
        double tempoInt = 0.0;
        double tempoInt1 = 0.0;
        double divide = 100.0;
        for(int i =0; i<AssessmentScheme.getAssessmentArrays().size();i++)
        {

            Assessment assess = AssessmentScheme.getAssessmentArrays().get(i);
            if(assess.Marks.containsKey(student.getStudentID()))
            {
                tempoInt = (assess).getWeight();
                tempoInt = (tempoInt/divide);
                tempoInt1 =(assess.Marks.get(student.getStudentID()).getMarkTotal());
                totalMarks += (int)(tempoInt * tempoInt1);
            }

        }
        return totalMarks;
    }


}
