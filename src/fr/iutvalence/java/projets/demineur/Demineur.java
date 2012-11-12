package fr.iutvalence.java.projets.demineur;

import java.util.Random;

/**
 * Classe de gestion d'une partie de demineur
 * classe qui reprendra les autres classes pour pouvoir jouer
 * 
 * stardust00 <setsuna00ql@gmail.com>
 * @Author Lambert & Chaufournais
 */

//FIXME compléter pour que cela ressemble à une partie de démineur (gestion aléatoire des choix pour le moment)
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
	 * Définition d'une grille g
	 */
	private Grille g;
	
	//-----------------------------------------------------------------------
	// <---- Constructeurs ---->
	//-----------------------------------------------------------------------
	
	/**
	 * Constructeur par défaut d'un démineur
	 */
	public Demineur()
	{
		this.aPerdu = false;
		this.g = new Grille();
		
		
		System.out.println("Bienvenue sur le démineur !!!");
		System.out.println(this.g.toString());
		
		//--------------------------------------
		//--- Géneration aléatoire des mines ---
		//--------------------------------------
		
		Random mineAleatoire = new Random();
		int mineGenerer = 0;
		
		while (mineGenerer < this.g.getNbMines() + 1)
		{
			grille[mineAleatoire.nextInt(this.g.getLargeur())][mineAleatoire.nextInt(this.g.getHauteur())] = 
					new Cellule(false,0,true);
			mineGenerer++;
		}
		
		// FIXME compléter le commentaire   FIXED
		/**
		 * algo de recherche pour une cellule choisie, du nombre de mine autour de celle ci
		 * @return nbmines
		 */
		

	/*	for (int i = 0; i < this.g.getLargeur(); i++)
			for (int j = 0; j < g.getHauteur(); j++)
			{
				int nbMines = 0;
				if (j-1 >= 0)
				{
					if (this.grille[i][j-1].getPresenceMine()) 
						nbMines++;
				}
				if (i-1 >=0)
				{
					if (this.grille[i-1][j].getPresenceMine()) 
						nbMines++;
				}
				if (j+1 < 10)
				{
					if (this.grille[i][j+1].getPresenceMine()) 
						nbMines++;
				}
				if (i+1 < 10)
				{
					if (this.grille[i+1][j].getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >= 0)&&(j-1 >= 0))
				{
					if (this.grille[i-1][j-1].getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < 10)&&(j+1 < 10))
				{
					if (this.grille[i+1][j+1].getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < 10)&&(j-1 >=0))
				{
					if (this.grille[i+1][j-1].getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >=0)&&(j+1 < 10))
				{
					if (this.grille[i-1][j+1].getPresenceMine()) 
						nbMines++;
				}
					
				this.grille[i][j].setNbMinesVoisines(nbMines);
			}*/
	}
	
	
/*
public void jouer()
{
	Random mineAleatoire = new Random();
	while (pasPerdu())
	{
		this.grille[mineAleatoire.nextInt(g.getLargeur())][mineAleatoire.nextInt(g.getHauteur())] =
					new Cellule(g.getVisibilite(),nb,p);
		//System.out.print(" ");   Pour coordonnées
		if (p=true)
		{
			perdu();
			System.out.print("PERDU");
		}
		Thread.sleep(3000);		
	}
}	*/
	
	//-----------------------------------------------------------------------
	// Methodes
	//-----------------------------------------------------------------------
	
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

	
	//-----------------------------------------------------------------------
	// <---- Accesseurs ---->
	//-----------------------------------------------------------------------
	
 }
	
