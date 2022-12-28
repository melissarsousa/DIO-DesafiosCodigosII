import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();

        if (jogadaJogador == jogadaInimigo) {
            System.out.println("Empatou");
        } else if ((jogadaJogador == 1 && jogadaInimigo == 2) || (jogadaJogador == 2 && jogadaInimigo == 3)
                || (jogadaJogador == 3 && jogadaInimigo == 1)) {
            System.out.println("Perdeu");
        } else {
            System.out.println("Ganhou");
        }

    // perde: 1 contra 2; 2 contra 3; 3 contra 1

        leitor.close();
    }
}