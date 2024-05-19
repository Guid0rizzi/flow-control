import businessRules.ParametrosInvalidosException;

import java.util.Scanner;


public class UserContador {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numeroInicial, numeroFinal;
        System.out.println("Coloque o numero que vai se iniciar");
        numeroInicial = sc.nextInt();
        System.out.println("Coloque o numero que a contagem vai acabar");
        numeroFinal = sc.nextInt();
        try {
            Contador.contar(numeroInicial, numeroFinal);
        }catch (ParametrosInvalidosException e){
            System.out.println("O primeiro numero precisa ser maior do que o segundo");
        }
    }
}
