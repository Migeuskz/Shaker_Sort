/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shaker.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mikey
 */
public class TestingShakerSort {
 public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
 public static String entrada;
 
 public static int[] leerArreglo(int n) throws IOException{
     int[] a = new int[n];
     System.out.println("========================");
     for(int i = 0; i<a.length; i++){
         System.out.println("Escribe el valor del Arreglo [ " +i+ " ]: ");
         entrada = bufer.readLine();
         a[i] = Integer.parseInt(entrada);
     }
     return a;
 }
 
public static int[] shakerSort(int[] Datos) {
        boolean ordenado = true;
        int inicia = 0;
        int termina = Datos.length - 1;
        int pivote;
        while (ordenado) {
            ordenado = false;
            for (int i = inicia; i < termina; i++) {
                if (Datos[i] > Datos[i + 1]) {
                    pivote = Datos[i];
                    Datos[i] = Datos[i + 1];
                    Datos[i + 1] = pivote;
                    ordenado = true;
                }
            }
            if (!ordenado) {
                break;
            }
            ordenado = false;
            termina = termina - 1;
            for(int i = termina-1; i>=inicia; i--){
                if (Datos[i] > Datos[i + 1]) {
                    pivote = Datos[i];
                    Datos[i] = Datos[i + 1];
                    Datos[i + 1] = pivote;
                    ordenado = true;
                }
            }
            inicia = inicia + 1;
        }
        return Datos;
    }
 
 public static void imprimirArreglo(int[]a){
     System.out.println("====================");
     System.out.println("Imprimiendo Arreglo: ");
     for(int i = 0; i<a.length; i++){
         System.out.printf("%4d", a[i]);
     }
     System.out.println();
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int[] array;
        int t;
        
        System.out.println("Programa de Método de ordenamiento shaker sort en Java");
        System.out.println("Escribe la longitud del Arreglo: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        
        array = leerArreglo(t);
        array = shakerSort(array);
        imprimirArreglo(array);
        
    }
    
}
