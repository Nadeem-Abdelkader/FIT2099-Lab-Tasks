import java.util.ArrayList;

public class Unit {
    //
    private ArrayList<String> enrolledStudents = new ArrayList<>();
    private String unit_code;
    private String unit_name;
    static int counter;
    //
    private AssessmentScheme AssessmentScheme = new AssessmentScheme();


    public ArrayList<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public Unit(String unit_code, String unit_name) {
        this.unit_code = unit_code;
        this.unit_name = unit_name;
        counter += 1;
    }

    public String description(){
        return "\n" + unit_code + "- " + unit_name;
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
    //
    public int totalMarks(Student student)
    {
        int totalMarks = 0;
        double tempoInt;
        double tempoInt1;
        double divide = 100.0;
        for(int i =0; i<AssessmentScheme.getAssessmentArrays().size();i++)
        {

            Assessment assessment = AssessmentScheme.getAssessmentArrays().get(i);
            if(assessment.getMarks().containsKey(student.getStudentID()))
            {
                tempoInt = (assessment).getWeight();
                tempoInt = (tempoInt/divide);
                tempoInt1 =(assessment.getMarks().get(student.getStudentID()).getMarkTotal());
                totalMarks += (int)(tempoInt * tempoInt1);
            }

        }
        return totalMarks;
    }
    public AssessmentScheme getAssessment()
    {
        return AssessmentScheme;
    }


}
