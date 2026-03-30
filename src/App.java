// Nome: Bernardo Andrade de Castro
// Matrícula: 1261949045

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double soma = 0;
        while (true) {

            System.out.print("digite um número para a soma( digite 0 para encerrar): ");
            double numero = entrada.nextDouble();

            if (numero == 0) {
                break;
            }
            soma += numero;

        }

        System.out.print("A soma total é: " + soma);
        entrada.close();
    }
}
