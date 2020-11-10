public class Car {

    String vehicleType;
    String Reg;
    int Mileage;
    boolean Insured;
    int FuelRemaining;
    int SellingPrice;
    int BoughtForPrice;
    boolean maintenanceRequired;


    public Car(String carReg, int carMileage, boolean carInsured, int carFuelRemaining, int carSellingPrice, int carBoughtForPrice, boolean maintenanceRequired) {

        this.vehicleType = "Car";
        this.Reg = carReg;
        this.Mileage = carMileage;
        this.Insured = carInsured;
        this.FuelRemaining = carFuelRemaining;
        this.SellingPrice = carSellingPrice;
        this.BoughtForPrice = carBoughtForPrice;
        this.maintenanceRequired = maintenanceRequired;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(int carSellingPrice) {
        this.SellingPrice = carSellingPrice;
    }

    public int getBoughtForPrice() {
        return BoughtForPrice;
    }

    public void setBoughtForPrice(int carBoughtForPrice) {
        this.BoughtForPrice = carBoughtForPrice;
    }

    public boolean isMaintenanceRequired() {
        return maintenanceRequired;
    }

    public void setMaintenanceRequired(boolean maintenanceRequired) {
        this.maintenanceRequired = maintenanceRequired;
    }

    public String getReg() {
        return Reg;
    }

    public void setReg(String carReg) {
        this.Reg = carReg;
    }

    public int getMileage() {
        return Mileage;
    }

    public void setMileage(int carMileage) {
        this.Mileage = carMileage;
    }

    public boolean isInsured() {
        return Insured;
    }

    public void setInsured(boolean carInsured) {
        this.Insured = carInsured;
    }

    public int getFuelRemaining() {
        return FuelRemaining;
    }

    public void setFuelRemaining(int carFuelRemaining) {
        this.FuelRemaining = carFuelRemaining;
    }




    @Override
    public String toString() {

        String yesNo;
        String mYesNo;

        if(Insured == true){
            yesNo = "Yes";
        } else {yesNo = "WARNING UNINSURED";};

        if(maintenanceRequired == true){
            mYesNo = "Yes";
        } else {mYesNo = "No";};

        int profitIfSold = getSellingPrice() - getBoughtForPrice();




        return
                "Vehicle Type: " + vehicleType + ", " +
                "Reg: " + Reg + ", " +
                "Mileage: " + Mileage + ", " +
                "Insured? " + yesNo + ", " +
                "FuelRemaining: " + FuelRemaining + ", " +
                "Selling Price: £" + SellingPrice + ", " +
                "Bought For Price: £" + BoughtForPrice + ", " +
                "Maintenance required? " + mYesNo + ", " +
                        "Profit If Sold: £" + profitIfSold
                ;
    }








}
