import java.util.Scanner;

public class EmboscadaNoRpg {
    public static void main(String[] args){ 
        Scanner leitor = new Scanner(System.in); 
 
        int dados = leitor.nextInt(); 
        int vidaDoJogador = leitor.nextInt(); 
        int ataqueDoJogador= leitor.nextInt(); 
        int defesaDoJogador = leitor.nextInt(); 
        int vidaDoInimigo= leitor.nextInt(); 
        int ataqueDoInimigo = leitor.nextInt();
        
        int danoAoJogador;
        int danoAoInimigo;

        if (dados > 8 && dados < 10){
            danoAoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados)*2);
        } else {
            danoAoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));
        }

        if (danoAoJogador <= 0) {
            System.out.println("Jogador nao sobreviveu");
        } else if (dados > 8 && dados < 10){
            danoAoInimigo = vidaDoInimigo - (ataqueDoJogador + dados)*2;
            if (danoAoInimigo <= 0){
                System.out.println("Jogador sobreviveu e derrotou o inimigo");
            } else {
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
            }
        }  else {
            danoAoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);
            if (danoAoInimigo <= 0){
                System.out.println("Jogador sobreviveu e derrotou o inimigo");
            } else {
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
            }
        }

    leitor.close();
    }
}
