/**
 * Classe utilisée pour la gestion de la grille
 * @author chaufoul
 */



public class Grille
{
	// Attributs
	
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
	private final static int NB_MINES = 10;
	
	//FIXME la valeur de l'attribut peut-elle changer une fois l'objet créé ?
	/**
	 * largeur grille
	 */
	private int largeur;

	//FIXME la valeur de l'attribut peut-elle changer une fois l'objet créé ?
	/**
	 * largeur grille
	 */
	private int hauteur;
	
	//FIXME la valeur de l'attribut peut-elle changer une fois l'objet créé ?
	/**
	 * nombre de mines dans la grille
	 */
	private int nbMines;

	// FIXME compléter le commentaire
	// FIXME visibilité de l'attribut ?
	/**
	 * Grille de jeu
	 */
	public int grille[][];
	
	
	// FIXME compléter le commentaire
	/**
	 * Constructeur par défaut
	 */
	public Grille()
	{
		this.largeur = LARGEUR_DEFAUT; 
		this.hauteur = HAUTEUR_DEFAUT;
		this.nbMines = NB_MINES;
		this.grille = new int[LARGEUR_DEFAUT][HAUTEUR_DEFAUT];
		
	}
	
	// FIXME compléter le commentaire
	/**
	 * Constructeur personnalisé
	 * @param l
	 * @param h
	 * @param m
	 */
	public Grille(int l, int h, int m)
	{		
		this.largeur = l;
		this.hauteur = h;
		this.grille = new int[l][h];
		this.nbMines = m;
		
	}
	
	//FIXME méthodes ?
	
	
	
}
