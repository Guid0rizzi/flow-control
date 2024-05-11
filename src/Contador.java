import businessRules.ParametrosInvalidosException;

;

public class Contador {
    public static void contar(int numeroInicial, int numeroFinal) throws ParametrosInvalidosException {
        if (numeroInicial <= numeroFinal){
            throw new  ParametrosInvalidosException();
        }
        int contagem = numeroInicial - numeroFinal;
        for (int i = 1; i<=contagem; i++){
            System.out.println(i);
        }
    }
}
