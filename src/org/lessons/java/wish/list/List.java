package org.lessons.java.wish.list;

import java.util.HashSet;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet <String> presents = new HashSet<>();
        boolean stop = false;
        while(!stop){
            System.out.println("Insert new present?(y/n)");
            String answer = scan.nextLine();
            switch (answer){
                case "y":
                    System.out.print("What you want ?");
                    String name = scan.nextLine();
                    boolean added = presents.add(name);
                    if(!added){
                        System.out.println("the present is already registered");
                    }
                    break;
                case "n":
                    stop = true;
                    break;
                default:
                    System.out.println("invalid answer");
                    break;
            }
            System.out.println("your list:"+" "+presents);

        }
        System.out.println("your list is complete, these are your presents:");
        for(String element : presents){
            System.out.println(element.toUpperCase());
        }


        scan.close();
    }
}
