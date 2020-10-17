import java.util.HashMap;
//
public abstract class Assessment {
    private int weight;
    private HashMap<String, Mark> Marks = new HashMap<>();

    public HashMap<String, Mark> getMarks() {
        return Marks;
    }

    public void setWeight(int newWeight) throws Exception {
        if (newWeight < 1) {
            throw new Exception("Weightage too low");
        }

        if (newWeight > 100) {
            throw new Exception("Weightage too high");
        }
        weight = newWeight;
    }

    public int getWeight() {
        return weight;
    }


    public abstract String description();

    //
    public void addMarks(Student newStudent,Mark newMark)
    {
        Marks.put(newStudent.getStudentID(), newMark);
    }

}
