

import java.util.ArrayList; // import the ArrayList class

public class MainTesting {



    public static void main (String[] args ){

        ArrayList vehicles = new ArrayList();
        Car c1 = new Car("ER12 DOT", 65993, true , 25);
        Car c2 = new Car("PO19 ERR", 12922, false , 11);
        Van v1 = new Van("DE10 PPE", 82922, true , 71);

        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(v1);

        for (int i = 0 ; i < vehicles.size() ; i ++  ){

            System.out.println(  vehicles.get(i).toString()  );

        }







    }





}
