//
public class Exam extends Assessment {
    private int duration;

    public Exam(int newWeight, int newDuration)
    {
        setWeight(newWeight);
        this.duration = newDuration;
    }

    public String description()
    {
        String output = "";
        output = "Exam : duration " + this.duration + " minutes, weight " + getWeight() + "%";
        return output;

    }
}
