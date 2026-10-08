package semana01;

import java.util.Scanner;

public class CotacaoFrete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Digite a distância: ");
            int distancia = input.nextInt();

            System.out.println("Digite o peso da mercadoria: ");
            double peso = input.nextDouble();

            if (distancia <= 0 || peso <= 0) {
                System.out.println("Distância e peso devem ser maiores que zero.");
                continue;
            }

            boolean urgente;

            while (true) {
                System.out.println("A entrega é urgente? SIM/NÃO");
                String resposta = input.next();

                if (!resposta.equalsIgnoreCase("SIM")
                        && !resposta.equalsIgnoreCase("NAO")
                        && !resposta.equalsIgnoreCase("NÃO")) {
                    System.out.println("Erro: Digite SIM ou NÃO.");
                    continue;
                }

                urgente = resposta.equalsIgnoreCase("SIM");
                break;
            }

            if (urgente) {
                System.out.println("Mercadoria será urgente, terá adicional de 20%!");
            } else {
                System.out.println("Mercadoria não urgente!");
            }

            double taxaFixa = 15;
            double resultado = taxaFixa + (distancia * 1.20) + (peso * 0.50);
            if (urgente) {
                double acrescimo = resultado * 0.20;
                resultado = resultado + acrescimo;
            }
            System.out.println("Valor do frete: " + resultado);


            System.out.println("Deseja fazer uma nova cotação? true/false");
            boolean novaCotacao = input.nextBoolean();

            if (novaCotacao) {
                continue;
            } else {
                break;
            }
        }
    }
}
