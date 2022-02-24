package com.olulat.decorator;

public class runner {
    public static void main(String[] args) {

DecoInterface allDress = new GymDress(new DinnerDress ( new NormalDress()));
DecoInterface dDress = new DinnerDress(new NormalDress ());

allDress.dressUp();

System.out.println("All dress end");

dDress.dressUp();

System.out.println("Dinner Dress End");
System.out.println();

    }
}
