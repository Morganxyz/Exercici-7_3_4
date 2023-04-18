import java.util.Scanner;

public class M73Ex_4_Damat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dni = 0;
		String lletra = "";
		int modulo = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix el teu numero de DNI, sense la lletra: ");
		dni = entrada.nextInt();
		
		System.out.println("Introdueix la lletra del teu DNI: ");
		lletra = entrada.next();
		
		String [] lletres = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S",
				"Q","V","H","L","C","K","E"};
		
		//modulo 0 = letra t array pos 0
		//++modulo = 1  --> letra r array pos 1
		modulo = dni % 23;
	
			if(lletra.equalsIgnoreCase(lletres[modulo])) {
				System.out.println("La lletra es correcta");
			}else {
				System.out.println("La lletra introduïda no es correcta, la lletra correcta del DNI es : " +
			lletres[modulo]);
	
	}
}
}
	


