/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author tacho
 */
public class JuegoVida {
    public static void main(String[] args) {
    int matriz [][] = new int [5][5];
        for (int i = 0; i < matriz.length; i++) {  //número de filas
            for (int j = 0; j < matriz[i].length; j++) { //número de columnas de cada fila
                matriz [i][j] = 1;//todas las celulas inician vivas
                System.out.print(matriz[i][j] + " ");
             }
                System.out.println();
        }
        System.out.println("");
        System.out.println("");
        
        int turno =1;//turno representa las generaciones
        do {            
           for (int i = 0; i < matriz.length; i++) {  //número de filas
            for (int j = 0; j < matriz[i].length; j++) { //número de columnas de cada fila
                if (matriz[i][j+1]==1 && matriz[i+1][j]==1 && matriz[i+1][j+1]==1) {
                    matriz[i][j]=1;
                }else{matriz[i][j]=0;
                }if (matriz[i][j-1]==1 && matriz[i][j+1]==1 && matriz[i+1][j-1]==1 && matriz[i+1][j+1]==1 && matriz[i+1][j+1]==1) {
                    matriz[i][j]=1;
                }else{matriz[i][j]=0;
                }if (matriz[i][j-1]==1 && matriz[i+1][j+1]==1 && matriz[i+1][j+1]==1) {
                    matriz[i][j]=1;
                }else{matriz[i][j]=0;
                }if (matriz[i-1][j]==1 && matriz[i-1][j+1]==1 && matriz[i][j+1]==1 && matriz[i+1][j+1]==1 && matriz[i+1][j]==1) {
                    matriz[i][j]=1;
                }else{matriz[i][j]=0;
                }if (matriz[i][j+1]==1 && matriz[i+1][j]==1 && matriz[i+1][j+1]==1) {
                    matriz[i][j]=1;
                }else{matriz[i][j]=0;
                }
                System.out.print(matriz[i][j] + " ");
                 
            }
                System.out.println();
           }
            System.out.println("");
            System.out.println("");
           turno ++;
        } while (turno !=5);
   } 
}
