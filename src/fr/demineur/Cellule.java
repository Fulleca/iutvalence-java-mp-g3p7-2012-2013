package fr.demineur;


/**
 * 
 * Classe cellule, gère l'état des cellules.
 * Si couverte/découverte, miné ou non.
 * 
 * @author chaufoul
 *
 */
public class Cellule
{
	
	//-----------------------------------------------------------------------
	// Attribut
	//-----------------------------------------------------------------------
	
	
	
	/**
	 * Booléen de visibilité d'une cellule.
	 * Privé car intuile à connaitre pour le joueur.
	 */
	private boolean decouvert;	
	
	
	
	/**
	 * Booléen de présence des mines sur une cellule.
	 * En privé car le joueur ne doit pas en prendre connaissance.
	 */
	private boolean presenceMine;
	


	/**
	 * Valeur indiquant le nombre de mines aux alentours de la cellule ciblé 
	 * (si celle-ci ne contenait déja pas une mine)
	 */
	public int nbMines;
	
	
	//-----------------------------------------------------------------------
	// Methode
	//-----------------------------------------------------------------------


	/**
	 * Méthode spécifiant le contenu une cellule comme étant découverte (visible)
	 * @param Auncun
	 */
	public void decouverte()
	{
		this.decouvert = false;
	}

	
	/**
	 * Méthode spécifiant le contenu une cellule comme étant couverte (caché)
	 * @param Auncun
	 */
	public void couverte()
	{
		this.decouvert = true;
	}


	/**
	 * Méthode spécifiant qu'une mine est présente "sous" la cellule caché.
	 * @param Auncun
	 */
	public void ouiMine()
	{
		this.presenceMine=true;
	}
	

	/**
	 * Méthode spécifiant qu'aucune mine n'est présente "sous" la cellule caché.
	 * @param Auncun
	 */
	public void nonMine()
	{
		this.presenceMine=false;
	}
	
	
	//-----------------------------------------------------------------------
	// Constructeur
	//-----------------------------------------------------------------------
	
	
	/**
	 * Constructeur d'une Cellule par défaut.
	 * Une cellule est couverte par défaut.
	 * Le nombre de mine aux alentours reste à 0 tant que l'on ne clique pas sur la cellule.
	 */
	public Cellule(int x, int y)
	{
		this.decouvert = true;
		this.nbMines = 0;
	}
	
}
	
