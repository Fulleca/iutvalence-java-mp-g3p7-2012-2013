package fr.iutvalence.java.projets.demineur;

import java.util.Random;
import java.util.Scanner;

/**
 * Classe de gestion d'une partie de demineur
 * classe qui reprendra les autres classes pour pouvoir joue
 * 
 * stardust00 <setsuna00ql@gmail.com>
 * @Author Lambert & Chaufournais
 */

public class Demineur
{
	//-----------------------------------------------------------------------
	// Attributs
	//-----------------------------------------------------------------------		
	private int x;
	
	private int y;
	
	/**
	 * Définition d'une grille ayant pour nom g
	 */
	private Grille g;
	
	//-----------------------------------------------------------------------
	// Constructeurs
	//-----------------------------------------------------------------------
	
	/**
	 * Constructeur par défaut d'un démineur
	 * Un démineur est une nouvelle grille de jeu 
	 * Il place les mines aléatoirement dans la grille
	 */
	public Demineur()
	{
		this.g = new Grille();


		//--------------------------------------
		//--- Géneration aléatoire des mines ---
		//--------------------------------------
		
		Random mineAleatoire = new Random();
		int mineGenerer = 0;
		
		while (mineGenerer < this.g.getNbMines() + 1)
		{
		
			Cellule c = this.g.getCellule(mineAleatoire.nextInt(this.g.getLargeur()), mineAleatoire.nextInt(this.g.getHauteur()));
			if(!c.getPresenceMine())
			{
				c.setPresenceMine(true);
				mineGenerer++;
			}
		}
		//-----------------------------------------
		//--- Algorithme de recherche des mines ---
		//-----------------------------------------
		for (int i = 0; i < this.g.getLargeur(); i++)
		{	
			for (int j = 0; j < this.g.getHauteur(); j++)
			{
				int nbMines = 0;
				if (j-1 >= 0)
				{
					if (this.g.getCellule(i, j-1).getPresenceMine()) 
						nbMines++;
				}
				if (i-1 >=0)
				{
					if (this.g.getCellule(i-1, j).getPresenceMine()) 
						nbMines++;
				}
				if (j+1 < 10)
				{
					if (this.g.getCellule(i, j+1).getPresenceMine()) 
						nbMines++;
				}
				if (i+1 < 10)
				{
					if (this.g.getCellule(i+1, j).getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >= 0)&&(j-1 >= 0))
				{
					if (this.g.getCellule(i-1, j-1).getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < 10)&&(j+1 < 10))
				{
					if (this.g.getCellule(i+1, j+1).getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < 10)&&(j-1 >=0))
				{
					if (this.g.getCellule(i+1, j-1).getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >=0)&&(j+1 < 10))
				{
					if (this.g.getCellule(i-1, j+1).getPresenceMine()) 
						nbMines++;
				}
				this.g.getCellule(i, j).setNbMinesVoisines(nbMines);
			}
		}
	}	
	

