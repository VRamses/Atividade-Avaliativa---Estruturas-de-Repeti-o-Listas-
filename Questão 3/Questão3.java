/*
3) Faça um Programa que leia duas listas com 10 elementos cada. Gere
uma terceira lista de 20 elementos, cujos valores deverão ser compostos
pelos elementos intercalados das duas outros listas.
 */
package questão.pkg3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victo
 */
public class Questão3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<String>();
        List<String> lista2 = new ArrayList<String>();
        List<String> lista3 = new ArrayList<String>();
        int controlador = 0;
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
        for(int i = 0; i<10; i++){
            if((i%2 == 0) || (i==0)){
                String adicao = lista1.get(i);
                lista3.add(controlador, adicao);
                controlador++;
            }else{
                String adicao2 = lista2.get(i);
                lista3.add(controlador, adicao2);
                controlador++;
            }
        }
        System.out.println(lista3.toString());
        
    }
    
}
