package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {
    public List<Character> getUniqueChars(String string){
        if(string==null){
            throw new IllegalArgumentException("Text is null.");
        }
        List<Character> characters = new ArrayList<>();
        for(int i= 0;i<string.length();++i){
            if(!characters.contains(string.charAt(i))){
                characters.add(string.charAt(i));
            }
        }
        return characters;
    }
}
