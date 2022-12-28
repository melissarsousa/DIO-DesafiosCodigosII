import java.util.Scanner;

public class QuantidadeNecessaria {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);
       
        int casos_teste = scanner.nextInt();
        double amigos = scanner.nextDouble();
        double fatias = scanner.nextDouble();
       
        while (casos_teste > 0) {
            double pizza = (amigos*fatias/SLICE);
   
            int pizzaInt = (int)pizza;
            double pizzaDecimal = pizza - pizzaInt;
         
            if(pizzaDecimal == 0) {
                System.out.print(pizzaInt);
            }
            else {
                System.out.println(pizzaInt+1);
            }
        casos_teste--;
        }

    scanner.close();
    }
}