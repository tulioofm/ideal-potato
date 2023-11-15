public class IMCCalculator {
    public static void main(String[] args) {
        double peso = 75; // Peso em quilogramas
        double altura = 1.68; // Altura em metros

        double imc = calcularIMC(peso, altura);
        String classificacao = classificarIMC(imc);

        System.out.printf("Seu IMC é %.2f e sua classificação é: %s%n", imc, classificacao);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Saudável";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }
}
