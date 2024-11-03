import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        Double valor1 =input.nextDouble();

        System.out.println("Segundo valor: ");
        Double valor2 =input.nextDouble();

        System.out.println("Operador (+)(-)(/)(*): ");
        String operacao = input.next();

        input.close();

        switch(operacao){
            case "+":
                System.out.println("Resultado: "+(valor1+valor2));
                break;
            case "-":
                System.out.println("Resultado: "+(valor1-valor2));
                break;
            case "/":
                System.out.println("Resultado: "+(valor1/valor2));
                break;
            case "*":
                System.out.println("Resultado: "+(valor1*valor2));
                break;
            default:
                System.out.println("ERRO: Operador invalido.");




        }
    }
}