/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.srmd;

import java.util.Scanner;

/**
 *
 * @author Rayson
 */
public class SRMD {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float numero1,numero2,sum,rest,mult,div;
        System.out.println("Ingrese dos numeros");
        numero1=entrada.nextFloat();
        numero2=entrada.nextFloat();
        sum=numero1+numero2;
        rest=numero1-numero2;
        mult=numero1*numero2;
        div=numero1/numero2;
        System.out.println("La suma de los dos numeros es: "+sum);
        System.out.println("La resta de los dos numeros es: "+rest);
        System.out.println("La multiplicacion de los dos numeros es: "+mult);
        System.out.println("la division de los dos numeros es: "+div);      
    }
}
