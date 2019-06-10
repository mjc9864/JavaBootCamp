package com.company;

public class Store {

    private String chips;
    private String sodaPop;
    private String chocolate;

    public Store(String chips,String sodaPop,String chocolate){

        this.chips = chips;
        this.sodaPop = sodaPop;
        this.chocolate = chocolate;

    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public String getSodaPop() {
        return sodaPop;
    }

    public void setSodaPop(String sodaPop) {
        this.sodaPop = sodaPop;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }
}
