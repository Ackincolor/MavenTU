package com.Ackincolor;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre nom ?");
        String name = scanner.next();
        System.out.println("OK :)");
        System.out.println("le moins :");
        int diffmoin = scanner.nextInt();
        System.out.println("Le plus :");
        int diffpls = scanner.nextInt();
        Utilisateur joueur = new Utilisateur(name,diffpls,diffmoin);
        GameEngine gm = new GameEngine(scanner,new ServiceRandom());
        while(gm.play(joueur));
    }
}
