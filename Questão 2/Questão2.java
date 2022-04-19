/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg2;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Questão2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtdCamisas = 0;
        String UF;
        float precoFinal = 0.0f;
        while (qtdCamisas < 1 || qtdCamisas >5){
            System.out.println("Quantas camisas você deseja comprar?");
            qtdCamisas = entrada.nextInt(); // é tipo o scanf, mas só pega dado inteiro
        }
        System.out.println("Em qual estado você mora?");
        UF = entrada.next();
        precoFinal = qtdCamisas * 30.0f;
        if (!UF.equals("BA")){ //A exclamação quer dizer "se a UF for DIFERENTE de BA"
            precoFinal += 20.0f;
        }
        System.out.println("O preço da compra é R$ " + precoFinal);
    }
    
}
