package bangundatar;
import interfaces.*;

public class Lingkaran extends BangunDatar implements keliling, Simetri {
    public int jejari;

    @Override
    public double hitungLuas(){
        return Math.PI * this.jejari * this.jejari;
    }
    
    @Override
    public double hitungkeliling(){
        return 2 * Math.PI * this.jejari ;
    }
    
    @Override
    public double hitungSimLipat(){
        return Double.POSITIVE_INFINITY;
    }
    
    @Override
    public double hitungSimPutar(){
        return Double.POSITIVE_INFINITY;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("luas = "+this.hitungLuas());
        System.out.println("keliling = "+this.hitungkeliling());
        System.out.println("sim. putar = "+this.hitungSimLipat());
        System.out.println("sim. lipat= "+this.hitungSimPutar());
    }
}
