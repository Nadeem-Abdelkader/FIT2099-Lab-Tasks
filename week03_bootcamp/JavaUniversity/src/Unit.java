public class Unit {
    String unit_code;
    String unit_name;

    public Unit(String unit_code, String unit_name) {
        this.unit_code = unit_code;
        this.unit_name = unit_name;
    }

    public String description(){
        return unit_code + " " + unit_name;
    }
}
