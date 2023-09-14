import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma forma geométrica:");
        System.out.println("1. Triângulo");
        System.out.println("2. Círculo");
        System.out.println("3. Trapézio");
        System.out.println("4. Quadrado");
        System.out.println("5. Retângulo");
        int escolha = scanner.nextInt();

        double area = 0.0;

        switch (escolha) {
            case 1:
                System.out.print("Digite a base (A): ");
                double base = scanner.nextDouble();
                System.out.print("Digite a altura (C): ");
                double altura = scanner.nextDouble();
                area = (base * altura) / 2.0;
                break;
            case 2:
                System.out.print("Digite o raio (C): ");
                double raio = scanner.nextDouble();
                area = Math.PI * Math.pow(raio, 2);
                break;
            case 3:
                System.out.print("Digite a base maior (A): ");
                double baseMaior = scanner.nextDouble();
                System.out.print("Digite a base menor (B): ");
                double baseMenor = scanner.nextDouble();
                System.out.print("Digite a altura (C): ");
                double alturaTrap = scanner.nextDouble();
                area = ((baseMaior + baseMenor) * alturaTrap) / 2.0;
                break;
            case 4:
                System.out.print("Digite o lado (A): ");
                double lado = scanner.nextDouble();
                area = lado * lado;
                break;
            case 5:
                System.out.print("Digite a base (A): ");
                double baseRetangulo = scanner.nextDouble();
                System.out.print("Digite a altura (B): ");
                double alturaRetangulo = scanner.nextDouble();
                area = baseRetangulo * alturaRetangulo;
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        System.out.println("A área da forma geométrica escolhida é: " + area);

        scanner.close();
    }
}
