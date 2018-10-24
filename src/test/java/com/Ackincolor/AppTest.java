package com.Ackincolor;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    Utilisateur user;
    GameEngine gm;
    @BeforeClass
    public static void begin()
    {
        System.out.println("Debut des Test");
    }
    @Before
    public void beforeTest()
    {
        this.user = new Utilisateur("Ackin",100,0);
        this.gm = new GameEngine(new Scanner(System.in),new ServiceRandomTest(10));
    }
    /*
    Test si la methode renvoie bien FALSE si l'utilisateur rentre un mauvai numero
     */
    @Test
    public void testRules()
    {
        this.gm.user = this.user;
        assertTrue(gm.rules(10,1));
    }
    @Test
    public void testWin()
    {
        Joueur j = new Joueur(gm,user);
        Thread t = new Thread(j);
        t.start();
        String data = "10";
        try {
            InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
            InputStream old = System.in;
            try {
                System.setIn(testInput);
                data = "n\n";
                testInput = new ByteArrayInputStream(data.getBytes());
                System.setIn(testInput);

            } finally {
                System.setIn(old);
            }
            System.out.println("thread T result =" + j.getB());
        }catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        assertTrue(!(j.getB()));
    }
    @Test
    public void testExcep()
    {
        gm = new GameEngine(new Scanner(System.in),new ServiceRandomTest(10));
        Joueur j = new Joueur(gm,user);
        Thread t = new Thread(j);
        t.start();
        String data = "coucou";
        try {
            InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
            InputStream old = System.in;
            try {
                System.setIn(testInput);

            } finally {
                System.setIn(old);
            }
            System.out.println("thread T result =" + j.getB());
        }catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        assertTrue(!(j.getB()));
    }
}
