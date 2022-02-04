/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenar_Numeros;

import java.util.Arrays;

/**
 *
 * @author lenin
 */
public class Metodos {
    
    static int [] aleatorio1 = new int [10];
    static int [] aleatorio2 = new int [10];
    static int [] aleatorio3 = new int [10];

    public void principal(){
        arreglos();
        array1();
        array2();
        array3();
        datos();
    }
    
    public void array1(){
        Arrays.sort(aleatorio1);
    }
    public void array2(){
        Arrays.parallelSort(aleatorio2,0,5);
    }
    public void array3(){
        aleatorio3 = Arrays.stream(aleatorio3).sorted().toArray();
    }
    public void arreglos(){
        for (int c = 0; c < aleatorio1.length; c++){
            aleatorio1 [c] = (int)(Math.random()*(100-1)+1);
            aleatorio2 [c] = (int)(Math.random()*(100-1)+1);
            aleatorio3 [c] = (int)(Math.random()*(100-1)+1);
        }
    }
    public void datos(){
         for (int c = 0; c < aleatorio1.length; c++) {
            System.out.println(aleatorio1[c]);
        }
        
        System.out.println("------------------------------");
        
        for(int c : aleatorio2){
            System.out.println(c);
        }
        
        System.out.println("------------------------------");
        
        for(int c : aleatorio3){
            System.out.println(c);
        }
    }
}
