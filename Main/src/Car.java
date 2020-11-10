public class Car {

    String carReg;
    int carMileage;
    boolean carInsured;
    int carFuelRemaining;

    public Car(String carReg, int carMileage, boolean carInsured, int carFuelRemaining) {
        this.carReg = carReg;
        this.carMileage = carMileage;
        this.carInsured = carInsured;
        this.carFuelRemaining = carFuelRemaining;
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

    public boolean isCarInsured() {
        return carInsured;
    }

    public void setCarInsured(boolean carInsured) {
        this.carInsured = carInsured;
    }

    public int getCarFuelRemaining() {
        return carFuelRemaining;
    }

    public void setCarFuelRemaining(int carFuelRemaining) {
        this.carFuelRemaining = carFuelRemaining;
    }




    @Override
    public String toString() {

        String yesNo;

        if(carInsured == true){
            yesNo = "Yes";
        } else {yesNo = "WARNING UNINSURED";};




        return
                "carReg: " + carReg +
                ", carMileage: " + carMileage +
                ", carInsured: " + yesNo +
                ", carFuelRemaining: " + carFuelRemaining
                ;
    }




}
