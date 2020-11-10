

import java.util.ArrayList; // import the ArrayList class

public class MainTesting {



    public static void main (String[] args ){

        ArrayList cars = new ArrayList();
        Car c1 = new Car("ER12 DOT", 65993);
        Car c2 = new Car("PO19 ERR", 12922);



        cars.add(c1);
        cars.add(c2);

        for (int i = 0 ; i < cars.size() ; i ++  ){

            System.out.println(  cars.get(i).toString()  );

        }







    }





}
