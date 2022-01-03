package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fish = new ArrayList<>();
    public static final int CAPACITY=20;

    public void addFish(Fish fish){
        if((this.fish.size()+1)*5>CAPACITY){
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
        this.fish.add(fish);
    }

    public void feed(){
        for (Fish f :
                fish) {
            f.feed();
        }
    }

    public void removeFish(int maxWeight){
        List<Fish> remove=new ArrayList<>();
        for (Fish f :
                fish) {
            if(f.getWeight()>maxWeight){
                remove.add(f);
            }
        }
        fish.removeAll(remove);
    }

    public List<String> getStatus(){
        List<String> result=new ArrayList<>();
        for (Fish f :
                fish) {
            result.add(f.getStatus());
        }
        return result;
    }

    public int getNumberOfFishWithMemoryLoss(){
        int c = 0;
        for (Fish f :
                fish) {
            if (f.hasMemoryLoss()) {
                c++;
            }
        }
        return c;
    }

    public boolean isThereFishWithGivenColor(String color){
        for (Fish f :
                fish) {
            if (f.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish(){
        int min=fish.get(0).getWeight();
        Fish result=fish.get(0);
        for (Fish f:
            fish) {
            if(f.getWeight()<min){
                min = f.getWeight();
                result = f;
            }
        }
        return result;
    }
}
