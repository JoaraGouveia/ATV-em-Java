package turma51;
import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args)  {
 
		Scanner fabrica = new Scanner(System.in);
		int N, horas, minutos, segundos;

		N = fabrica.nextInt();

		horas = N / 3600;
		minutos = (N % 3600) / 60;
		segundos = (N % 3600) % 60;
		System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}