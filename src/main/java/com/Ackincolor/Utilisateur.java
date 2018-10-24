package com.Ackincolor;

import java.util.ArrayList;

public class Utilisateur {
    private String pseudo;
    private int diffpls , diffmoins;
    public int cp=1;
    public ArrayList<Integer> results;
    public Utilisateur(String name,int diffpls,int diffmoins)
    {
        this.pseudo = name;
        if(diffpls<diffmoins)
        {
            this.diffmoins = diffpls;
            this.diffpls = diffmoins;
        }else
        {
            this.diffpls = diffpls;
            this.diffmoins = diffmoins;
        }
        this.results = new ArrayList<>();
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getDiffpls() {
        return diffpls;
    }

    public int getDiffmoins() {
        return diffmoins;
    }
    public void AI()
    {

    }
}
