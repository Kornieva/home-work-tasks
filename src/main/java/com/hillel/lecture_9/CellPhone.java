package com.hillel.lecture_9;

public class CellPhone extends Phone {
    private int screen;
    private int memory;

    public CellPhone(String provider, String type, String os, String color, String number) {
        super(provider, type, os, color, number);
    }

    public void charging(){
        System.out.println("This cell phone is charging");
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getInfo(){
        return String.format("Provider is: %s, type of phone is: %s, OS is: %s, color is: %s, number is: %s, screen is: %s, memory is: %s"
                , this.getProvider(), this.getType(), this.getOs(), this.getColor(), this.getNumber(), this.screen, this.memory);
    }

    @Override
    public String call(Phone phoneTwo){
        return String.format("Call from %s to %s is in progress  on the street", this.toString(), phoneTwo.toString());
    }

    public String call(){
        String[] errors = {"Phone is broken", "Line is busy", "No network", "You have no money"};
        int reason = (int) (Math.random() * 5);

        return String.format("You can't do call because: %s" , errors[reason]);
    }
}
