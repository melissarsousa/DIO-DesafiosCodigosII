import java.util.HashSet;
import java.util.Scanner;

public class NumeroFeliz {
    public static int somaQuadrado(int num) {
        int somaAoQuadrado = 0;
        while (num != 0) {
            somaAoQuadrado += (num % 10) * (num % 10);
            num /= 10;
        }
        return somaAoQuadrado;
    }

    public static boolean numeroEhFeliz(int num) {

        HashSet<Integer> numeroFeliz = new HashSet<>();

        while (true) {

            num = somaQuadrado(num);
            if (num == 1)
                return true;
            if (numeroFeliz.contains(num))
                return false;
            numeroFeliz.add(num);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean numero_feliz = numeroEhFeliz(n);
        System.out.println(numero_feliz);
    }
}
