
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        System.out.println();


    }else{
        System.out.println("Key is not present");
    }

System.out.println(map.get("China"));
System.out.println(map.get("Indonesia"));



System.out.println();
// int arr[]={12,15,18};
// for(int val:arr){
//     System.out.println(val);
// }
// System.out.println();

for(Map.Entry<String, Integer> e : map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
}



Set<String> keys = map.keySet();
for(String key: keys){
    System.out.println(key+" "+ map.get( key));
}

System.out.println(

);
map.remove("China");
System.out.println(map);

}
}
