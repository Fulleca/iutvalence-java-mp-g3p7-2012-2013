package fr.demineur;


/**
 * Classe utilisée pour la gestion de la grille
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

	// FIXME compléter le commentaire

	/**
	 * Grille de jeu
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
	
	
	

	/**
	 * Constructeur de partie personnalisé
	 * Le joueur choisi la largeur, la hauteur, et le nombre de mines de la grille.
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
