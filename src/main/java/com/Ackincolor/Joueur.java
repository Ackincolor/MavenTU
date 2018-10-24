package com.Ackincolor;

public class Joueur implements Runnable{
    private boolean b;
    private GameEngine gm;
    private Utilisateur user;
    public Joueur(GameEngine gm,Utilisateur user)
    {
        this.gm =gm;
        this.user = user;
    }
    @Override
    public void run() {
        b = gm.play(user);
    }

    public boolean getB() {
        return b;
    }
}
