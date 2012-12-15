
package fr.iutvalence.java.projets.demineur;


/**
 * Classe cellule qui gère l'état d'une cellule, c'est-à-dire si une cellule est cachée, visible et 
 * si celle-ci contient ou non une mine.
 *
 * @author Lambert Quentin / Chaufournais Loïc
 */
public class Cellule
{
	//////////////////////////////////////////////////////////////
	//////////////////////////  ATTRIBUTS  ///////////////////////
	/////////////////////////////////////////////////////////////

	/**
	 * Booléen spécifiant la visibilité d'une cellule.  
	 */
	private boolean visible;	
	
	/**
	 * Booléen spécifiant si une mine est présente ou non sur une cellule.
	 */
	private boolean presenceMine;
	
	/**
	 * Valeur indiquant le nombre de mines se trouvant aux alentours d'une cellule
	 * (si celle-ci ne contenait déja pas une mine)
	 */
	public int nbMinesVoisines;
		
	
	//////////////////////////////////////////////////////////////
	///////////////////////  CONSTRUCTEURS  /////////////////////
	/////////////////////////////////////////////////////////////
	
	/**
	 * Constructeur d'une Cellule par défaut.
	 * Par defaut, une cellule est caché.
	 * Le nombre de mines aux alentours reste à 0 tant que l'on ne clique pas sur la cellule.
	 */
	public Cellule()
	{
		this.visible = false;
		this.nbMinesVoisines = 0;
		this.presenceMine = false;
	}
	
	/**
	 * Constructeur d'une Cellule ayant trois paramètres.
	 * @param d - Visibilité de la cellule ( true ou false)
	 * @param nb - Nombre de mines aux alentours de la cellule
	 * @param p - Boolée spécifiant si la cellule contient une mine
	 */
	public Cellule(boolean d, int nb, boolean p)
	{
		this.visible = d;
		this.nbMinesVoisines = nb;
		this.presenceMine = p;
	}
	
	//////////////////////////////////////////////////////////////
	//////////////////////////  METHODES  ////////////////////////
	/////////////////////////////////////////////////////////////

	/**
	 * Méthode spécifiant qu'une cellule est visible
	 */
	public void visible()
	{
		this.visible = true;
	}

	/**
	 * Méthode spécifiant qu'une cellule est caché
	 */
	public void cacher()
	{
		this.visible = false;
	}

	/**
	* Méthode spécifiant qu'une mine est présente "sous" une cellule
	*/
	public void ouiMine()
	{
		this.presenceMine = true;
	}
		
	/**
	* Méthode spécifiant qu'aucune mine n'est présente "sous" une cellule
	*/
	public void nonMine()
	{
		this.presenceMine = false;
	}

	/**
	* On retourne une chaine de caractère représentant notre objet, ici nos cellules
	* Si la cellule est visible, nous l'afficherons par le signe "+", sinon, c'est que la cellule est caché (représenté par "-") 
	* Nous representerons le fait qu'ne cellule contienne une mine par le symbole "¤"
	* @return result - Chaîne de caractère représentant une mine 
	*/
	public String toString()
	{
		String result = "";
			
		if (this.visible)
		{	
			if (this.presenceMine)
			{	
				result = result + ("+" + this.nbMinesVoisines + "¤");
			}	
			else
			{	
				result = result + ("+" + this.nbMinesVoisines + " ");
			}
		}	
		else
		{	
			if (this.presenceMine)
			{	
				result = result + ("-" + this.nbMinesVoisines + "¤");
			}	
			else
			{	
				result = result + ("-" + this.nbMinesVoisines + " ");
			}
		}	
		
		return result;
	}	
	
	//////////////////////////////////////////////////////////////
	/////////////////////////  ACCESSEURS  //////////////////////
	/////////////////////////////////////////////////////////////
	
	/**
	 * Accesseur renvoyant un booléen. Si renvoie "True", alors la cellule est visible, sinon
	 * celle-ci est "caché".
	 * @return visible - boolean
	 */
	public boolean getVisibilite()
	{
		return this.visible;
	}
	
	/**
	 * Accesseur renvoyant un booléen. Si renvoie "True", alors la cellule contient une mine,
	 * sinon celle-ci n'en contient pas.
	 * @return presenceMine - boolean
	 */
	public boolean getPresenceMine()
	{
		return this.presenceMine;
	}
	
	/**
	 * Accesseur renvoyant un entien.
	 * @return nbMinesVoisines - entier représentant le nombres de mines voisines.
	 */
	public int getNbMinesVoisines()
	{
		return this.nbMinesVoisines;
	}
	

	//////////////////////////////////////////////////////////////
	//////////////////////////  SETTEURS  ////////////////////////
	/////////////////////////////////////////////////////////////
	
	/**
	 * Mutateur permettant de modifier l'attribut visible
	 * @param visible booléen indiquant la visibilité d'une cellule
	 */
	public void setVisibilite(boolean visible)
	{
		this.visible = visible;
	}
	
	/**
	 * Mutateur permettant de modifier l'attribut presenceMine
	 * @param presenceMine booléen spécifiant si une mine est présente
	 */
	public void setPresenceMine(boolean presenceMine)
	{
		this.presenceMine = presenceMine;
	}
	
	/**
	 * Mutateur permettant de modifier l'attribut NbMinesVoisines
	 * @param nbMinesVoisines nombres de mines se trouvant autour de la cellule
	 */
	public void setNbMinesVoisines(int nbMinesVoisines)
	{
		this.nbMinesVoisines = nbMinesVoisines;
	}
}
	
