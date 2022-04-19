/*
7) Faça um programa que carregue uma lista com os modelos de cinco carros
(exemplo de modelos: FUSCA, GOL, VECTRA etc). Carregue uma outra lista
com o consumo desses carros, isto é, quantos quilômetros cada um desses
carros faz com um litro de combustível. Calcule e mostre:
a) O modelo do carro mais econômico;
b) Quantos litros de combustível cada um dos carros cadastrados consome
para percorrer uma distância de 1000 quilômetros e quanto isto custará,
considerando um que a gasolina custe R$ 2,25 o litro.
 */
package questão.pkg7;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class Questão7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> modelo = new ArrayList<String>();
        List<Double> consumo = new ArrayList<Double>();
        DecimalFormat formato = new DecimalFormat("#");
        modelo.add("Fusca");
        consumo.add(7.0);
        modelo.add("Gol");
        consumo.add(10.0);
        modelo.add("Uno");
        consumo.add(12.5);
        modelo.add("Vectra");
        consumo.add(9.0);
        modelo.add("Peugeout");
        consumo.add(14.5);
        
        for(int i = 0; i<5; i++){
            System.out.println("Veiculo " + (i+1));
            System.out.println("Nome =  " + modelo.get(i));
            System.out.println("Km/l =  " + consumo.get(i));
            System.out.println("\n");
        }
        System.out.println("Relatório Final");
        
        for(int i = 0; i<5; i++){
            String consumoGasolina = (formato.format(1000/(consumo.get(i))));
            Integer gasolina = Integer.parseInt(consumoGasolina);
            //int custoGasolina = (int) (gasolina * 2.25);
            System.out.println(i + " - " + modelo.get(i) + " - " + consumo.get(i) + " - " + consumoGasolina + " litros - " + (gasolina * 2.25));
        }
    }
    
}
