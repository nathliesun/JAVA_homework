import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class homework4 {
    static ArrayList<String> list_fname = new ArrayList<>();
    static ArrayList<String> list_lname = new ArrayList<>();
    static ArrayList<String> list_tname = new ArrayList<>();
    static ArrayList<Integer> list_age = new ArrayList<>();
    static ArrayList<Boolean> list_sex = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();

public static void main(String[] args) {
    putTo ("Леонов Игорь Степанович", 27, "M");
    putTo ("Иванов Петр Андреевич", 29, "M");
    putTo ("Петров Сергей Антонович", 45, "M");
    putTo ("Сидоров Иван Дмитриевич",55, "M");
    putTo ("Медведева Ирина Львовна", 52, "F");
    putTo ("Ильина Нина Владимировна", 8, "F");
    

sort_sex();
sort_age();
sort_lname();
print();

   
    

        }
static void sort_age(){
    int cnt = linkedlist.size()-1;
     while (cnt > -1){
            int max_age = list_age.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i =0; i <cnt; i++){
                if(max_age < list_age.get(linkedlist.get(i))){
                    max_age = list_age.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index,tmp);
            cnt--;
    
        }   
    }     
static void sort_sex (){
    for(int i=0; i < linkedlist.size(); i++){
        if (list_sex.get(linkedlist.get(i))){
            int tmpI = linkedlist.get(i);
            linkedlist.remove(i);
            linkedlist.add(0, tmpI);
        }
    }
}
static void sort_lname(){
    int cnt = linkedlist.size()-1;
     while (cnt > -1){
            char max_letter = list_lname.get(linkedlist.get(cnt)).charAt(0);
            int index = cnt;
            for (int i =0; i <cnt; i++){
                if(max_letter < list_lname.get(linkedlist.get(i)).charAt(0)){
                    max_letter = list_lname.get(linkedlist.get(i)).charAt(0);
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index,tmp);
            cnt--;
    
        }   
    }     
static void putTo (String fio, int age, String gender){
    list_age.add(age);
    String[] fio1 = fio.split(" ");
    list_fname.add(fio1[1]);
    list_lname.add(fio1[0]);
    list_tname.add(fio1[2]);
    if (gender.contains("F")) {list_sex.add(true);} else{list_sex.add(false);}
    linkedlist.add(list_lname.size()-1);
}
static void print (){

    for (int i =0; i <linkedlist.size(); i++){
        int p=linkedlist.get(i);
        System.out.println(list_lname.get(p)+" " +list_fname.get(p)+" "+list_tname.get(p)+" "+list_age.get(p)+" "+list_sex.get(p));

    }
}





}