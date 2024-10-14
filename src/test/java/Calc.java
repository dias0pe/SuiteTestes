public class Calc {

    public static double calcularIMC(double peso, double altura) {
        return peso / Math.sqrt(altura);
    }

    public static String peso(double imc) {
        if (imc < 20) {
            return "Abaixo do peso";
        } else if (imc >= 20 && imc < 25) {
            return "Peso Normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobre Peso";
        } else if (imc >= 30 && imc < 40) {
            return "Obeso";
        } else {
            return "Obeso Mórbido";
        }
    }

    public static double pesoCrianca(int idade) {
        if (idade >= 3 && idade <= 10) {
            return (idade * 2) + 9;
        } else {
            throw new IllegalArgumentException("Idade inválida para cálculo de peso ideal de criança.");
        }
    }

    public static double pesoAdulto(double altura, boolean homem) {
        if (altura > 0) {
            double imcDesejado = homem ? 22 : 21;
            return imcDesejado * Math.sqrt(altura);
        } else {
            throw new IllegalArgumentException("Altura inválida para cálculo de peso ideal de adulto.");
        }
    }

    public static double pesoIdoso(double altura, int idade) {
        if (idade >= 65 && altura > 0) {
            double imcPercentil = getIMCPercentil(idade);
            return imcPercentil * (altura * altura);
        } else {
            throw new IllegalArgumentException("Idade ou altura inválidas para cálculo de peso ideal de idoso.");
        }
    }

    private static double getIMCPercentil(int idade) {
        if (idade >= 65 && idade <= 69) {
            return 24.3; // Homens
        } else if (idade >= 70 && idade <= 74) {
            return 23.9; // Homens
        } else if (idade >= 75 && idade <= 79) {
            return 23.7; // Homens
        } else if (idade >= 80 && idade <= 84) {
            return 23.1; // Homens
        } else if (idade > 85) {
            return 22.1; // Homens
        } else if (idade >= 65 && idade <= 69) {
            return 26.5; // Mulheres
        } else if (idade >= 70 && idade <= 74) {
            return 26.3; // Mulheres
        } else if (idade >= 75 && idade <= 79) {
            return 26.1; // Mulheres
        } else if (idade >= 80 && idade <= 84) {
            return 25.5; // Mulheres
        } else if (idade > 85) {
            return 23.6; // Mulheres
        } else {
            throw new IllegalArgumentException("Idade inválida para cálculo de peso ideal de idoso.");
        }
    }
}