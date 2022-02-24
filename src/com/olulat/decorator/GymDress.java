package com.olulat.decorator;

class GymDress extends DecoHolder{
    public GymDress(DinnerDress c) {
        super(c);
    }

    @Override
    public void dressUp() {
        super.dressUp();
        System.out.println("Adding sport dress features");
    }
}
