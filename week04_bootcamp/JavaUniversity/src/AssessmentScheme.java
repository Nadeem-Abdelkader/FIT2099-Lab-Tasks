import java.util.ArrayList;

public class AssessmentScheme {
    private ArrayList<Assessment> assessmentArrays = new ArrayList<>();

    public static ArrayList<Assessment> getAssessmentArrays()
    {
        return assessmentArrays;
    }

    public void addAssessment(Assessment newAssessment)
    {
        assessmentArrays.add(newAssessment);
    }

}
