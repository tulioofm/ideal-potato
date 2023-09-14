import java.util.Scanner;

public class SomaNumero {
    public static void main(String[] args) {
        // Crie um objeto Scanner para ler da entrada padrão (teclado)
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicite ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Feche o objeto Scanner, pois não será mais necessário
        scanner.close();

        // Calcule a soma dos dois números
        double resultado = numero1 + numero2;

        // Imprima o resultado
        System.out.println("A soma dos números é: " + resultado);
    }
}
