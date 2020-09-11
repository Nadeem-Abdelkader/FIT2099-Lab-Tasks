import java.util.ArrayList;

public class AssessmentScheme {
    private ArrayList<Assessment> assessmentArrays = new ArrayList<>();

    public ArrayList<Assessment> getAssessmentArrays()
    {
        return assessmentArrays;
    }

    public void addAssessment(Assessment newAssessment) throws Exception {
        int total = 0;
        for (Assessment assessmentArray : assessmentArrays) {
            total += assessmentArray.getWeight();
        }
        if (total + newAssessment.getWeight() > 100){
            throw new Exception("Total weightage is not 100");
        }
        assessmentArrays.add(newAssessment);
    }
}
