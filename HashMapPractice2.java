
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
            this.buckets=new LinkedList[4];//initialzed bucket
            for(int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>(); //empty linked list start

            }
        }
    private int hashFunction(K key){

    }
    private 
public void put(K key, V value){ 

   int bi= hashFunction(key);
    int di= searchInLL(key, bi);//data index di=value(valid)
if (di==-1) { //key doesn't exits
buckets[bi].add(new Node(key, value));
    n++;
}else{//key exist
Node data=buckets[bi].get(di);
data.value=value;
}

double lamda= (double)n/N;
if (lamda>2.0) {
    //rehashing
    
}


}


    }
    public static void main(String[] args) {
        //internally hashmap worked as an array of linkedList


    }
}
