package com.company;

public class VendingMachine {

    private String chips;
    private String sodaPop;
    private String chocolate;
    private String mints;
    private String gum;
    private String popcorn;

    public VendingMachine(String chips,String sodaPop,String chocolate,String mints,String gum,String popcorn){

        this.chips = chips;
        this.sodaPop = sodaPop;
        this.chocolate = chocolate;
        this.mints = mints;
        this.gum = gum;
        this.popcorn = popcorn;


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

    public String getMints() {
        return mints;
    }

    public void setMints(String mints) {
        this.mints = mints;
    }

    public String getGum() {
        return gum;
    }

    public void setGum(String gum) {
        this.gum = gum;
    }

    public String getPopcorn() {
        return popcorn;
    }

    public void setPopcorn(String popcorn) {
        this.popcorn = popcorn;
    }
}
