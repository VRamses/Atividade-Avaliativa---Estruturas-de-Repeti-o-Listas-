/*
4) Altere o programa anterior, intercalando 3 listas de 10 elementos cada.
 */
package questão.pkg3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class Questão4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<String>();
        List<String> lista2 = new ArrayList<String>();
        List<String> lista3 = new ArrayList<String>();
        List<String> lista4 = new ArrayList<String>();
        for(int i=0;i<10;i++){
            lista1.add("Numero: " + (i));
            String posicao = lista1.get(i);
        }
        System.out.println(lista1.toString());
        for (int i = 0; i < 10; i++) {
            lista2.add("Numero: " + (i + 10));
            String posicao2 = lista2.get(i);
        }
        System.out.println(lista2.toString());
        for (int i = 0; i < 10; i++) {
            lista3.add("Numero: " + (i + 20));
            String posicao3 = lista3.get(i);
        }
        System.out.println(lista3.toString());
        int controlador = 0;
        for(int i = 0; i<4; i++){
            String adicao = lista1.get(i);
            lista4.add(controlador, adicao);
            controlador++;
        }
        for (int i = 0; i < 3; i++) {
            String adicao = lista2.get(i);
            controlador = 1;
            lista4.add(controlador, adicao);
            controlador++;
        }
        for (int i = 0; i < 3; i++) {
            String adicao = lista3.get(i);
            controlador = 2;
            lista4.add(controlador, adicao);
            controlador++;
        }
        System.out.println(lista4.toString());
        }
        
        
    }
