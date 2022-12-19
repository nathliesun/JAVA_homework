public class homework2 {
static public void main(String[] args) {

    System.out
        .println("Основная строка: " +"АААИИИТТТЫЫ");
    String input = "АААИИИТТТЫЫ";
    boolean isPresent = input.indexOf("ИИИ") != -1 ? true : false;

    if (isPresent) {
   
      System.out.println("Искомая строка: " + "ААА");
      System.out.println("Эта строка содержится в основной? " + "Да");
    }
    StringBuilder sb = new StringBuilder();
    StringBuilder sn = new StringBuilder();
    sb.append("123456");
    sn.append("654321");

    
    if (sb.reverse().toString().equals(sn.toString())) {
        System.out.println("да");}
    else System.out.println("нет");     

    String s1 = "3";
    String s2 = "56";
StringBuilder s = new StringBuilder();
   s.append(s1);
   s.append("+");
   s.append(s2);
   s.append("=");  
   s.append("59");
   System.out.println(s);
   s.deleteCharAt(4);
   s.insert(4, " равно ");
   System.out.println(s);

   StringBuilder p = new StringBuilder();
   p.append(s1);
   p.append("-");
   p.append(s2);
   p.append("=");  
   p.append("-53");
   System.out.println(p);
   p.deleteCharAt(4);
   p.insert(4, " равно ");
   System.out.println(p);

   StringBuilder m = new StringBuilder();
   m.append(s1);
   m.append("*");
   m.append(s2);
   m.append("=");  
   m.append("168");
   System.out.println(m);
   //m.deleteCharAt(4);
   //m.insert(4, " равно ");
   m.replace(4, 5, " равно ");
   System.out.println(m);


    }
}