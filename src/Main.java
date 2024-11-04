import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean valorValido = false;
        Double valor1 = 0.0;
        Double valor2 = 0.0;

        while (!valorValido) {
            System.out.println("Primeiro valor: ");
            if (input.hasNextDouble()) {
                valor1 = input.nextDouble();
                valorValido = true;
            } else {
                input.nextLine();
                System.out.println("ERRO: Primeiro valor invalido.");
            }
        }

        valorValido = false;

        while (!valorValido) {
            System.out.println("Segundo valor: ");
            if (input.hasNextDouble()) {
                valor2 = input.nextDouble();
            } else {
                input.nextLine();
                System.out.println("ERRO: Segundo valor invalido.");
            }
        }
            valorValido = false;

            while (!valorValido) {
                System.out.println("Operador (+)(-)(/)(*): ");
                String operacao = input.nextLine();

                switch (operacao) {
                    case "+":
                        System.out.println("Resultado: " + (valor1 + valor2));
                        valorValido = true;
                        break;
                    case "-":
                        System.out.println("Resultado: " + (valor1 - valor2));
                        valorValido = true;
                        break;
                    case "/":
                        System.out.println("Resultado: " + (valor1 / valor2));
                        valorValido = true;
                        break;
                    case "*":
                        System.out.println("Resultado: " + (valor1 * valor2));
                        valorValido = true;
                        break;
                    default:
                        System.out.println("ERRO: Operador invalido.");
                }
            }
        }
    }