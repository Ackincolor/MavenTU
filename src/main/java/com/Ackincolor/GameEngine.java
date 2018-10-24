package com.Ackincolor;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GameEngine {
    Scanner scan;
    Utilisateur user;
    MyRandom rnd;
    public GameEngine(Scanner scan, MyRandom rnd)
    {
        this.scan = scan;
        this.rnd = rnd;
    }
    public boolean play(Utilisateur user)
    {
        //boucle
        this.user = user;
        if(user==null)
        {
            System.out.println("SORRY");
            return false;
        }
        boolean inprocess = true;
        try {
            int numberToFind = this.rnd.getNumber(user);
            int userNumber = -1;
            int cp = 1;
            while (inprocess) {
                System.out.println("Entrez un nombre :");
                userNumber = this.scan.nextInt();
                System.out.println("le nombre est :" + userNumber);
                inprocess = this.rules(numberToFind, userNumber);
            }
            System.out.println("Une autre ? (y/n)");
            String resp = scan.next();
            if (resp.equals("y"))
                return true;
            else
                return false;
        }catch(InputMismatchException e)
        {
            e.printStackTrace();
            return false;
        }

    }
    public boolean rules(int numberToFind,int userNumber)
    {
        boolean inprocess = true;
        if((userNumber<this.user.getDiffmoins())||(userNumber>this.user.getDiffpls()))
        {
            System.out.println("oups!!(il ne compte pas recommence)");
        }
        else {
            if (userNumber > numberToFind) {
                System.out.println("C'est moins");
                this.user.cp++;
            } else if (userNumber < numberToFind) {
                System.out.println("C'est plus !");
                this.user.cp++;
            } else {
                System.out.println("Bien joué "+this.user.getPseudo()+", le nombre :"+numberToFind+" en " + this.user.cp + " coups");
                this.user.results.add(this.user.cp);
                inprocess=false;
            }
        }
        return inprocess;
    }
    private int getNumber(Utilisateur user)
    {
        Random rand = new Random();
        return rand.nextInt(user.getDiffpls()-user.getDiffmoins()) + user.getDiffmoins();
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }
}
