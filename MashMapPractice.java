
import java.util.HashMap;

public class MashMapPractice {
    public static void main(String[] args) {
        //put
        //

        HashMap<String,Integer> map = new HashMap<>();
        
        //insertion
        map.put("Pakistan", 21);
        map.put("US", 30);
        map.put("India", 120);
        map.put("China", 150);
    
    
    System.out.println(map);
    map.put("China", 180);
    System.out.println();
    System.out.println(map);


    //Search 
    if(map.containsKey("China")){
        System.out.println("Yes Present in map " +map.get("China"));


    }else{
        System.out.println("Key is not present");
    }

    }
}
