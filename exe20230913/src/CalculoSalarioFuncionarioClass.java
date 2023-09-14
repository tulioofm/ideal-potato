import java.util.Scanner;

public class CalculoSalarioFuncionarioClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = scanner.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor recebido por hora: ");
        double valorPorHora = scanner.nextDouble();

        // Cria uma instância da classe Funcionario
        Funcionario funcionario = new Funcionario(numeroFuncionario, horasTrabalhadas, valorPorHora);

        // Fecha o Scanner, pois não será mais necessário
        scanner.close();

        // Imprime o número do funcionário e o salário com duas casas decimais
        System.out.println("Número do funcionário: " + funcionario.getNumero());
        System.out.printf("Salário: %.2f%n", funcionario.calcularSalario());
    }
}

// Definição da classe Funcionario
class Funcionario {
    private int numero;
    private double horasTrabalhadas;
    private double valorPorHora;

    // Construtor da classe Funcionario
    public Funcionario(int numero, double horasTrabalhadas, double valorPorHora) {
        this.numero = numero;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    // Método para calcular o salário do funcionário
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    // Método para obter o número do funcionário
    public int getNumero() {
        return numero;
    }
}
