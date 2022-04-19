package turma51;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int Anos, Meses, Dias, IdadeTotalDias;
	
	System.out.print("Calculadora de idade em dias\n\n"); 


	System.out.print("Digite os anos: ");
	Anos = entrada.nextInt();
	
	System.out.print("Digite os meses: ");
	Meses = entrada.nextInt();

	System.out.print("Digite os dias: ");
	Dias = entrada.nextInt();


	IdadeTotalDias = Anos * 365 + Meses * 30 + Dias;
	System.out.print("Idade total em dias = "+IdadeTotalDias+"\n");
	
    }

}