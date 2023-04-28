package bangundatar;

import interfaces.Simetri;
import interfaces.keliling;

public class Segitiga extends BangunDatar {
    public int alas;
    public int tinggi;

    @Override
    public double hitungLuas(){
        return this.alas * this.tinggi / 2.0;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("luas = "+this.hitungLuas());
        
    }
}

