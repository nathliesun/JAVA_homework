import java.util.ArrayList;
import java.util.List;

public class sem3 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList();         //создать список
        list.add(12);                               //добавить элемент
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        System.out.println(list);
        list.add(0, 123);               //вставить элемент
        System.out.println(list);
        System.out.println(list.get(2));        //извлечь элемент
        System.out.println(list.contains(12));  
        System.out.println(list.equals(12));               //поиск по строке
        System.out.println(list.indexOf(12));
        list.remove(2);                            //удалить элемент
        list.remove(new Integer(3));
        list.set(3,5);                      //обновить элемент
        System.out.println(list);

      
        List<Integer> list2 = list.subList(1, list.size()/2);      //добавить в новый список
        System.out.println(list2);                                           //удаление из списка все что есть в др списке
        list.removeAll(list2);
        System.out.println(list);
        
        ArrayList<String> color = new ArrayList<String>();
        color.add ("red");
        color.add ("orange");
        color.add ("yellow");
        color.add ("green");
        color.add ("blue");
        for (int i =0; i<color.size(); i++){                                  //итерация 
            System.out.println(color.get(i)+"!");                             // добавление !
        }
    }
}
