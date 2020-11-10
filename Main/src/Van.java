public class Van {

    String vehicleType;
    String vanReg;
    int vanMileage;
    boolean vanInsured;
    int vanFuelRemaining;


    public Van(String vanReg, int vanMileage, boolean vanInsured, int vanFuelRemaining) {

        vehicleType = "Van";
        this.vanReg = vanReg;
        this.vanMileage = vanMileage;
        this.vanInsured = vanInsured;
        this.vanFuelRemaining = vanFuelRemaining;
    }


    public String getVanReg() {
        return vanReg;
    }

    public void setVanReg(String vanReg) {
        this.vanReg = vanReg;
    }

    public int getVanMileage() {
        return vanMileage;
    }

    public void setVanMileage(int vanMileage) {
        this.vanMileage = vanMileage;
    }

    public boolean isVanInsured() {
        return vanInsured;
    }

    public void setVanInsured(boolean vanInsured) {
        this.vanInsured = vanInsured;
    }

    public int getVanFuelRemaining() {
        return vanFuelRemaining;
    }

    public void setVanFuelRemaining(int vanFuelRemaining) {
        this.vanFuelRemaining = vanFuelRemaining;
    }

    @Override
    public String toString() {

        String yesNo;

        if(vanInsured == true){
            yesNo = "Yes";
        } else {yesNo = "WARNING UNINSURED";};




        return
                "Vehicle Type: " + vehicleType +
                        ", Reg: " + vanReg +
                        ", Mileage: " + vanMileage +
                        ", Insured? " + yesNo +
                        ", FuelRemaining: " + vanFuelRemaining
                ;
    }


}
