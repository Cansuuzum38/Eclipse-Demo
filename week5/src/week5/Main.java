package week5;

public class Main {

	public static void main(String[] args) {
		Şekil şekil[]=new Şekil[4];

		şekil[0]=new üçgen();
		şekil[1]=new üçgen("Üçgen",3,4,5);
		şekil[2]=new Kare();
		şekil[3]=new Kare("Kare",8);
		
		    for(int i=0; i<4; i++){
			System.out.println(şekil[i]);
			
		}
		    Şekil ş1=new üçgen();
		    IŞekil1 ş2=(IŞekil1)ş1;
			
			}

	

}
