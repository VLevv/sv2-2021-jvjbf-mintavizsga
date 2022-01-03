package aquarium;

public class Tang extends Fish{
    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public String getStatus() {
        return (getName()+", weight: "+getWeight()+", color: "+getColor()+", short-term memory loss: true");
    }
}
