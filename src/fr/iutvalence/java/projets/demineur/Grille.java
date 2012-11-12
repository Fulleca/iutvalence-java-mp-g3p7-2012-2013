package fr.iutvalence.java.projets.demineur;

import java.util.Random;

/**
 * Classe Grille permettant la gestion d'une grille définie par une largeur, une hauteur et un nombre de mines
 *
 * @author chaufoul
 */
public class Grille 
{
	// FIXME il faut ajouter des méthodes permettant de manipuler en lecture et écriture les cellules de la grille (à discuter)
	//-----------------------------------------------------------------------
	// <---- Constantes ---->
	//-----------------------------------------------------------------------
	
	/**
	 * Nombres de lignes par défaut de la grille
	 */
	private final static int LARGEUR_DEFAUT = 10;
	
	/**
	 * Nombre de colonnes par défaut de la grille
	 */
	private final static int HAUTEUR_DEFAUT = 10;
	
	/**
	 * Nombre de mines par défaut dans la grille
	 */
	private final static int NB_MINES_DEFAUT = 10;
	
	//-----------------------------------------------------------------------
	// <---- Attributs ---->
	//-----------------------------------------------------------------------
	
	/**
	 * Largeur de la grille
	 */
	private final int largeur;
	
	/**
	 * Hauteur de la grille
	 */
	private final int hauteur;
	
	/**
	 * Nombre de mines présents das la grille
	 */
	private final int nbMines;

	/**
	 * Grille de jeu représenté par un tableau de Cellule à deux dimensions
	 * Le tableau est gérée par ses coordonnées (largeur et hauteur)
	 */
	private Cellule[][] grille;
	
	//-----------------------------------------------------------------------
	// <---- Constructeurs ---->
	//-----------------------------------------------------------------------
	
	/**
	* Constructeur par défaut d'une grille 
	* Une largeur de 10 cellules, une hauteur de 10 cellules et un nombres de mines égal à 10.
	*/
	public Grille()
	{
		/* Initialisation des attributs */
		this.largeur = LARGEUR_DEFAUT;
		this.hauteur = HAUTEUR_DEFAUT;
		this.nbMines = NB_MINES_DEFAUT;
		/* Instanciation d'une objet cellule */
		this.grille = new Cellule[LARGEUR_DEFAUT][HAUTEUR_DEFAUT];
		
		int bas = 0;
		while (bas < largeur)
		{
			int droite =0;
			while (droite < hauteur)
			{
				grille[bas][droite] = new Cellule();
				droite++;
			}
			bas++;
		}
		
	
	}
	
	/**
	 * Constructeur de la grille de jeu personnalisée
	 * Le joueur choisi la largeur "l", la hauteur "h", et le nombre de mines de la grille "m"
	 * pour créer sa grille personnalisé
	 * @param l    largeur de la grille
	 * @param h    hauteur de la grille
	 * @param m    nombre de mines de la grille
	 */
	public Grille(int l, int h, int m)
	{
		this.largeur = l;
		this.hauteur = h;
		this.grille = new Cellule[l][h];
		this.nbMines = m;
		
		int bas = 0;
		while (bas < this.largeur)
		{
			int droite =0;
			while (droite < this.hauteur)
			{
				this.grille[bas][droite] = new Cellule();
				droite++;
			}
			bas++;
		}	

		//--------------------------------------
		//--- Géneration aléatoire des mines ---
		//-------------------------------------
		Random mineAleatoire = new Random();
		int mineGenerer =0;
		
		while (mineGenerer < this.nbMines + 1)
		{			
			this.grille[mineAleatoire.nextInt(this.largeur)][mineAleatoire.nextInt(this.hauteur)] =
				new Cellule(true,0,true);
				mineGenerer++;
		}
		
		
		for (int j = 0; j < h; j++)
			for (int i = 0; i < l; i++)
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
				if (j+1 < h)
				{
					if (this.grille[i][j+1].getPresenceMine()) 
						nbMines++;
				}
				if (i+1 < l)
				{
					if (this.grille[i+1][j].getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >= 0)&&(j-1 >= 0))
				{
					if (this.grille[i-1][j-1].getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < l)&&(j+1 < h))
				{
					if (this.grille[i+1][j+1].getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < l)&&(j-1 >=0))
				{
					if (this.grille[i+1][j-1].getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >=0)&&(j+1 < h))
				{
					if (this.grille[i-1][j+1].getPresenceMine()) 
						nbMines++;
				}
					
				this.grille[i][j].setNbMinesVoisines(nbMines);
			}
		
	}

	//-----------------------------------------------------------------------
	// <---- Méthodes ---->
	//-----------------------------------------------------------------------
	
	/**
	* On retourne une chaine de caractère représentant notre objet, ici, une grille
	* @return result - Chaîne de caractère représentant la grille en chaîne ASCII 
	*/
	public String toString()
	{
		String result ="";
		
		int bas =0;
		while (bas < this.largeur)
		{
			int droite =0;
			while (droite < this.hauteur)
			{
				result = result + "|" + this.grille[bas][droite].toString() +"|";
				
				droite++;
			}
			result=result+"\n";
			bas++;
		}
		
		return result;
	}	


	
	//-----------------------------------------------------------------------
	// <---- Accesseurs ---->
	//-----------------------------------------------------------------------
	
	/**
	 * Accesseur renvoyant la largeur de la grille
	 * @return largeur 
	 */
	public int getLargeur()
	{
		return this.largeur;
	}
	
	/**
	 * Accesseur renvoyant la hauteur de la grille
	 * @return hauteur 
	 */
	public int getHauteur()
	{
		return this.hauteur;
	}
	
	/**
	 * Accesseur renvoyant le nombres de mines de la grille
	 * @return nbMines
	 */
	public int getNbMines()
	{
		return this.nbMines;
	}
	
	
		
	//-----------------------------------------------------------------------
	// <---- Mutateurs ---->
	//-----------------------------------------------------------------------
		
	// Eventuellement
}
