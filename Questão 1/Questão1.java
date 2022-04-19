/*
1) Faça um Programa que leia 20 números inteiros e armazene-os numa lista. 
Armazene os números pares na lista PAR e os números IMPARES na lista ímpar. 
Imprima as três listas.
 */
package questão.pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Igor_
 */
public class Questão1 {

    

    
    public static void main(String[] args) {
        List<Integer> geral = new ArrayList<Integer>();
        verificador verificador = new verificador();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for(i=0;i<20;i++){
            System.out.println("Insira um número");
            int numero = scanner.nextInt();
            geral.add(numero);
            verificador.verificador(numero);
        }
        System.out.println(geral.toString());
        System.out.println(verificador.returnPar());
        System.out.println(verificador.returnImpar());
    }
    
}
