public class IceCreamStore {

    private String flavors;
    private String cone;
    private String sprinkles;
    private String cup;
    private String spoon;
    private String choclateChips;
    private String milk;
    private int ingrediantCost;
    private boolean hasCone;
    private boolean hasSprinkles;

    public IceCreamStore(String flavors, String cone, String sprinkles, String cup, String spoon, String choclateChips, String milk, int ingrediantCost, boolean hasCone, boolean hasSprinkles) {
        this.flavors = flavors;
        this.cone = cone;
        this.sprinkles = sprinkles;
        this.cup = cup;
        this.spoon = spoon;
        this.choclateChips = choclateChips;
        this.milk = milk;
        this.ingrediantCost = ingrediantCost;
        this.hasCone = hasCone;
        this.hasSprinkles = hasSprinkles;
    }

    public String getFlavors() {
        return flavors;
    }

    public void setFlavors(String flavors) {
        this.flavors = flavors;
    }

    public String getCone() {
        return cone;
    }

    public void setCone(String cone) {
        this.cone = cone;
    }

    public String getSprinkles() {
        return sprinkles;
    }

    public void setSprinkles(String sprinkles) {
        this.sprinkles = sprinkles;
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }

    public String getSpoon() {
        return spoon;
    }

    public void setSpoon(String spoon) {
        this.spoon = spoon;
    }

    public String getChoclateChips() {
        return choclateChips;
    }

    public void setChoclateChips(String choclateChips) {
        this.choclateChips = choclateChips;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public int getIngrediantCost() {
        return ingrediantCost;
    }

    public void setIngrediantCost(int ingrediantCost) {
        this.ingrediantCost = ingrediantCost;
    }

    public boolean isHasCone() {
        return hasCone;
    }

    public void setHasCone(boolean hasCone) {
        this.hasCone = hasCone;
    }

    public boolean isHasSprinkles() {
        return hasSprinkles;
    }

    public void setHasSprinkles(boolean hasSprinkles) {
        this.hasSprinkles = hasSprinkles;
    }
}
