package com.inheritance.latihan;

public class Ali extends Manusia {

    
    
    @Override
    public void melihat() {
        System.out.println("Yossi "+super.mata);
        
         }

    @Override
    public void lari() {
        super.lari(); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void belajar() {
        System.out.println("Yossi Belajar");
    }

}
