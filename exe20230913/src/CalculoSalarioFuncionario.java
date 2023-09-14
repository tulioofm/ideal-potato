import java.util.Scanner;

public class CalculoSalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = scanner.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor recebido por hora: ");
        double valorPorHora = scanner.nextDouble();

        // Calcula o salário do funcionário
        double salario = horasTrabalhadas * valorPorHora;

        // Fecha o Scanner, pois não será mais necessário
        scanner.close();

        // Imprime o número do funcionário e o salário com duas casas decimais
        System.out.println("Número do funcionário: " + numeroFuncionario);
        System.out.printf("Salário: %.2f%n", salario);
    }
}
