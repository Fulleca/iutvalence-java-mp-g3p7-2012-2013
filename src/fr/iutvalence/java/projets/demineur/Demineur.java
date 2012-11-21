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
	
	
	
	
	//-----------------------------------------------------------------------
	// Méthodes
	//-----------------------------------------------------------------------
	
	/**
	 * 
	 */
	// FIXME compléter pour que cela ressemble à une partie de démineur (gestion aléatoire des choix pour le moment) FIXED
	public void jouer()
	{
		int jeu =1;
		while (jeu != 0)
		{
			Random mineAleatoire = new Random();
			int x =mineAleatoire.nextInt(this.g.getLargeur());
			int y =mineAleatoire.nextInt(this.g.getHauteur());
			Cellule c = this.g.getCellule(x,y);
			c.setVisibilite(true);
				
			System.out.print(x);
			System.out.print(" ; ");
			System.out.print(y);
			System.out.print("  //  ");
			// Pour afficher coordonnées aléatoire
		
			if (c.getPresenceMine())
			{
				jeu = 0;
				System.out.print("PERDU");
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
	}
	
	/**
	 * Défini la partie comme étant perdue
	 * @return false
	 */
	public boolean perdu()
	{
		return this.aPerdu = false;
	}
		
	/**
	 * Défini la partie comme n'étant pas perdu
	 * @return true
	 */
	public boolean pasPerdu()
	{
		return this.aPerdu = true;
	}
	
	public void setPerdu(boolean aPerdu)
	{
		this.aPerdu = aPerdu;
	}

 }
	
