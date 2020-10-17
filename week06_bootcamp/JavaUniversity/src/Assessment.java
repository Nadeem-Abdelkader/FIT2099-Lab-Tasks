import java.util.HashMap;
/**
 * abstract class, that will be implemented by the exam and assignments classes
 */
public abstract class Assessment {
    private int weight;
    private HashMap<String, Mark> Marks = new HashMap<>();

    /**
     * returns mark for certain assignment for a certain student
     * @return Marks - mark for certain assignment for a certain student
     */
    public HashMap<String, Mark> getMarks() {
        return Marks;
    }
    /**
     * setter function for weight
     * @param newWeight - weight to be set to
     * @throws Exception - if newWeight greater than 100 or newWeight less than 1
     */
    public void setWeight(int newWeight) throws Exception {
        if (newWeight < 1) {
            throw new Exception("Weightage too low");
        }

        if (newWeight > 100) {
            throw new Exception("Weightage too high");
        }
        weight = newWeight;
    }
    /**
     * getter function for weight
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * abstract function that will return a string when implemented in child classes (exam and assignment)
     * @return string as per child class
     */
    public abstract String description();

    /**
     * adds Mark for student to the Marks HashMap
     * @param newStudent - student to add mark for
     * @param newMark - mark to add for student
     */
    public void addMarks(Student newStudent,Mark newMark)
    {
        Marks.put(newStudent.getStudentID(), newMark);
    }

}
