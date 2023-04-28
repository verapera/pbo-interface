package bangundatar;

import interfaces.*;

public class Persegi extends BangunDatar implements keliling, Simetri {
  public int sisi;

    @Override
    public double hitungLuas(){
        return this.sisi * this.sisi;
    }
    
    @Override
    public double hitungkeliling(){
        return 4 * this.sisi ;
    }
    
    @Override
    public double hitungSimLipat(){
        return 4.0;
    }
    
    @Override
    public double hitungSimPutar(){
        return 4.0;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("luas = "+this.hitungLuas());
        System.out.println("keliling = "+this.hitungkeliling());
        System.out.println("sim. putar = "+this.hitungSimLipat());
        System.out.println("sim. lipat= "+this.hitungSimPutar());
    }
}
