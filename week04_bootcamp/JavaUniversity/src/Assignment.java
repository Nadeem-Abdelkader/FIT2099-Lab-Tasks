//
public class Assignment extends Assessment {

    private String title;

    public Assignment(int newWeight, String newTitle) {
        setWeight(newWeight);
        this.title = newTitle;
    }

    public String description() {
        String output = "";
        output+= "Assignment: " + title + ", weight " + getWeight() + "%\n";
        return output;
    }

}
