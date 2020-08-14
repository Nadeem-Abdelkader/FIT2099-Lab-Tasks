public class University {

    Unit[] unit_array = new Unit[3];

    public void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println();
        createUnits();
        System.out.println(displayUnits());
        System.out.println("Thank you for using Java University");

    }
    public void createUnits(){
        Unit unit_one= new Unit("FIT2099","Object oriented design and implementation");
        Unit unit_two= new Unit("FIT2004","Algorithms and data structures");
        Unit unit_three= new Unit("FIT2100","Operating systems");

        unit_array[0] = unit_one;
        unit_array[1] = unit_two;
        unit_array[2] = unit_three;

    }
    public String displayUnits(){
        String output = "";
        for (int i = 0; i < 3; i++){
            output += unit_array[i].getUnitDescription();
            output += "\n";
        }
        return output;
    }
}