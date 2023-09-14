import java.util.Scanner;

public class CalculoSalarioFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor para armazenar os salários de dois funcionários
        final int NUM_FUNCIONARIOS = 2;
        int[] numerosFuncionarios = new int[NUM_FUNCIONARIOS];
        double[] salarios = new double[NUM_FUNCIONARIOS];

        for (int i = 0; i < NUM_FUNCIONARIOS; i++) {
            System.out.print("Digite o número do funcionário " + (i + 1) + ": ");
            numerosFuncionarios[i] = scanner.nextInt();

            System.out.print("Digite o número de horas trabalhadas do funcionário " + (i + 1) + ": ");
            double horasTrabalhadas = scanner.nextDouble();

            System.out.print("Digite o valor recebido por hora do funcionário " + (i + 1) + ": ");
            double valorPorHora = scanner.nextDouble();

            // Calcula o salário do funcionário
            salarios[i] = horasTrabalhadas * valorPorHora;
        }

        // Fecha o Scanner, pois não será mais necessário
        scanner.close();

        // Imprime os números e salários dos funcionários com duas casas decimais
        for (int i = 0; i < NUM_FUNCIONARIOS; i++) {
            System.out.println("Número do funcionário " + (i + 1) + ": " + numerosFuncionarios[i]);
            System.out.printf("Salário do funcionário " + (i + 1) + ": %.2f%n", salarios[i]);
        }
    }
}
