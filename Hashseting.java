
import java.util.HashSet;

public class Hashseting {
   public static void main(String[] args) {
    // insert/add o(1)
    // search/contain o(1)
    // delete/remove o(1)

    HashSet<Integer> set = new HashSet<>();
 //insert 

 set.add(1);
 set.add(2);
 set.add(3);
 set.add(1);

//size
System.out.println(set.size() + " is size of your set");

 //search- contains
 if (set.contains(1)) {
   System.out.println("set contains one");
   
 }

 if (!set.contains(6)) {
   System.out.println("Does not contain");
   
 }

 //remove
 set.remove(1);
 if (!set.contains(1)) {
System.out.println("We deleted 1");
   
 }


   } 
}
