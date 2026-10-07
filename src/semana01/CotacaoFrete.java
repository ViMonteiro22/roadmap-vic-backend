package semana01;

import java.util.Scanner;

public class CotacaoFrete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a distância: ");
        int distancia = input.nextInt();

        System.out.println("Digite o peso da mercadoria: ");
        double peso = input.nextDouble();

        System.out.println("A entrega é urgente? true/false");
        boolean urgente = input.nextBoolean();

        if (urgente){
            System.out.println("Mercadoria será urgente!");
        } else {
            System.out.println("Mercadoria não urgente");
        }

        double taxaFixa = 15;
        double resultado = taxaFixa + (distancia * 1.20) + (peso * 0.50);
        if (urgente){
           double acrescimo = resultado * 0.20;
           resultado = resultado + acrescimo;
        }
        System.out.println("Valor do frete: " + resultado);
    }
}
