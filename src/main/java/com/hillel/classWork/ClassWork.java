package com.hillel.classWork;

public class ClassWork {
    public static void main(String[] args) {
        int [] emptyNumber= {};
        System.out.println(emptyNumber.length);

        int [] numbers= {0,1,2,3,4};
        System.out.println(numbers.length);
        System.out.println(numbers[3]);
        System.out.println(numbers[5]);

        String [] names = {"ivan", "Anna"};
        System.out.println(names[0]);
    }
}