/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city.generator;

import java.util.Scanner;

/**
 *
 * @author Dustin Moody
 */
public class CityGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        boolean quit = false;
        String userInput;
        while(!quit){
            System.out.println("Welcome to the City Generator 0.1!\n"
                    + "a - Generate Elven City\n"
                    + "b - Generate Dwarven City\n"
                    + "c - Generate Human City\n");
            
            userInput = inputScanner.next();
            System.out.println(userInput);
            if(userInput.equals("a")){
                ElvenCity elfGen = new ElvenCity().GenerateNew();
            }
            
        }
    }

}
