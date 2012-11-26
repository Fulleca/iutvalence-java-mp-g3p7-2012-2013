package fr.iutvalence.java.projets.demineur.tests;

import fr.iutvalence.java.projets.demineur.Demineur;
import java.util.Scanner;

/**
 * Classe permettant à l'utilisateur de jouer une partie de demineur
 * en choisissant les cellules sur lequelles il veut "ciquer"
 * Le joueur peut choisir de jouer une partie par défaut (grille par défaut)
 * ou jouer une partie personnalisé (choississant la taille de la grille de jeu
 * ainsi que le nombres de mines dans la grille)
 * @author Loic
 */
public class TestPartieJoueur
{
	/**
	 * @param args Argument de la fonction main
	 */
	public static void main(String[] args)
	{
		System.out.println("Veuillez choisir votre mode de jeu (en entrant le numéro correspondant au mode) :");
		System.out.println("1 - Grille de jeu par défaut. Taille de 10x10 avec 10 mines");
		System.out.println("2 - Grille de jeu personnalisé. Vous devez spécifier la taille et le nombres de mines de la zone de jeu");
		
		System.out.println("Votre choix :");
		Scanner sc = new Scanner(System.in);
		int choixMode = sc.nextInt();
		
		// Correspond au premier mode de jeu
		if (choixMode == 1)
		{
			Demineur d = new Demineur();
			d.utilisateurJoue();
		}
		// Correspond au second mode de jeu
		else if (choixMode == 2)
		{
			System.out.println("Choississez la largeur de la grille de jeu :");
			int choixX = sc.nextInt();
			System.out.println("Choississez la hauteur de la grille de jeu :");
			int choixY = sc.nextInt();
			System.out.println("Choississez le nombres de mines quie seront dans la grille :");
			int choixMines = sc.nextInt();
			Demineur d = new Demineur(choixX,choixY,choixMines);
			d.utilisateurJoue();
		}
		// Gère le cas ou l'utilisateur n'a pas choisie un mode de jeu
		else
		{
			while ((choixMode != 1) || !(choixMode != 2))
			{
				System.out.println("Erreur mode - Le mode choisie n'existe pas !");
				System.out.println("Votre nouveau choix :");
				choixMode = sc.nextInt();
			}
			if (choixMode == 1)
			{
				Demineur d = new Demineur();
				d.utilisateurJoue();
			}
			else if (choixMode == 2)
			{
				System.out.println("Choississez la largeur de la grille de jeu :");
				int choixX = sc.nextInt();
				System.out.println("Choississez la hauteur de la grille de jeu :");
				int choixY = sc.nextInt();
				System.out.println("Choississez le nombres de mines quie seront dans la grille :");
				int choixMines = sc.nextInt();
				Demineur d = new Demineur(choixX,choixY,choixMines);
				d.utilisateurJoue();
			}
		}
	}

}
