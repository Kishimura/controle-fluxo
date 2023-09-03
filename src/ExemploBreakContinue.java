public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        
        for (int numero = 1; numero <= 5; numero ++) {
            if (numero == 3)
                 break;

                 System.out.println(numero);

                 //O comando break interrompe o laço, já o continue interrompe somente a iteração atual.
                 //No caso, se formos corntar até 5 e a condição é que assim que chegar no 3 é quebrar, então
                 //não irá imprimir o valor de 3, e irá parar toda a instrução, já o continue só para o atual.
        }
    }
    
}
