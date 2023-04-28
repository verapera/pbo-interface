package bangundatar;

import interfaces.Simetri;
import interfaces.keliling;

public class PersegiPanjang extends BangunDatar implements keliling, Simetri{
    public int panjang;
    public int lebar;

    @Override
    public double hitungLuas(){
        return this.panjang * this.lebar;
    }
    
    @Override
    public double hitungkeliling(){
        return 2 * (this.panjang + this.lebar) ;
    }
    
    @Override
    public double hitungSimLipat(){
        return 2.0;
    }
    
    @Override
    public double hitungSimPutar(){
        return 2.0;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("luas = "+this.hitungLuas());
        System.out.println("keliling = "+this.hitungkeliling());
        System.out.println("sim. putar = "+this.hitungSimLipat());
        System.out.println("sim. lipat= "+this.hitungSimPutar());
    }
}

