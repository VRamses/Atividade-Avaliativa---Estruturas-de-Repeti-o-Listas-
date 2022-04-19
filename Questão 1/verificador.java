/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questão.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor_
 */
public class verificador {
    List<Integer> par = new ArrayList<Integer>();
    List<Integer> impar = new ArrayList<Integer>();
    
        public void verificador(int numero){
        int num = numero;
        if(num%2 == 0){
            par.add(numero);
        }
        else{
            impar.add(numero);
        }
    }
        public String returnPar(){
            return par.toString();
        }
        
        public String returnImpar() {
            return impar.toString();
        }
    
}
