import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class University {

    ArrayList<Unit> unitArrayList = new ArrayList<>();
    HashMap<String , Student> Students = new HashMap<String, Student>();


    public void printStatus() {
        System.out.println("Welcome to Java University.");
        System.out.println();
        createUnits();
        System.out.println(displayUnits());
        System.out.println("Thank you for using Java University.");

    }
    public void admitStudent(Student Student) {
        Students.put(Student.getStudentID(), Student);
    }
    public HashMap <String, Student> getStudents(){
        return Students;
    }
    public void createUnits(){
        Unit unit1= new Unit("\nFIT2099","Object oriented design and implementation");
        Unit unit2= new Unit("\nFIT2004","Algorithms and data structures");
        Unit unit3= new Unit("\nFIT2100","Operating systems");

        Student student1 = new Student(readString("Please enter StudentID: "), readString("Please enter Given Name: "), readString("Please enter Family Name: "));
        Student student2 = new Student("672989","Nadeem","Abdelkader");
        Student student3 = new Student("325789","Daniel","James");

        unitArrayList.add(unit1);
        unitArrayList.add(unit2);
        unitArrayList.add(unit3);

        unit1.enrolStudent(student1);
        unit1.enrolStudent(student2);
        unit1.enrolStudent(student3);

        unit2.enrolStudent(student2);
        unit2.enrolStudent(student3);

        unit3.enrolStudent(student3);


    }

    public String displayUnits() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i<3; i++)
        {
            output.append(unitArrayList.get(i).description()).append("\n");
            output.append("Enrolled Students: \n");
            for (int j = 0; j < unitArrayList.get(i).students.size();j++)
            {
                output.append(unitArrayList.get(i).students.get(j).description()).append("\n");
            }
        }
        return output.toString();
    }

    private String readString(String prompt) {
        System.out.print(prompt);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)
        );
        String s = null;
        try {
            s = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}