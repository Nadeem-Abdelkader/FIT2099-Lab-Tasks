import java.util.ArrayList;

/**
 * Any AssessmentScheme is a collection of assessments (assignments and exams)
 * This class will have any array containing exams and assignments.
 */
public class AssessmentScheme {
    private ArrayList<Assessment> assessmentArrays = new ArrayList<>();

    /**
     * getter function for assessmentArrays
     * @return assessmentArrays
     */
    public ArrayList<Assessment> getAssessmentArrays()
    {
        return assessmentArrays;
    }

    /**
     * This method is used to add and assessment (exam or assignment) to the assesment scheme
     * @param newAssessment - an array containing assignments and exams objects
     * @throws Exception - if new total weightage is greater than 100
     */
    public void addAssessment(Assessment newAssessment) throws Exception {
        int total = 0;
        for (Assessment assessmentArray : assessmentArrays) {
            total += assessmentArray.getWeight();
        }
        if (total + newAssessment.getWeight() > 100){
            throw new Exception("Total weightage is not 100");
        }
        assessmentArrays.add(newAssessment);
        //y
    }
}
