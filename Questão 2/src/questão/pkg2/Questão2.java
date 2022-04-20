/*
2) Faça um Programa que peça as quatro notas de 10 alunos, calcule e
armazene numa lista a média de cada aluno, imprima o número de alunos
com média maior ou igual a 7.0.
 */
package questão.pkg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Igor_
 */
public class Questão2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Double>> medias = new ArrayList<List<Double>>();
        List<List<Double>> aprovados = new ArrayList<List<Double>>();
        int contador = 0;
        Double notaAluno = 0.0;
        do{
            for (int i = 0; i <4 ; i++) {
                List<Double> media = new ArrayList<Double>();
                System.out.println("Insira as notas do " + (contador + 1) + "º estudante");
                Double nota = scanner.nextDouble();
                notaAluno = notaAluno + nota;
                if(i == 3){
                    Double mediaAluno = notaAluno/4;
                    notaAluno = 0.0;
                    System.out.println("Sua média é: " + mediaAluno);
                    if(mediaAluno >= 7.0){
                        media.add(mediaAluno);
                        aprovados.add(media);
                        medias.add(media);
                    }else{
                        media.add(mediaAluno);
                        medias.add(media);
                    }
                }
            }
            
            contador++;
        }while(contador <10);
        System.out.println("Um total de " + aprovados.size() + " estudantes foram aprovados!");
    }
}