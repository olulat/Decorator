package com.olulat.decorator;

class DecoHolder implements DecoInterface {
    protected DecoInterface dress;

    public  DecoHolder(DecoInterface c){
        this.dress = c;
    }

    @Override
    public void dressUp() {
        this.dress.dressUp();
    }
}
