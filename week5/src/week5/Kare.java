package week5;

public class Kare extends �ekil implements I�ekil1,I�ekil2 {
	
	private double kenar;
	
	public Kare() {
		
	}
	public Kare(String isim,double kenar) {
		super(isim);
		this.kenar=kenar;
		
	}

	@Override
	public double cevreHesapla(int k) {
		return this.cevreHesapla();
	}

	@Override
	public double cevreHesapla() {
		return 4*kenar;
	}
	public String toString() {
		return "Karenin �evresi:  "+ this.cevreHesapla();
		
	}

}
