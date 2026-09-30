package semana01;

import java.util.Scanner;

public class CotacaoFrete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a distância: ");
        int distancia = input.nextInt();

        System.out.println("Digite o peso da mercadoria: ");
        double peso = input.nextDouble();

        double taxaFixa = 15;
        double resultado = taxaFixa + (distancia * 1.20) + (peso * 0.50);
        System.out.println("Valor do frete: " + resultado);

       /* int distanciaKm = 100;
        double pesoKg = 10;
        double valorFrete = 15; */

       // double resultado = valorFrete + (distanciaKm * 1.20) + (pesoKg * 0.50);

       // System.out.println("Valor do frete: " + resultado);
    }
}
