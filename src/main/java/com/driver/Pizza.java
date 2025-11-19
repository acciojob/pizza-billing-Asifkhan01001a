package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean isExtraCheeseAdd;
    boolean isExtraToppingsAdd;
    boolean isPaperBag;

    int veg=300;
    int nonVeg=400;
    int extraCheese=80;
    int extraToppingsVeg=70;
    int extraToppingsNonveg=120;
    int paperPag=20;

    boolean billGenerated=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=veg;
        }
        else{
            this.price=nonVeg;
        }
    }

    public int getPrice(){

        return this.price;

    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdd){
            this.price += extraCheese;
            isExtraCheeseAdd = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdd){
            if(isVeg){
                this.price += extraToppingsVeg;
            } else {
                this.price += extraToppingsNonveg;
            }
            isExtraToppingsAdd = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBag){
            this.price += paperPag;
            isPaperBag = true;
        }
    }

    public String getBill(){
        // your code goes here

        if(!billGenerated){
            bill+="Base Price Of The Pizza: "+(isVeg?veg:nonVeg)+"\n";
            if(isExtraCheeseAdd){
                bill+="Extra Cheese Added: "+extraCheese+"\n";
            }
            if(isExtraToppingsAdd){
                if(isVeg)
                    bill+="Extra Toppings Added: "+extraToppingsVeg+"\n";
                else
                    bill+="Extra Toppings Added: "+extraToppingsNonveg+"\n";
            }
            if(isPaperBag){
                bill+="Paperbag Added: "+paperPag+"\n";
            }
            bill+="Total Price: "+this.price+"\n";
            billGenerated = true;
        }

        return this.bill;
    }
}
