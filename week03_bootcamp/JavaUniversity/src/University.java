import java.util.ArrayList;

public class University {

    ArrayList<Unit> unitArrayList = new ArrayList<>();

    public void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println();
        createUnits();
        System.out.println(displayUnits());
        System.out.println("Thank you for using Java University");

    }
    public void createUnits(){
        Unit unit1= new Unit("FIT2099","Object oriented design and implementation");
        Unit unit2= new Unit("FIT2004","Algorithms and data structures");
        Unit unit3= new Unit("FIT2100","Operating systems");

        unitArrayList.add(unit1);
        unitArrayList.add(unit2);
        unitArrayList.add(unit3);

    }
    public String displayUnits(){
        String output = "";
        for (int i = 0; i < 3; i++){
            output += unitArrayList.get(i).description();
            output += "\n";
        }
        return output;
    }
}