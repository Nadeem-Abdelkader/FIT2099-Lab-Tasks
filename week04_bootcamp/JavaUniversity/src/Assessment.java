import java.util.HashMap;

public abstract class Assessment {
    private int weight;

    public void setWeight(int newWeight) {
        if (newWeight> 0 & newWeight <101)
            weight = newWeight;
    }

    public int getWeight() {
        return weight;
    }


    public abstract String description();

}
