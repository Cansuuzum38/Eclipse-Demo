package week5;

public class üçgen extends Þekil implements IÞekil1,Iþekil2   {
	
	private double K1;
	private double K2;
	private double K3;
	
	public üçgen() {
		
	}
	public üçgen(String isim,double K1,double K2,double K3) {
		super(isim);
		this.K1=K1;
		this.K2=K2;
		this.K3=K3;
		
	}
	@Override
	public double cevreHesapla(int k) {
		return (K1+K2+K3)*k;
	}
	@Override
	public double cevreHesapla() {
		return K1+K2+K3;
	}
      public String toString() {
		return "Ücgenin çevresi:  "+this.cevreHesapla()+"     Üçgenin katlý çevresi: "+this.cevreHesapla(2);
	
      }
   
      }