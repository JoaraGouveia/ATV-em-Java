package Herança;

public class Animal2 {

	
	public static void main(String[] args) {
		
		Vaca vaca = new Vaca("Vaca",10, "SIM", "SIM" );
		Gato gato = new Gato("Gato", 02, "SIM", "SIM");
		
		
		
		System.out.print("****************MUUUUU****************");
		vaca.impimirVaca();
		System.out.print("\n*****************MIAUUU**************");
		gato.impimirGato();
		
		
	}
}