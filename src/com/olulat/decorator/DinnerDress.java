package com.olulat.decorator;

class DinnerDress extends DecoHolder{
    public DinnerDress(DecoInterface c) {
        super(c);
    }

    @Override
    public void dressUp() {
        super.dressUp();
        System.out.println("Adding dinner dress features");
    }
}
