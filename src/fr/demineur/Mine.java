package fr.demineur;


/**
 * Classe utilisée pour la gestion des mines
 * @author chaufoul
 */
public class Mine
{
	
	//-----------------------------------------------------------------------
	// Attributs
	//-----------------------------------------------------------------------
	
	
	// FIXME ne pas gérer le combre total de mines ici
	/**
	 * Nombre de mine présent dans la grille
	 */
	private int nombreMines;
	
	
	/**
	 * Constante initialisant le nombre de mines par défaut (10 mines).
	 * En privé, le joueur ne peut pas changer les données pas défauts.
	 */
	private final static int NOMBRE_MINE = 10;
	
	
	
	/**
	 * Etat d'une mine (activée ou non)
	 */
	public boolean estActivee;
	
	
	//-----------------------------------------------------------------------
	// Définitions des méthodes
	//-----------------------------------------------------------------------
	
	
	/**
	 * Défini une mine comme étant activée
	 */
	public void aciver()
	{
		this.estActivee = true;
	}
	

	/**
	 * Défini une mine comme étant non active
	 */
	public void nonActiver()
	{
		this.estActivee = false;
	}
	
	
	//-----------------------------------------------------------------------
	// Constructeur par défaut
	//-----------------------------------------------------------------------
	
	
	/**
	 * Constructeur par défaut d'une mine
	 * Nombre de mines par défaut dans le jeu (10 mines)
	 * 
	 * 
	 */
	public Mine()
	{
		this.nombreMines = NOMBRE_MINE;
		this.estActivee = false;
	}
}
