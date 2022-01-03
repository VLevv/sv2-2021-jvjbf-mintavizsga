package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {
    private List<String> owlsPerCounty =new ArrayList<>();

    public void readFromFile(Path path){
        try{
            owlsPerCounty = Files.readAllLines(path);
        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file.",ioe);
        }
    }

    public int getNumberOfOwls(String county){
        for (String s : owlsPerCounty) {
            if (s.substring(0, s.indexOf("=")).equals(county)) {
                return Integer.parseInt(s.substring(s.indexOf("=") + 1));
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }

    public int getNumberOfAllOwls(){
        int sum =0;
        for (String s :
                owlsPerCounty) {
            sum+=Integer.parseInt(s.substring(s.indexOf("=")+1));
        }
        return sum;
    }
}
