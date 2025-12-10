
import java.util.LinkedList;

public class HashMapPractice2 {


    static class HashMap(K,V)//generics{
        private class Node{ //node of linkedList
            K Key;
            V value;
        public Node(K key, V value){
            this.key= key;
            this.value=value;
        }
        }
        private int n;//n
        private int N;
        private LinkedList<Node> buckets[]; // N=buckets.length

        

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>();

            }
        }
    
public void put(K key, V value){

}


    }
    public static void main(String[] args) {
        //internally hashmap worked as an array of linkedList


    }
}
