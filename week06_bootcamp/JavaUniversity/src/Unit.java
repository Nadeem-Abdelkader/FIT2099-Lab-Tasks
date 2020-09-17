import java.util.ArrayList;
/**
 * Creates a Unit object
 */
public class Unit {
    private ArrayList<String> enrolledStudents = new ArrayList<>();
    private String unit_code;
    private String unit_name;
    static int counter;
    private AssessmentScheme AssessmentScheme = new AssessmentScheme();

    /**
     * Constructor function for the Unit class
     * @param unit_code - the unit's code
     * @param unit_name - the unit's name
     */
    public Unit(String unit_code, String unit_name) {
        this.unit_code = unit_code;
        this.unit_name = unit_name;
        counter += 1;
    }

    /**
     * getter function for enrolledStudents
     * @return enrolledStudents
     */
    public ArrayList<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    /**
     * @return - string describing an Units's code and name
     */
    public String description(){
        return "\n" + unit_code + "- " + unit_name;
    }

    /**
     * getter function for students at university that take this unit
     * @return array of the students in the university that take this unit
     */
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
    /**
     * enrolls student in the unit
     */
    public void enrolStudent(String newStudentId) {
        enrolledStudents.add(newStudentId);
    }

    /**
     * calculates total marks for a student
     * @return total marks for a student
     */
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
    /**
     * getter function for AssessmentScheme
     * @return AssessmentScheme
     */
    public AssessmentScheme getAssessment()
    {
        return AssessmentScheme;
    }


}
