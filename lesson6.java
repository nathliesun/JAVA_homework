import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class lesson6 {
     public static void main(String[] args) {
        makeSet set = new makeSet();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(6);
        System.out.println(set.toString());

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();


        set1.size();

        if (!set.isEmpty()){
            Iterator<Integer> it = set.iter();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
        Iterator<Integer> it = set.iter();
        ArrayList<Integer> ar = new ArrayList();
        while (it.hasNext()){
            ar.add(it.next());
        }
        Collections.sort(ar);
        for (int i = 0; i < ar.size(); i++) {
            set1.add(ar.get(i));
        }
        System.out.println(set1);
        



       
/**
 *
 */
        TreeSet<String>set2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) { return 0;}
                if (o1.compareTo(o2)>0) {return 1;}
                else return -1;
            }
        });
        set2.add("Один");
        set2.add("Два");
        set2.add("Два+один");
        set2.add("Два");
        set2.add("Два+один+один");
        System.out.println(set2);


        Iterator<Integer> itr = set.iter();
        while (itr.hasNext()){
            set2.add(itr.next().toString());
        }
        
        System.out.println(set2);



    }
}
class makeSet{
    private static final Object NF = new Object();
    private HashMap<Integer, Object> map;
    public boolean add(Integer value){
        if (map.containsKey(value)){
            return false;}
        else {map.put(value, NF);
            return true;
        }
    }
    public makeSet(){
        map = new HashMap<>();
    }

    @Override
    public String toString() {
        Set<Integer> keys = map.keySet();
        String tmp = "";
        for (int i = 0; i < keys.size(); i++) {
            tmp += keys.toArray()[i] + ", " ;
        }
        tmp ="["+ tmp.substring(0, tmp.length()-2)+ "]";
        return tmp;
    }
    public void remove(Integer key){
        map.remove(key);
    }
    public int size(){
        return map.size();
    }
    public boolean isEmpty(){
        if(map.size()>0){return false;}
        return true;
    }
 
    public Iterator iter(){

        return map.keySet().iterator();
    }
}

