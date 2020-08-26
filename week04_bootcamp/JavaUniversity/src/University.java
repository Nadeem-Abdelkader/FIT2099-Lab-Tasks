import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class University {

    ArrayList<Unit> unitArrayList = new ArrayList<>();
    HashMap<String , Student> Students = new HashMap<>();


    public void printstatus() {
        System.out.println("Welcome to Java University");
        System.out.println(this.displayUnits());
        //System.out.println("\n");
        System.out.println(this.displayUnits1());
        System.out.println("Thank you for using Java University");

    }
    public void admitStudent(Student Student) {
        Students.put(Student.getStudentID(), Student);
    }
    public HashMap <String, Student> getStudents(){
        return Students;
    }
    public void addUnits(Unit unit) {

        unitArrayList.add(unit);
    }

    public void createUnits(){
        Student student1 = new Student("123456", "Daniel", "James");
        Student student2 = new Student("301462", "Nadeem", "Abdelkader");
        Student student3 = new Student("434521", "Danny", "Green");

        this.admitStudent(student1);
        this.admitStudent(student2);
        this.admitStudent(student3);


        Unit unit1 = new Unit("FIT2004","Algorithms and data structures");
        Unit unit2 = new Unit("FIT2099", "Object oriented design and implementation");
        this.addUnits(unit1);
        this.addUnits(unit2);

        unit2.enrolStudent(student1.getStudentID());
        unit2.enrolStudent(student2.getStudentID());
        unit2.enrolStudent(student3.getStudentID());

        Assessment exam_2_1 = new Exam(40,120);
        Assessment exam_2_2 = new Exam(30,100);
        Assessment assignment_2_1 = new Assignment(30, "Assignment # 1");

        unit2.getAssessment().addAssessment(exam_2_1);
        unit2.getAssessment().addAssessment(exam_2_2);
        unit2.getAssessment().addAssessment(assignment_2_1);

        Mark mark1 = new Mark(100, "ACED!");
        Mark mark2 = new Mark(80,"HD");
        Mark mark3 = new Mark(70,"D");


        exam_2_1.addMarks(student1, mark1);
        exam_2_2.addMarks(student1, mark1);
        assignment_2_1.addMarks(student1, mark1);

        exam_2_1.addMarks(student2, mark1);
        exam_2_2.addMarks(student2, mark2);
        assignment_2_1.addMarks(student2, mark2);

        exam_2_1.addMarks(student3, mark1);
        exam_2_2.addMarks(student3, mark2);
        assignment_2_1.addMarks(student2, mark3);
    }

    public String displayUnits() {
        String output = "";
        for (int i = 0; i<Unit.counter; i++) {
            output += unitArrayList.get(i).description() + "\n";
            output += "Enrolled Students: \n";
            for (int j = 0; j < unitArrayList.get(i).enrolledStudents.size();j++) {
                output += Students.get(unitArrayList.get(i).enrolledStudents.get(j)).description() + "\n";
            }
        }
        return output;
    }

    public String displayUnits1()
    {

        String output = "";
        for (int i = 0; i < unitArrayList.size(); i++)
        {
            output += unitArrayList.get(i).description();
            output += "\n";
            Student[] newArray =unitArrayList.get(i).returnStudents(this);
            for (int j = 0; j<newArray.length;j++)
            {
                output += newArray[j].description();
                output += "\n";
                output += "Total Marks: ";
                output += unitArrayList.get(i).totalMarks(newArray[j]);
                output += "\n";
            }
            //output += "\n";
        }

        return output;

    }
}