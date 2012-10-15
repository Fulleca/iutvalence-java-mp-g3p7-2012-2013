package fr.iutvalence.java.projets.demineur;


// FIXME détailler le commentaire FIXED
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
		while (bas < LARGEUR_DEFAUT)
		{
			int droite =0;
			while (droite < HAUTEUR_DEFAUT)
			{
				grille[bas][droite] = new Cellule();
				droite++;
			}
			bas++;
		}
	}
	
	
	// FIXME corriger et compléter le commentaire  FIXED
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
		
		int bas = 0;
			while (bas < l)
			{
				int droite =0;
				while (droite < h)
				{
					grille[bas][droite] = new Cellule();
					droite++;
				}
				bas++;
			}		
	}



	// 	FIXME écrire un commentaire  FIXED
	
	/*
	 * Parcours de notre grille pour créer toute nos cellules
	 * 
	 * @see java.lang.Object#toString()
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
	
	//FIXME méthodes ?
	
	
	
}
