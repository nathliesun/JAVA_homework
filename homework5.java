
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Set;
    
    public class homework5 {
        static public void main(String[] args) {
            HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Иванов Иван Иванович 28 м");
        map.put(1, "Петров Игнат Васильевич 48 м");
        map.put(2, "Артемов Матвей Маркович 67 м");
        map.put(3, "Сидоров Сергей Анотонович 33 м");
        map.put(4, "Казеева Нина Викторовна 44 ж");
        map.put(5, "Карасева Ольга Борисовна 35 ж");
    
        Set<Integer> keys= map.keySet();
        
            for (Integer key: keys
            ){
                String[] temp1 = map.get(key).split(" ");
                String tmp1 = temp1[0].toUpperCase().charAt(0)+temp1[0].toLowerCase().substring(1,temp1[0].length());
                String tmp2 = temp1[1].toUpperCase().charAt(0)+".";
                String tmp3 = temp1[2].toUpperCase().charAt(0)+".";
                String tmp4=temp1[3];
                String tmp5 = temp1[4].toUpperCase();
                String tmp= tmp1+" "+tmp2+tmp3+" "+tmp4+"  "+tmp5;
                                
                System.out.println(tmp); 
                
            }

            

        }
    }
