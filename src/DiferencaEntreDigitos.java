import java.util.Scanner;

public class DiferencaEntreDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
       
        int soma = 0;
        int digito = 0;
        int multiplicacao = 1;
       
        while (numero > 0) {
            digito = numero % 10;
           
            soma = soma + digito;
            multiplicacao = multiplicacao * digito;
           
            numero = numero / 10;
        }
   
        int diferenca = multiplicacao - soma;
       
        System.out.println(diferenca);

    scan.close();
    }
}