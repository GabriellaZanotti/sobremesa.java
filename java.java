/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sobremesa;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int comida=0;
        
        System.out.println("Qual sobremesa deseja \n 1-Bombom?\n 2-Pudim? \n 3-Café?");
        Scanner input = new Scanner (System.in);
        comida= input.nextInt();
        
        switch(comida){
            case 1:
                System.out.println("Bombom");
                break;
            case 2:
            System.out.println("Pudim");
                break; 
            case 3:
            System.out.println("Café");
                break;    
        }
    }   
}
