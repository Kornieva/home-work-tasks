package com.hillel.lecture_9;

public class LandLinePhone extends Phone {
    private String answeringMachine;
    private int price;

    public LandLinePhone(String provider, String type, String os, String color, String number) {
        super(provider, type, os, color, number);
    }

    public String getAnsweringMachine() {
        return answeringMachine;
    }

    public void setAnsweringMachine(String answeringMachine) {
        this.answeringMachine = answeringMachine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getInfo(){
        return String.format("Provider is: %s, type of phone is: %s, OS is: %s, number is: %s, color is: %s, answeringMachine is: %s, price is: %s"
                , this.getProvider(), this.getType(), this.getOs(), this.getColor(), this.getNumber(), this.answeringMachine, this.price);
    }

    @Override
    public String call(Phone phoneTwo){
        return String.format("Call from %s to %s is in progress in the house"
                , this.toString(), phoneTwo.toString());
    }

    public String call(){
        String[] errors = {"Phone is broken", "Line is busy", "It is no phone in the house", "You have no money"};
        int reason = (int) (Math.random() * 5);

        return String.format("You can't do call because: %s" , errors[reason]);
    }
}
