/*
6) Utilizando listas faça um programa que faça 5 perguntas para uma pessoa
sobre um crime. As perguntas são:
a. "Telefonou para a vítima?"
b. "Esteve no local do crime?"
c. "Mora perto da vítima?"
d. "Devia para a vítima?"
e. "Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da
pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve
ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassino". Caso contrário, ele será classificado como "Inocente".
 */
package questão.pkg6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Questão6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Boolean> perguntas = new ArrayList<Boolean>();
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.println("Responda com True ou False para as perguntas a seguir:");
        System.out.println("Telefonou para a vítima?");
        boolean resposta = scanner.nextBoolean();
        if (resposta == true){
            contador++;
        }
        System.out.println("Esteve no local do crime?");
        resposta = scanner.nextBoolean();
        if (resposta == true) {
            contador++;
        }
        System.out.println("Mora perto da vítima?");
        resposta = scanner.nextBoolean();
        if (resposta == true) {
            contador++;
        }
        System.out.println("Devia para a vítima?");
        resposta = scanner.nextBoolean();
        if (resposta == true) {
            contador++;
        }
        System.out.println("Já trabalhou com a vítima?");
        resposta = scanner.nextBoolean();
        if (resposta == true) {
            contador++;
        }
        if(contador <=2){
            System.out.println("Você é suspeito.");
        }else if ((contador > 2) && (contador <=4)){
            System.out.println("Você foi cúmplice.");
        }else if(contador > 4){
            System.out.println("Você foi o assassino!");
        }else if(contador == 0){
            System.out.println("Você é inocente.");
        }
        
        
    }
    
}
