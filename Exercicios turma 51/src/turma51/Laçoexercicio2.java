package turma51;
import java.util.Scanner;

public class La�oexercicio2 {
    
	
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf(" Digite o primeiro n�mero? %n");
        double x1 = teclado.nextDouble();
        System.out.printf("Digite o segundo n�mero? %n");
        double x2 = teclado.nextDouble();
        System.out.printf("Digite o terceiro n�mero? %n");
        double x3 = teclado.nextDouble();
        double max;
        max = x1;
        if (max > x2) {
            if (max > x3) {
                System.out.printf("O maior � max %n", x1);
        } else{
                System.out.printf("O maior � %g",x3);
            }  
        }else{
            System.out.printf("O maior � %g",x2);  
        }
     }
}