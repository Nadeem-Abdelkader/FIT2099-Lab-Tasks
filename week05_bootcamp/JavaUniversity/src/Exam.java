//
public class Exam extends Assessment {
    private int duration;

    public Exam(int newWeight, int newDuration) throws Exception {
        setWeight(newWeight);
        setDuration(newDuration);
    }

    public String description()
    {
        String output;
        output = "Exam : duration " + this.duration + " minutes, weight " + getWeight() + "%";
        return output;

    }

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
