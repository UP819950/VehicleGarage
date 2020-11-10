public class Van {

    String vehicleType;
    String Reg;
    int Mileage;
    boolean Insured;
    int FuelRemaining;
    int SellingPrice;
    int BoughtForPrice;
    boolean maintenanceRequired;

    public Van(String vanReg, int vanMileage, boolean vanInsured, int vanFuelRemaining, int vanSellingPrice, int vanBoughtForPrice, boolean maintenanceRequired) {

        this.vehicleType = "Van";
        this.Reg = vanReg;
        this.Mileage = vanMileage;
        this.Insured = vanInsured;
        this.FuelRemaining = vanFuelRemaining;
        this.SellingPrice = vanSellingPrice;
        this.BoughtForPrice = vanBoughtForPrice;
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

    public void setSellingPrice(int vanSellingPrice) {
        this.SellingPrice = vanSellingPrice;
    }

    public int getBoughtForPrice() {
        return BoughtForPrice;
    }

    public void setBoughtForPrice(int vanBoughtForPrice) {
        this.BoughtForPrice = vanBoughtForPrice;
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

    public void setReg(String vanReg) {
        this.Reg = vanReg;
    }

    public int getMileage() {
        return Mileage;
    }

    public void setMileage(int vanMileage) {
        this.Mileage = vanMileage;
    }

    public boolean isInsured() {
        return Insured;
    }

    public void setInsured(boolean vanInsured) {
        this.Insured = vanInsured;
    }

    public int getFuelRemaining() {
        return FuelRemaining;
    }

    public void setFuelRemaining(int vanFuelRemaining) {
        this.FuelRemaining = vanFuelRemaining;
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
