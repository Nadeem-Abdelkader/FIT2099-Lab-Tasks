/**
 * implements the abstract methods from the parent class (Assessment)
 */
public class Exam extends Assessment {
    private int duration;
    /**
     * constructor for Exam class
     * @param newWeight - weight of exam
     * @param newDuration - duration of exam
     * @throws Exception - if newWeight is greater than 100 or less than 1, or
     * if newDuration is greater than 180 or less than 30
     */
    public Exam(int newWeight, int newDuration) throws Exception {
        setWeight(newWeight);
        setDuration(newDuration);
    }
    /**
     * @return - string describing an exam's duration and weight
     */
    public String description()
    {
        String output;
        output = "Exam : duration " + this.duration + " minutes, weight " + getWeight() + "%";
        return output;

    }
    /**
     * setter function for duration
     * @param newDuration - duartion to be set to
     * @throws Exception - if newDuration is greater than 180 or less than 30
     */
    public void setDuration(int newDuration) throws Exception {
        if (newDuration < 30) {
            throw new Exception("Exam duration too short");
        }
        if (newDuration > 180) {
            throw new Exception("Exam duration too long");
        }
        this.duration = newDuration;
    }
}
