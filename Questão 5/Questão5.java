/*
5) Faça um programa que receba a temperatura média de cada mês do ano
e armazene-as em uma lista. Após isto, calcule a média anual das
temperaturas e mostre todas as temperaturas acima da média anual, e em
que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 –
Fevereiro, . . . ).
 */
package questão.pkg5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Questão5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Double> temperaturaMedia = new ArrayList<Double>();
        int controlador = 1;
        Scanner scanner = new Scanner(System.in);
        Double temperaturaTotal = 0.0;
        for(int i = 0; i<12; i++){
            System.out.println("Insira a temperatura media do mes " + controlador);
            Double temperatura = scanner.nextDouble();
            temperaturaTotal += temperatura;
            temperaturaMedia.add(temperatura);
            controlador++;
            
        }
        String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        Double mediaTemperatura = temperaturaTotal/(controlador-1);
        System.out.println(mediaTemperatura);
        System.out.println(temperaturaMedia.toString());
        for(int i=0; i<12;i++){
            if (temperaturaMedia.get(i) >= mediaTemperatura){
                System.out.println("No mes de " + meses[i] + " fez " + temperaturaMedia.get(i) + " graus celsius");
            }
        }
    }
    
}
