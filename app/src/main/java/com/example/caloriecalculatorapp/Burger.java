package com.example.caloriecalculatorapp;

public class Burger {
    int patty;
    Double sauce;
    Boolean cheesee;
    Boolean veg1;
    Boolean veg2;
    Boolean veg3;
    static final int PATTY1 = 1;
    static final int PATTY2 = 2;
    static final int PATTY3 = 3;
    static final Double PATTY1CAL = 204.0;
    static final Double PATTY2CAL = 287.0;
    static final Double PATTY3CAL = 177.0;
    static final Double CHEESE = 104.0;
    static final Double VEGGIE1CAL = 5.0;
    static final Double VEGGIE2CAL = 8.0;
    static final Double VEGGIE3CAL = 45.0;


    public Burger() {
        patty = 1;
        sauce = 0.0;
        cheesee = false;
        veg1 = false;
        veg2 = false;
        veg3 = false;
    }


    public Double getCals() {
        return getPattyCal() + getCheese() + getSauce() + getVeggies();
    }


    public void setPatty(int p){
        if(p == PATTY2){patty = PATTY2;}
        if(p == PATTY3){patty = PATTY3;}
        else{patty = PATTY1;}
    }
    public Double getPattyCal(){
        if(patty == PATTY2){return PATTY2CAL;}
        if(patty == PATTY3){return PATTY3CAL;}
        return PATTY1CAL;
    }


    public void yesNoCheese(){
        if(cheesee){cheesee = false;}
        else{cheesee = true;}
    }
    public Double getCheese(){
        if(cheesee){return CHEESE;}
        else{return 0.0;}
    }


    public void setSauce(double sauce){this.sauce = sauce;}
    public Double getSauce(){return sauce;}


    public Double getVeggies(){
        double temp = 0.0;
        if(veg1){temp += VEGGIE1CAL;}
        if(veg2){temp += VEGGIE2CAL;}
        if(veg3){temp += VEGGIE3CAL;}
        return temp;
    }
    public void yesNoVeggie1(){veg1 = true;}
    public void yesNoVeggie2(){veg2 = true;}
    public void yesNoVeggie3(){veg3 = true;}

}
