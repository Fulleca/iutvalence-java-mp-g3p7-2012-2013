package fr.iutvalence.java.projets.demineur.tests;

import fr.iutvalence.java.projets.demineur.AffichageConsole;
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
		AffichageConsole affiche = new AffichageConsole();
		affiche.afficherMenu();
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
			affiche.messageChoixLargeur();
			int choixX = sc.nextInt();
			affiche.messageChoixHauteur();
			int choixY = sc.nextInt();
			affiche.messageChoixNombreMines();
			int choixMines = sc.nextInt();
			Demineur d = new Demineur(choixX,choixY,choixMines);
			d.utilisateurJoue();
		}
		// Gère le cas ou l'utilisateur n'a pas choisie un mode de jeu
		else
		{
			while ((choixMode != 1) || !(choixMode != 2))
			{
				affiche.messageErreurChoixMenu();
				choixMode = sc.nextInt();
			}
			if (choixMode == 1)
			{
				Demineur d = new Demineur();
				d.utilisateurJoue();
			}
			else if (choixMode == 2)
			{
				affiche.messageChoixLargeur();
				int choixX = sc.nextInt();
				affiche.messageChoixHauteur();
				int choixY = sc.nextInt();
				affiche.messageChoixNombreMines();
				int choixMines = sc.nextInt();
				Demineur d = new Demineur(choixX,choixY,choixMines);
				d.utilisateurJoue();
			}
		}
	}
}
