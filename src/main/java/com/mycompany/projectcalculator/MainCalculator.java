/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectcalculator;

import java.util.Scanner;
/**
 *
 * @author Famila Brenes Castro
 */
public class MainCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner read = new Scanner(System.in);/*lee lo que el ususario a digitado */
        
       ClassAdd sum =new ClassAdd();
       ClassSubtract sub= new ClassSubtract();
       ClassDivide div= new ClassDivide();
       ClassMultiply Mul= new ClassMultiply();
        int  readNum = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
       
        
        do{
             System.out.println("\n");
             System.out.println("Selecione un numero de operacion a realizar");
             System.out.println("1-Sumar");
             System.out.println("2-Restar");
             System.out.println("3-Dividir");
             System.out.println("4-Multiplicar");
             System.out.println("5-Sumar 3 Numeros");
             System.out.println("6-Salir");
             readNum= read.nextInt();
             
            
             if(readNum != 6)
             {
             if(readNum == 5)
             {
               System.out.print("Dijete el primer numero:");
               num1= read.nextInt();
               System.out.print("Dijete el Segundo numero:");
               num2= read.nextInt();
               System.out.print("Dijete el Tercer numero");
               num3 = read.nextInt();
             }else{
              System.out.print("Dijete el primer numero");
              num1= read.nextInt();
              System.out.print("Dijete el segundo numero");
              num2= read.nextInt();
              
             }  
             }
             switch(readNum)
             {
                 case 1:
                     readNum=1;
                     sum.add(num1, num2);
                     break;
             
                 case 2:
                     readNum=2;
                     sub.Subtract(num1, num2);
                     break;
                 case 3:
                     readNum=3;
                     div.Divide(num1, num2);
                     break;     
                 case 4:
                     readNum=4;
                     Mul.Multiply(num1, num2);
                     break;
                     
                 case 5:
                     readNum=5;
                     sum.add(num1, num2, num3);
              }
                       
        }while(readNum != 6);
        
   
    }
    
}
