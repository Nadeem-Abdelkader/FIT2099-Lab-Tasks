/**
 * implements the abstract methods from the parent class (Assessment)
 */
public class Assignment extends Assessment {

    private String title;

    /**
     * constructor for Assignment class
     * @param newWeight - weight of assignment
     * @param newTitle - title of assignment
     * @throws Exception - if newWeight is greater than 100 or less than 1
     */
    public Assignment(int newWeight, String newTitle) throws Exception {
        setWeight(newWeight);
        this.title = newTitle;
    }
    /**
     * @return - string describing an assignment's title and weight
     */
    @Override
    public String description() {
        String output = "";
        output+= "Assignment: " + title + ", weight " + getWeight() + "%\n";
        return output;
    }

}
