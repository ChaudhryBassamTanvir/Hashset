
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
int bi= key.hashCode(); //return a random number
Math.abs(bi)%N;
    }

    private int searchInLL(K key, int bi){
        LinkedList<Node> ll= buckets[bi];
        int di=0;
        for(int i=0;i<ll.size();i++){
            if (ll.get(i).key==key) {

                
                return i;//di
            }
        }
        return -1;
    }
    private public void put(K key, V value){ 

   int bi= hashFunction(key);
    int di= searchInLL(key, bi);//data index di=value(valid)
if (di==-1) { //key doesn't exits
buckets[bi].add(new Node(key, value));
    n++;
}else{//key exist
Node node=buckets[bi].get(di);
data.value=value;
}


private void rehash(){
    LinkedList<Node> oldBucket[]=buckets;
    buckets = new LinkedList[N*2];

for(int i=0;i<N*2;i++){
    buckets[i]= new LinkedList<>();
}


    for(int i=0;i<oldBucket.length;i++){
        Node node =ll.get(j);
        put(node.key, node.value);
    }
}
double lamda= (double)n/N;
if (lamda>2.0) {
    //rehashing
    rehash()
    
}


}


    }
    public static void main(String[] args) {
        //internally hashmap worked as an array of linkedList

HashMap<String, Integer> map = new HashMap<>();
map.put("India", 120);
map.put("Pakistan",30);
map.put("China", 120);
    }
}
