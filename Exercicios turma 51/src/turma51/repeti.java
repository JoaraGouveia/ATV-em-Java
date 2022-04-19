package turma51;

import java.util.Scanner;


public class repeti {

	public static void main(String[] args) {
		
		
		Scanner number = new Scanner(System.in);
		
		int num,x, contPar = 0, contImpar = 0;
		System.out.println("\n Digite 10 algarítmos: ");
		
		for (x=1; x<=10; x++)
		{
			num = number.nextInt();
					if(num %2 ==0) {
						contPar++;
					}
					else {
						contImpar++;
						
					}
		}
				System.out.println("Você digitou "+contPar+" números pares e "+contImpar+"números impares");
		
	}

	private static Object x(int i, int j) {
		
		return null;
	}

}