package turma51;
import java.util.Scanner;

public class Laçoexercicio2 {
    
	
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf(" Digite o primeiro número? %n");
        double x1 = teclado.nextDouble();
        System.out.printf("Digite o segundo número? %n");
        double x2 = teclado.nextDouble();
        System.out.printf("Digite o terceiro número? %n");
        double x3 = teclado.nextDouble();
        double max;
        max = x1;
        if (max > x2) {
            if (max > x3) {
                System.out.printf("O maior é max %n", x1);
        } else{
                System.out.printf("O maior é %g",x3);
            }  
        }else{
            System.out.printf("O maior é %g",x2);  
        }
     }
}