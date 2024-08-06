package ProcessoSeletivo;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int parametro1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int parametro2 = scanner.nextInt();

            if (parametro1 > parametro2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            int contagem = parametro2 - parametro1;

            for (int i = 0; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Ambos os parâmetros devem ser números inteiros.");
        }
    }
}


