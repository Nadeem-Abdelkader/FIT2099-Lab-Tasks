import java.util.ArrayList;
import java.util.HashMap;

public class University {

    private ArrayList<Unit> unitArrayList = new ArrayList<>();
    //
    private HashMap<String , Student> Students = new HashMap<>();


    public void printstatus(){
        this.createUnits();
        System.out.println("Welcome to Java University");
        System.out.println(this.displayUnits());
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
        Student student1;
        Student student2;
        Student student3;

        try {
            student1 = new Student("12345678", "Daniel", "James");
        } catch (Exception e) {
            System.out.println("The Student ID must be 8 digits");
            e.printStackTrace();
            return;
        }
        try {
            student2 = new Student("30146244", "Nadeem", "Abdelkader");
        } catch (Exception e) {
            System.out.println("The Student ID must be8 digits");
            e.printStackTrace();
            return;
        }
        try {
            student3 = new Student("87654321", "Danny", "Green");
        } catch (Exception e) {
            System.out.println("The Student ID must e8 digits");
            e.printStackTrace();
            return;
        }

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

        Exam exam1;
        Exam exam2;
        Assignment assignment1;

        try {
            exam1 = new Exam(40,180);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }
        try {
            exam2 = new Exam(30,100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }
        try {
            assignment1 = new Assignment(30, "Assignment # 1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }

        try {
            unit2.getAssessment().addAssessment(exam1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }
        try {
            unit2.getAssessment().addAssessment(exam2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }
        try {
            unit2.getAssessment().addAssessment(assignment1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }

        Mark mark1;
        Mark mark2;
        Mark mark3;

        try {
            mark1 = new Mark(100, "ACED!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }
        try {
            mark2 = new Mark(80,"HD");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }
        try {
            mark3 = new Mark(70,"D");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }


        exam1.addMarks(student1, mark1);
        exam2.addMarks(student1, mark1);
        assignment1.addMarks(student1, mark1);

        exam1.addMarks(student2, mark1);
        exam2.addMarks(student2, mark2);
        assignment1.addMarks(student2, mark2);

        exam1.addMarks(student3, mark1);
        exam2.addMarks(student3, mark2);
        assignment1.addMarks(student3, mark3);

        //
        System.out.println("Query:\n");
        System.out.println(student1.description() + ":"+
                "\nexam 1 mark = " + exam1.getMarks().get(student1.getStudentID()).getMarkTotal() + " - " + exam1.getMarks().get(student1.getStudentID()).getComment()+
                "\nexam 2 mark = " + exam2.getMarks().get(student1.getStudentID()).getMarkTotal() + " - " + exam2.getMarks().get(student1.getStudentID()).getComment()+
                "\nassignment 1 mark = " + assignment1.getMarks().get(student1.getStudentID()).getMarkTotal() + " - " + assignment1.getMarks().get(student1.getStudentID()).getComment()+ "\n");

        System.out.println(student2.description() + ":"+
                "\nexam 1 mark = " + exam1.getMarks().get(student2.getStudentID()).getMarkTotal() + " - " + exam1.getMarks().get(student2.getStudentID()).getComment()+
                "\nexam 2 mark = " + exam2.getMarks().get(student2.getStudentID()).getMarkTotal() + " - " + exam2.getMarks().get(student2.getStudentID()).getComment()+
                "\nassignment 1 mark = " + assignment1.getMarks().get(student2.getStudentID()).getMarkTotal() + " - " + assignment1.getMarks().get(student2.getStudentID()).getComment()+ "\n");

        System.out.println(student3.description() + ":"+
                "\nexam 1 mark = " + exam1.getMarks().get(student3.getStudentID()).getMarkTotal() + " - " + exam1.getMarks().get(student3.getStudentID()).getComment()+
                "\nexam 2 mark = " + exam2.getMarks().get(student3.getStudentID()).getMarkTotal() + " - " + exam2.getMarks().get(student3.getStudentID()).getComment()+
                "\nassignment 1 mark = " + assignment1.getMarks().get(student3.getStudentID()).getMarkTotal() + " - " + assignment1.getMarks().get(student3.getStudentID()).getComment()+ "\n");

    }

    public String displayUnits() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i<Unit.counter; i++) {
            output.append(unitArrayList.get(i).description()).append("\n");
            output.append("Enrolled Students: \n");
            for (int j = 0; j < unitArrayList.get(i).getEnrolledStudents().size();j++) {
                output.append(Students.get(unitArrayList.get(i).getEnrolledStudents().get(j)).description()).append("\n");
            }
        }
        return output.toString();
    }

    public String displayUnits1()
    {

        StringBuilder output = new StringBuilder();
        for (Unit unit : unitArrayList) {
            output.append(unit.description());
            output.append("\n");
            Student[] newArray = unit.returnStudents(this);
            for (Student student : newArray) {
                output.append(student.description());
                output.append("\n");
                output.append("Total Marks: ");
                output.append(unit.totalMarks(student));
                output.append("\n");
            }
        }

        return output.toString();

    }
}