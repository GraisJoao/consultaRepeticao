import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int num, escolha, divisores;

        System.out.println("Fale qual programa você quer usar:");
        System.out.println("[1] Primos");
        System.out.println("[2] Divisores");
        System.out.println("[3] Palíndromo");

        escolha = teclado.nextInt();

        switch (escolha){
            case 1:

                System.out.println("Escreva um valor natural");
                num = teclado.nextInt();

                for (int x = 1; x <= num; x++) {
                    if (Calculos.primo(x)) {
                        System.out.println(x + " é primo");
                    }
                }
            break;

            case 2:
                System.out.println("Digite um valor natural");
                num = teclado.nextInt();
                divisores = Calculos.divisores(num);
            break;

            case 3:
                System.out.println("Digite um número natural:");
                num = teclado.nextInt();
                if (Calculos.palindromo(num)){
                    System.out.println(num);
                }

            break;

            default:
                System.out.println("Nenhuma classe encontrada com esse número!");



        }
    }
}
