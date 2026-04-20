public class Calculos {

    public static boolean primo(int num){
        int contador = 0;

        if (num <= 1){
            return false;
        }

        for (int y = 1; y <= num; y++) {
            if (num % y == 0){
                contador++;
            }
        }
        return contador == 2;
    }


    public static int divisores(int num){
        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0){
                System.out.println(i + " É um divisor");
            }

        }
        return num;
    }


    public static boolean palindromo(int num){

        while (num == 0){
            num = num % 10;
            System.out.println(num);
        }

        return num;
    }

}
