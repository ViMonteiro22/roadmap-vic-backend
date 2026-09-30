package semana01;

public class CotacaoFrete {
    public static void main(String[] args) {
        int distanciaKm = 100;
        double pesoKg = 10;
        double valorFrete = 15;

        double resultado = valorFrete + (distanciaKm * 1.20) + (pesoKg * 0.50);

        System.out.println("Valor do frete: " + resultado);
    }
}
