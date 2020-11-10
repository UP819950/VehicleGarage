public class Car {

    String carReg;
    int carMileage;



    public Car(String reg, int mileage){

        carReg = reg;
        carMileage = mileage;


    }

    public String getCarReg() {
        return carReg;
    }

    public void setCarReg(String carReg) {
        this.carReg = carReg;
    }

    public int getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(int carMileage) {
        this.carMileage = carMileage;
    }




    @Override
    public String toString() {
        return "Car{" +
                "carReg='" + carReg + '\'' +
                ", carMileage=" + carMileage +
                '}';
    }




}
