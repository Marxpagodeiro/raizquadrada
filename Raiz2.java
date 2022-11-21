/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.raiz2;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Raiz2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("Qual numero vc que saber a raiz quadrada?");
        x=in.nextInt(); 
        int raiz = raiz(x);
        System.out.println(raiz);
    }
    public static int raiz(int x){
        int n = 0;
        int i = 0; 
        while(i<=x){
            x -= i; //Atualiza o valor de x;  x=x-i ;
            i += 2; //Atualiza o valor de i;  i=i+2. Deste modo, i sempre será ímpar;
            n++; //Soma mais 1 ao n;
        }
        return n;
    }
}