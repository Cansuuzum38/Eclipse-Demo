package week5;

public class ��gen extends �ekil implements I�ekil1,I�ekil2   {
	
	private double K1;
	private double K2;
	private double K3;
	
	public ��gen() {
		
	}
	public ��gen(String isim,double K1,double K2,double K3) {
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
		return "�cgenin �evresi:  "+this.cevreHesapla()+"     ��genin katl� �evresi: "+this.cevreHesapla(2);
	
      }
   
      }