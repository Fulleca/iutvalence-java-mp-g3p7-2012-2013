package fr.iutvalence.java.projets.demineur;

import java.util.Random;

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
	/**
	 * Booléen spécifiant si le joueur a perdu
	 */
	public boolean aPerdu;
	
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
		this.aPerdu = false;

		//--------------------------------------
		//--- Géneration aléatoire des mines ---
		//--------------------------------------
		
		Random mineAleatoire = new Random();
		int mineGenerer = 0;
		
		while (mineGenerer < this.g.getNbMines() + 1)
		{
			Cellule c = this.g.getCellule(mineAleatoire.nextInt(this.g.getLargeur()), mineAleatoire.nextInt(this.g.getHauteur())); 
			c.setPresenceMine(true);
			mineGenerer++;
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
		System.out.println("Bienvenue sur le démineur");
		System.out.println(this.g.toString());
	}	
	
	
	

	/**
	 * Constructeur personnalisé d'un démineur
	 * Un démineur est une nouvelle zone de jeu
	 * Le constructeur génère aléatoirement un nombre nombresMines
	 * de mines dans la grille x par y
	 * @param x
	 * @param y
	 * @param nombresMines
	 */
	public Demineur(int x, int y, int nombresMines)
	{
		this.g = new Grille(x,y,nombresMines);
		this.aPerdu = false;

		//--------------------------------------
		//--- Géneration aléatoire des mines ---
		//--------------------------------------
		
		Random mineAleatoire = new Random();
		int mineGenerer = 0;
		
		while (mineGenerer < this.g.getNbMines())
		{
			Cellule c = this.g.getCellule(mineAleatoire.nextInt(this.g.getLargeur()), mineAleatoire.nextInt(this.g.getHauteur())); 
			c.setPresenceMine(true);
			mineGenerer++;
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
				if (j+1 < g.getHauteur())
				{
					if (this.g.getCellule(i, j+1).getPresenceMine()) 
						nbMines++;
				}
				if (i+1 < g.getLargeur())
				{
					if (this.g.getCellule(i+1, j).getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >= 0)&&(j-1 >= 0))
				{
					if (this.g.getCellule(i-1, j-1).getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < g.getLargeur())&&(j+1 < g.getHauteur()))
				{
					if (this.g.getCellule(i+1, j+1).getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < g.getLargeur())&&(j-1 >=0))
				{
					if (this.g.getCellule(i+1, j-1).getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >=0)&&(j+1 < g.getHauteur()))
				{
					if (this.g.getCellule(i-1, j+1).getPresenceMine()) 
						nbMines++;
				}
				this.g.getCellule(i, j).setNbMinesVoisines(nbMines);
			}
		}
		System.out.println("Bienvenue sur le démineur");
		System.out.println(this.g.toString());
	}	
	
	
	//-----------------------------------------------------------------------
	// Méthodes
	//-----------------------------------------------------------------------
	
	/**
	 * 
	 */
	// FIXME compléter pour que cela ressemble à une partie de démineur (gestion aléatoire des choix pour le moment) FIXED
	public void jouer()
	{
		int jouer = 1;
		int compteur = ((g.getHauteur()*g.getLargeur())-g.getNbMines());
		System.out.println("Nombres de cases vides restantes :"+compteur);
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
			Random mineAleatoire = new Random();
			int x = mineAleatoire.nextInt(this.g.getLargeur());
			int y = mineAleatoire.nextInt(this.g.getHauteur());
			Cellule c = this.g.getCellule(x,y);
			if (!c.getVisibilite())
			{
				c.setVisibilite(true);
				--compteur;
			}
			
			System.out.println((x + 1) + " ; " + (y + 1) + " // Nombres de cases vides restantes: " + compteur); // Pour afficher les coordonnée choisies (généré aléatoirement)
				if (c.getPresenceMine())
				{
					jouer = 0;
					System.out.println("PERDU");
					System.out.println("Dommage, il vous restait "+(compteur+1)+"case(s) non découverte");
				}
				System.out.println(this.g.toString());
			
				if (compteur == 0)
				{
					jouer =0;
					System.out.println("GAGNER");
				}
			
			
				try
				{
					Thread.sleep(3000);
				}
				catch (InterruptedException e)
				{
					// ici on peut ignorer l exception
				}		
		}
		System.out.println("Fin du démineur");
	}
	
	/**
	 * Défini la partie comme étant perdue
	 * @return false
	 */
	public boolean perdu()
	{
		return this.aPerdu = true;
	}
		
	/**
	 * Défini la partie comme n'étant pas perdu
	 * @return true
	 */
	public boolean pasPerdu()
	{
		return this.aPerdu = false;
	}

 }
	
