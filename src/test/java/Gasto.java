public class Gasto {

    public static double calcularTMB(int idade, double peso, boolean homem) {
        if (idade < 10) {
            throw new IllegalArgumentException("Idade inválida para cálculo da TMB.");
        }

        if (homem) {
            if (idade >= 10 && idade <= 18) {
                return 17.5 * peso + 651;
            } else if (idade >= 18 && idade <= 30) {
                return 15.3 * peso + 679;
            } else if (idade >= 30 && idade <= 60) {
                return 8.7 * peso + 879;
            } else { // idade > 60
                return 13.5 * peso + 487;
            }
        } else { // mulher
            if (idade >= 10 && idade <= 18) {
                return 12.2 * peso + 746;
            } else if (idade >= 18 && idade <= 30) {
                return 14.7 * peso + 496;
            } else if (idade >= 30 && idade <= 60) {
                return 8.7 * peso + 829;
            } else { // idade > 60
                return 10.5 * peso + 596;
            }
        }
    }

    public static double calcularNecessidadeDiariaEnergia(double tmb, double fatorAtividade) {
        return tmb * fatorAtividade;
    }

    public static double getFatorAtividade(String nivelAtividade) {
        switch (nivelAtividade) {
            case "sedentario":
                return 1.2;
            case "levemente ativo":
                return 1.3;
            case "moderadamente ativo":
                return 1.45;
            case "ativo":
                return 1.5;
            case "muito ativo":
                return 1.7;
            default:
                throw new IllegalArgumentException("Nível de atividade inválido.");
        }
    }
}