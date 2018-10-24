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
        System.out.println("                  /88888888888888888888888888\\\n" +
                "                  |88888888888888888888888888/\n" +
                "                   |~~____~~~~~~~~~\"\"\"\"\"\"\"\"\"|\n" +
                "                  / \\_________/\"\"\"\"\"\"\"\"\"\"\"\"\"\\\n" +
                "                 /  |              \\         \\\n" +
                "                /   |  88    88     \\         \\\n" +
                "               /    |  88    88      \\         \\\n" +
                "              /    /                  \\        |\n" +
                "             /     |   ________        \\       |\n" +
                "             \\     |   \\______/        /       |\n" +
                "  /\"\\         \\     \\____________     /        |\n" +
                "  | |__________\\_        |  |        /        /\n" +
                "/\"\"\"\"\\           \\_------'  '-------/       --\n" +
                "\\____/,___________\\                 -------/\n" +
                "------*            |                    \\\n" +
                "  ||               |                     \\\n" +
                "  ||               |                 ^    \\\n" +
                "  ||               |                | \\    \\\n" +
                "  ||               |                |  \\    \\\n" +
                "  ||               |                |   \\    \\\n" +
                "  \\|              /                /\"\"\"\\/    /\n" +
                "     -------------                |    |    /\n" +
                "     |\\--_                        \\____/___/\n" +
                "     |   |\\-_                       |\n" +
                "     |   |   \\_                     |\n" +
                "     |   |     \\                    |\n" +
                "     |   |      \\_                  |\n" +
                "     |   |        ----___           |\n" +
                "     |   |               \\----------|\n" +
                "     /   |                     |     ----------\"\"\\\n" +
                "/\"\\--\"--_|                     |               |  \\\n" +
                "|_______/                      \\______________/    )\n" +
                "                                              \\___/");
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
        System.out.println("GOODBY!!!!");
    }
}
