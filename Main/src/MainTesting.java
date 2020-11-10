
import javax.swing.JOptionPane;
import java.util.ArrayList; // import the ArrayList class
import java.util.Random;

public class MainTesting {



    public static void main (String[] args ){



/*
        ArrayList vehicles = new ArrayList();
        Car c1 = new Car("ER12 DOT", 65993, true , 25, 3665, 1600, false);
        Car c2 = new Car("PO19 ERR", 12922, false , 11, 18995, 15400, true);
        Van v1 = new Van("DE10 PPE", 82922, true , 71, 2290, 1100, false);
        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(v1);

         */
        ArrayList vehicles = new ArrayList();

        Random r = new Random();
        int vehicleAmount = (int)(r.nextInt(51));

        for (int i = 0 ; i < vehicleAmount ; i ++  ){
            vehicles.add(randomPopulate());

        }







        ArrayList vehicleList = new ArrayList();

        for (int i = 0 ; i < vehicles.size() ; i ++  ){
            vehicleList.add("\n" + vehicles.get(i).toString());
        }

        JOptionPane.showMessageDialog(null,vehicleList);







    }


    public static Object randomPopulate(){

        Random r = new Random();
        double carOrVan = Math.random();
        String reg = randReg();
        int mileage = (int)(r.nextInt(100000));
        boolean insured;
        double insuredDetermine = Math.random();
        if (insuredDetermine > 0.1){
            insured = true;
        } else { insured = false ;}
        int fuelRem = (int)(r.nextInt(101));
        int sellPrice = (int)(r.nextInt(20001));
        int boughtPrice = (int)(r.nextInt(4001));
        boolean maintain;
        double maintainDetermine = Math.random();
        if (maintainDetermine > 0.9){
            maintain = true;
        } else { maintain = false ;}








        if (carOrVan > 0.2 ){

            Car randCar = new Car(reg,mileage,insured,fuelRem,sellPrice,boughtPrice,maintain);
            return randCar;


        } else {

            Van randVan = new Van(reg,mileage,insured,fuelRem,sellPrice,boughtPrice,maintain);
            return randVan;

        }

    }

    public static String randReg(){

        String reg ;
        int c ;

        double firstOrSecondHalf = Math.random();

        Random r = new Random();



        if (firstOrSecondHalf > 0.5){
            c = (int)(r.nextInt(2));
        } else {
            c = (int)(r.nextInt(6));
        }

        int d = (int)(r.nextInt(10));
        char e = (char)(r.nextInt(26) + 'A');
        char f = (char)(r.nextInt(26) + 'A');
        char g = (char)(r.nextInt(26) + 'A');
        char h = (char)(r.nextInt(26) + 'A');
        char i = (char)(r.nextInt(26) + 'A');


        reg = (h+""+i+""+c+""+d+" "+e+""+f+""+g);
        return reg;

    }









}
