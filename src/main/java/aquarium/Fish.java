package aquarium;

public class Fish {
    private String name;
    private int weight;
    private String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getStatus(){
        return (name+", weight: "+weight+", color: "+color+", short-term memory loss: false");
    }

    public void feed(){
        weight++;
    }

    public boolean hasMemoryLoss(){
        if (this.getStatus().substring(this.getStatus().length() - 4).equals("true")){
            return true;
        }
        return false;
    }
}
