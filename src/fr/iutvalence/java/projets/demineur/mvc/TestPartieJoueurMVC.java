package fr.iutvalence.java.projets.demineur.mvc;

import java.util.Scanner;

import fr.iutvalence.java.projets.demineur.interfaces.InterfaceAffichage;
import fr.iutvalence.java.projets.demineur.interfaces.InterfaceJoueur;
import fr.iutvalence.java.projets.demineur.mvc.DemineurMVC;;

/**
 * @author Loic
 *
 */
public class TestPartieJoueurMVC
{
		/**
		 * Construction d'un objet affichage console via l'interface "InterfaceAffichage"
		 */
		static InterfaceAffichage msgConsole = new AffichageConsole();
		
		/**
		 * Construction d'un objet JoueurClavier via l'interface "InterfaceJoueur"
		 */
		InterfaceJoueur choixClavier = new JoueurClavier();
		
		/**
		 * @param args Argument de la fonction main
		 */
		public static void main(String[] args)
		{
			System.out.println("Veuillez choisir votre mode de jeu");
			System.out.println("1. Grille de jeu par défaut. Initialise une grille de 10x10 avec 10 mines");
			System.out.println("1. Grille de jeu personnalisé.");
			System.out.println("-------------------------------------------------------------------------");
			Scanner sc = new Scanner(System.in);
			int choixMode = sc.nextInt();
			
			// Correspond au premier mode de jeu
			if (choixMode == 1)
			{
				DemineurMVC d = new DemineurMVC();
				d.utilisateurJoue();
			}
			// Correspond au second mode de jeu
			else if (choixMode == 2)
			{
				msgConsole.afficherMsg("Veuillez choisir la largeur de la grille");
				int choixX = sc.nextInt();
				msgConsole.afficherMsg("Veuillez choisir la hauteur de la grille");
				int choixY = sc.nextInt();
				msgConsole.afficherMsg("Veuillez choisir le nombre de mines de la grille");
				int choixMines = sc.nextInt();
				DemineurMVC d = new DemineurMVC(choixX,choixY,choixMines);
				d.utilisateurJoue();
			}
			// Gère le cas ou l'utilisateur n'a pas choisie un mode de jeu
			else
			{
				while ((choixMode != 1) || !(choixMode != 2))
				{
					msgConsole.afficherMsg("Erreur - le menu voulu n'existe pas");
					System.out.println();
					choixMode = sc.nextInt();
				}
				if (choixMode == 1)
				{
					DemineurMVC d = new DemineurMVC();
					d.utilisateurJoue();
				}
				else if (choixMode == 2)
				{
					msgConsole.afficherMsg("Veuillez choisir la largeur de la grille");
					int choixX = sc.nextInt();
					msgConsole.afficherMsg("Veuillez choisir la hauteur de la grille");
					int choixY = sc.nextInt();
					msgConsole.afficherMsg("Veuillez choisir le nombre de mines de la grille");
					int choixMines = sc.nextInt();
					DemineurMVC d = new DemineurMVC(choixX,choixY,choixMines);
					d.utilisateurJoue();
				}
			}
		}
	}
