package com.hillel.lecture_9;

import java.util.Objects;

public class Phone {
    private String provider;
    private String type;
    private String os;
    private String color;
    private String number;

    public Phone(String provider, String type, String os, String color, String number){
        this.provider = provider;
        this.type = type;
        this.os = os;
        this.color = color;
        this.number = number;
    }

    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }
    public void setPhoneNumber(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getInfo(){
        return  this.provider + " " + this.type + " " + " " + this.color + " " + this.os + " " + this.number;
    }

    public String call(Phone phoneTwo){
        return String.format("Call from %s to %s is in progress", this.toString(), phoneTwo.toString());
    }

    public String down(Phone phoneTwo){
        return String.format("Call from %s to %s was ended", this.toString(), phoneTwo.toString());
    }

    @Override
    public String toString(){
        return this.color + " " + this.type;
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Phone phone = (Phone) p;
        return provider.equals(phone.provider) &&
                type.equals(phone.type) &&
                os.equals(phone.os) &&
                color.equals(phone.color) &&
                number.equals(phone.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, type, os, color, number);
    }
}

