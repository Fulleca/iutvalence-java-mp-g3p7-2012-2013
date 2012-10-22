package fr.iutvalence.java.projets.demineur;

import java.util.Random;

/**
 * Classe permettant de gérer une grille
 * A l'aide d'une largeur, une hauteur, un nombre de mine
 * Pouvant être défini par défaut ou être personalisé
 * @author chaufoul
 */



public class Grille
{
	//-----------------------------------------------------------------------
	// Attributs
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
	 * Nombre de mines par défaut
	 */
	private final static int NB_MINES_DEFAUT = 10;
	

	/**
	 * largeur grille
	 */
	private final int largeur;
	
	
	/**
	 * hauteur grille
	 */
	private final int hauteur;
	

	/**
	 * nombre de mines dans la grille
	 */
	private final int nbMines;

	/**
	 * Grille de jeu
	 * Jeu à 2 dimensions
	 * Tableau dans un tableau géré par une "largeur" et une "hauteur"
	 */
	private Cellule[][] grille;
	
	
	//-----------------------------------------------------------------------
	// Constructeur
	//-----------------------------------------------------------------------
	

	/**
	 * Constructeur par défaut
	 * largeur 10 cellules
	 * hauteur 10 cellules
	 * nombre de mines 10
	 */
	public Grille()
	{
		this.largeur = LARGEUR_DEFAUT;
		this.hauteur = HAUTEUR_DEFAUT;
		this.nbMines = NB_MINES_DEFAUT;
		this.grille = new Cellule[LARGEUR_DEFAUT][HAUTEUR_DEFAUT];
		
		int bas =0;
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
		
		/*----------------------------------------------------------------------
		/*--------------------Generateur Aléatoire de mines---------------------
		/*--------------------------------------------------------------------*/
		
		
		/**
		 * random va nous servir a générer aléatoirement nos mines dans la grille
		 */
		Random random = new Random();
		int mineGenerer =0;
		
		while (mineGenerer < nbMines+1)
		{
			this.grille[random.nextInt(largeur)][random.nextInt(hauteur)] = 
					new Cellule(true,0,true);
			mineGenerer++;
		}
		
		
		/*----------------------------------------------------------------------
		/*--------------------Algo nombre de Mine voisine-----------------------
		/*--------------------------------------------------------------------*/
		
		/*
		int nbMinesVoisines = 0;
		int j = -1;
		while (j < 2)
		{
			int i = -1;
			while (i < 2)
			{
				if (grille[largeur+i][hauteur+j].ouiMine())
				{
					nbMinesVoisines = nbMinesVoisines+1;
				}			
			i = i+1;
			}
		j = j+1;
		}

	}
	*/
	}
	// FIXME corriger et compléter le commentaire    FIXED
	/**
	 * Constructeur de la grille de jeu personnalisée
	 * Le joueur choisi la largeur "l", la hauteur "h", et le nombre de mines de la grille "m"
	 * pour créer sa grille personnalisé
	 * @param l    largeur
	 * @param h    hauteur
	 * @param m    nombre de mines
	 */
	public Grille(int l, int h, int m)
	{	
		this.largeur = l;
		this.hauteur = h;
		this.grille = new Cellule[l][h];
		this.nbMines = m;
		
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
			/**
			 * random va nous servir a générer aléatoirement nos mines dans la grille
			 */
			Random random = new Random();
			int mineGenerer =0;
			
			while (mineGenerer < nbMines+1)
			{
				this.grille[random.nextInt(largeur)][random.nextInt(hauteur)] = 
						new Cellule(true,0,true);
				mineGenerer++;
			}
	}



	// 	FIXME corriger le commentaire  (à discuter)   FIXED
	
	/**
	 * Parcours de notre grille pour créer toute nos cellules
	 * On retourne une chaine de caractère représentant notre objet
	 */
	public String toString()
	{
		String result ="";
		
		int bas =0;
		while (bas < this.LARGEUR_DEFAUT)
		{
			int droite =0;
			while (droite < this.HAUTEUR_DEFAUT)
			{
				result = result + "|" + grille[bas][droite].toString() +"|";
				
				droite++;
			}
			result=result+"\n";
			bas++;
		}
		
		return result;
	}	

	
}
