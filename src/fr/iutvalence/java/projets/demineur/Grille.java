package fr.iutvalence.java.projets.demineur;


// FIXME détailler le commentaire
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
	 * largeur grille
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
		
	}
	
	
	// FIXME corriger et compléter le commentaire  (FIXED)
	/**
	 * Constructeur de la grille de jeu personnalisée
	 * Le joueur choisi la largeur "l", la hauteur "h", et le nombre de mines de la grille "m".
	 * @param l
	 * @param h
	 * @param m
	 */
	public Grille(int l, int h, int m)
	{		
		this.largeur = l;
		this.hauteur = h;
		this.grille = new Cellule[l][h];
		this.nbMines = m;
		
	}



	// 	FIXME écrire un commentaire  FIXED
	
	/*
	 * Parcours de notre grille pour créer toute nos cellules initialisées à 0.
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result ="";
		
		int i =0;
		while (i < LARGEUR_DEFAUT)
		{
			int j =0;
			while (j < HAUTEUR_DEFAUT)
			{
				grille[i][j] = new Cellule(0);
				j++;
			}
			i++;
		}
		
		return result;
	}
	
	//FIXME méthodes ?
	
	
	
}
