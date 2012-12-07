package fr.iutvalence.java.projets.demineur.mvc;

import java.util.Scanner;

import fr.iutvalence.java.projets.demineur.Cellule;

/**
 * @author Loic
 *
 */
public class Position
{
/** Méthode permettant à l'utilisateur de jouer une partie de démineur
	 * en choisissant les cellules sur lesquelles il veut "cliquer"
	 */
	public void utilisateurJoue()
	{
		/////-----------------------------------/////
		/////--------- Variable locale ---------/////
		/////-----------------------------------/////
		int jouer = 1;
		int compteur = ((this.g.getHauteur()*this.g.getLargeur())-this.g.getNbMines());
		
		/////-----------------------------------/////
		/////------------ Programme ------------/////
		/////-----------------------------------/////
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// ici on peut ignorer l exception
		}	
		
		while (jouer != 0)
		{
			// On créer un nouveau scanner permettant de récupérer ce que tape l'utilisateur
			Scanner sc = new Scanner(System.in);
			
			// Saisie de l'abcisse par l'utilisateur
			System.out.println("veuillez choisir la coordonnée x de la cellule a decouvrir");
			int choixX = sc.nextInt();
			while ((choixX > this.g.getLargeur()) || (choixX < 1))
			{
				System.out.println("La coordonnée spécifié est introuvable");
				choixX = sc.nextInt();
			}
			
			// Saisie de l'ordonnée par l'utilisateur
			System.out.println("veuillez choisir la coordonnée y de la cellule a decouvrir");
			int choixY = sc.nextInt();
			while ((choixY > this.g.getHauteur()) || (choixY < 1))    
			{
				System.out.println("La coordonnée spécifié est introuvable");
				choixY = sc.nextInt();
			}
			
			Cellule c = this.g.getCellule(choixX-1, choixY-1);
			affiche.messageChoixCelulle(this.g, (choixX-1), (choixY-1));   
			
			
			// On test si la cellule n'a pas encore été decouverte
			// Si elle ne l'a pas été, on décrémente le compteur
			// et on change sa visibilité
			if (!c.getVisibilite()) 
			{
				c.setVisibilite(true);
				--compteur;
			}
			
			// On test si on est sur une mine
			if (c.getPresenceMine())
			{
				jouer = 0;
				affiche.messageGameOver(compteur);
			}
			else
			{
				affiche.messageContinuerAJouer(this.g, choixX-1, choixY-1, compteur);
				
				// On test si on a gagné ou pas
				if (compteur == 0)
				{
					jouer = 0;
					System.out.println("Bravo, vous avez gagné la partie");
				}
			}
			affiche.afficherGrille(this.g);
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				// ici on peut ignorer l exception
			}	
		}
		
		// Fin du démineur
		System.out.println("FIN DE LA PARTIE");
	}
}
