package io.zipcoder.fundamentals.day2.lab1;

import java.util.Scanner;


public class Greeting {

    public static void main(String[] args){
    	
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("What is your name?");
    
    String name = scanner.nextLine();
    
    if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")){
    	System.out.format("Hi %s, whaaaaatttsssup?!", name);
    }
    	else {
    		System.out.println("Sorry I do not know you....Goodbye");
    	}
    }
}

