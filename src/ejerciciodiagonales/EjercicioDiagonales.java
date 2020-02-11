/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiagonales;

import java.util.Scanner;
public class EjercicioDiagonales {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int n,m;
        int resultado1=0, resultado2=0;
        System.out.println("PROGRAMA QUE SUMA LAS DIAGONALES DE UNA MATRIZ Y LUEGO LAS RESTA");
        System.out.print("Digite las dimensiones de la matriz(cuadrada): ");
        n = leer.nextInt();
        m = n;
        int matriz[][] = new int[n][m]; 
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                System.out.print("Digite el primer numero (["+j+"]["+i+"]) : ");
                matriz[j][i] = leer.nextInt();
            }
        }
        System.out.println("\nMATRIZ INGRESADA");
        System.out.println("-------------------------");
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                System.out.print(matriz[j][i]+"   ");
            }
            System.out.println();
        }
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                if(j==i)
                {
                    resultado1+=matriz[j][i];
                }
            }
        }
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                if((j+i)==n-1)
                {
                    resultado2+=matriz[j][i];
                }
            }
        }
        System.out.println("-------------------------\n");
        System.out.println("La suma de la diagonal principal es: "+resultado1);
        System.out.println("La suma de la diagonal secundaria es: "+resultado2);
        System.out.println("El valor absoluto de la diferencia entre las 2 diagonales es: "+(resultado2-resultado1));
    }
    
}
