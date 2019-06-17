

public class IceCreamFactory {

    private String flavors;
    private String mixingMachine;
    private int costOfBusiness;
    private int icecreamShipped;
    private int deliveryTrucks;
    private boolean isHiring;

    public IceCreamFactory(String flavors, String mixingMachine, int costOfBusiness, int icecreamShipped, int deliveryTrucks, boolean isHiring) {
        this.flavors = flavors;
        this.mixingMachine = mixingMachine;
        this.costOfBusiness = costOfBusiness;
        this.icecreamShipped = icecreamShipped;
        this.deliveryTrucks = deliveryTrucks;
        this.isHiring = isHiring;
    }

    public String getFlavors() {
        return flavors;
    }

    public void setFlavors(String flavors) {
        this.flavors = flavors;
    }

    public String getMixingMachine() {
        return mixingMachine;
    }

    public void setMixingMachine(String mixingMachine) {
        this.mixingMachine = mixingMachine;
    }

    public int getCostOfBusiness() {
        return costOfBusiness;
    }

    public void setCostOfBusiness(int costOfBusiness) {
        this.costOfBusiness = costOfBusiness;
    }

    public int getIcecreamShipped() {
        return icecreamShipped;
    }

    public void setIcecreamShipped(int icecreamShipped) {
        this.icecreamShipped = icecreamShipped;
    }

    public int getDeliveryTrucks() {
        return deliveryTrucks;
    }

    public void setDeliveryTrucks(int deliveryTrucks) {
        this.deliveryTrucks = deliveryTrucks;
    }

    public boolean isHiring() {
        return isHiring;
    }

    public void setHiring(boolean hiring) {
        isHiring = hiring;
    }
}
