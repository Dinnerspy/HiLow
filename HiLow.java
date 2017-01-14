/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class HiLow {
private static int B,C,D, Guess,Counter;
    
    public static void main(String[] args) {

        int UserNumber;
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Welcome to High-Low.");
        System.out.println("Enter a number for 1 to 100");
        UserNumber = myscanner.nextInt();

        while (UserNumber > 100 || UserNumber < 0) {
            System.out.println("Value is out of range.\nPlease enter a number for 1 to 100");
            UserNumber = myscanner.nextInt();

        }
        
       Computer(UserNumber, 100, 1);
        
        

    }
    
    
    
    public static void Computer(Integer UserNumber, Integer High, Integer Low){
    
    B= UserNumber;
    C=High;
    D=Low;
    Guess=(C+D)/2;
    if(B==Guess){
        System.out.println("Computer Gusesed Correctly.\nthe Computer tried "+Counter+" times");
        
    }
    
    if(Guess<B){
    
    D=Guess;
    Counter++;
    Computer(B, C, D);
    }
    
    if(Guess>B){
    C=Guess;
    Counter++;
    Computer(B, C, D);
    }
    
    }

}
