import java.util.HashSet;

public class HashSetPractice {


    public  static char firstRepeated(String st){
        HashSet<Character> set = new HashSet<>();

for(char ch : st.toCharArray()){
    if (set.contains(ch)) {
return ch;        
    }
    set.add(ch);

}
return '-';        
    }
    public static void main(String[] args) {
        
String st = "abcaed";
System.out.println(firstRepeated(st));


    }
}
