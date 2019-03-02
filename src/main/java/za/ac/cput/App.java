package za.ac.cput;

import java.util.*;

public class App 
{

   public ArrayList<String> fruits()
   {
       ArrayList<String> myFruits = new ArrayList<>();
       myFruits.add("Apple");
       myFruits.add("Banana");
       myFruits.add("Watermelon");
       myFruits.add("Orange");

       return  myFruits;
   }

   public HashSet<String> cars()
   {
       HashSet<String> myCars = new HashSet<>();

       myCars.add("BMW");
       myCars.add("Mercedes");
       myCars.add("Volkswagen");
       myCars.add("Mercedes");
       myCars.add("BMW");

       return myCars;
   }

   public HashMap<Integer,String> cell()
   {
       HashMap<Integer,String> myPhone = new HashMap<>();
       myPhone.put(100,"Apple");
       myPhone.put(101,"Samsung");
       myPhone.put(102,"Hauwei");
       myPhone.put(103,"Nokia");
       myPhone.put(104,"Oppo");
       myPhone.put(105,"Hauwei");

       return myPhone;
   }
}