	/**
	 * Constructeur personnalisé d'un démineur
	 * Un démineur est une nouvelle zone de jeu
	 * Le constructeur génère aléatoirement un nombre nombresMines
	 * de mines dans la grille x par y
	 * @param x largeur de la grille
	 * @param y hauteur de la grille
	 * @param nombresMines nombres de mines dans la grille de jeu
	 */
	public Demineur(int x, int y, int nombresMines)
	{
		this.g = new Grille(x,y,nombresMines);


		//--------------------------------------
		//--- Géneration aléatoire des mines ---
		//--------------------------------------
		
		Random mineAleatoire = new Random();
		int mineGenerer = 0;
		
		while (mineGenerer < this.g.getNbMines())
		{
			Cellule c = this.g.getCellule(mineAleatoire.nextInt(this.g.getLargeur()), mineAleatoire.nextInt(this.g.getHauteur())); 
			if(!c.getPresenceMine())
			{
			c.setPresenceMine(true);
			mineGenerer++;
			}
		}
		//-----------------------------------------
		//--- Algorithme de recherche des mines ---
		//-----------------------------------------
		for (int i = 0; i < this.g.getLargeur(); i++)
		{	
			for (int j = 0; j < this.g.getHauteur(); j++)
			{
				int nbMines = 0;
				if (j-1 >= 0)
				{
					if (this.g.getCellule(i, j-1).getPresenceMine()) 
						nbMines++;
				}
				if (i-1 >=0)
				{
					if (this.g.getCellule(i-1, j).getPresenceMine()) 
						nbMines++;
				}
				if (j+1 < this.g.getHauteur())
				{
					if (this.g.getCellule(i, j+1).getPresenceMine()) 
						nbMines++;
				}
				if (i+1 < this.g.getLargeur())
				{
					if (this.g.getCellule(i+1, j).getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >= 0)&&(j-1 >= 0))
				{
					if (this.g.getCellule(i-1, j-1).getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < this.g.getLargeur())&&(j+1 < this.g.getHauteur()))
				{
					if (this.g.getCellule(i+1, j+1).getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < this.g.getLargeur())&&(j-1 >=0))
				{
					if (this.g.getCellule(i+1, j-1).getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >=0)&&(j+1 < this.g.getHauteur()))
				{
					if (this.g.getCellule(i-1, j+1).getPresenceMine()) 
						nbMines++;
				}
				this.g.getCellule(i, j).setNbMinesVoisines(nbMines);
			}
		}
	}	
	/**
	 * Méthode permettant à l'utilisateur de jouer une partie de démineur
	 * en choisissant les cellules sur lesquelles il veut "cliquer"
	 */
	public void utilisateurJoue()
	{
		/////-----------------------------------/////
		/////--------- Variable locale ---------/////
		/////-----------------------------------/////
		int jouer = 1;
		int compteur = ((this.g.getHauteur()*this.g.getLargeur())-this.g.getNbMines());
		// Creation objet interface
		AffichageConsole affiche = new AffichageConsole();
		Position pos = new Position(x, y);
		
		/////// Saisi de l'utilisateur appel a interface joueur
		
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
			
			// Appel au scanner
					
			// Saisie de l'abcisse par l'utilisateur
			affiche.message("Saisir x :");
			
			while ((pos.getX() > this.g.getLargeur()) || (pos.getX() < 1))
			{
				affiche.messageInvalide();
				pos.getX() = sc.nextInt();
			}
						
			// Saisie de l'ordonnée par l'utilisateur
			affiche.message("Saisir y :");
			
			while ((choixY > this.g.getHauteur()) || (choixY < 1))    
			{
				affiche.messageInvalide();
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
					affiche.messageWinner();
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

	}
	
	
	/**
	 * Méthode permettant de rendre indépendant le démineur
	 * Le démineur joue une partie de démineur et peut gagner ou perdre
	 */
	public void jouer()
	{
		/////-----------------------------------/////
		/////--------- Variable locale ---------/////
		/////-----------------------------------/////
		int jouer = 1;
		int compteur = ((this.g.getHauteur()*this.g.getLargeur())-this.g.getNbMines());
		AffichageConsole affiche = new AffichageConsole();
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
		
		// Tantque jouer est différent de 0, on continue à jouer
		while (jouer != 0)
		{
			Random mineAleatoire = new Random();
			int x = mineAleatoire.nextInt(this.g.getLargeur());
			int y = mineAleatoire.nextInt(this.g.getHauteur());
			
			Cellule c = this.g.getCellule(x,y);
			affiche.messageChoixCelulle(this.g, x, y);
			
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
				affiche.messageContinuerAJouer(this.g, x, y, compteur);
							
				// On test si on a gagné ou pas
				if (compteur == 0)
					{
					jouer = 0;
					affiche.messageWinner();
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
	}
	
	
	

	
 }
	
