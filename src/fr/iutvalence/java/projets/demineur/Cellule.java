// FIXME donner au paquetage un nom plus évocateur (fr.iutvalence.java.projets.demineur) FIXED
package fr.iutvalence.java.projets.demineur;


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
	 *  
	 */
	// FIXME la ligne au dessus est inutile FIXED
	private boolean decouvert;	
	
	
	
	/**
	 * Booléen de présence des mines sur une cellule.
	 */
	private boolean presenceMine;
	


	/**
	 * Valeur indiquant le nombre de mines aux alentours de la cellule ciblé 
	 * (si celle-ci ne contenait déja pas une mine)
	 */
	public int nbMinesVoisines;
		
	
	//-----------------------------------------------------------------------
	// Constructeur
	//-----------------------------------------------------------------------
	
	/**
	 * Constructeur d'une Cellule par défaut.
	 * Une cellule est couverte par défaut.
	 * Le nombre de mine aux alentours reste à 0 tant que l'on ne clique pas sur la cellule.
	 */
	public Cellule()
	{
		this.decouvert = true;
		this.nbMinesVoisines = 0;
		this.presenceMine = false;
		// FIXME tous les attributs doivent être initialisé   FIXED
		
	}
	
	public Cellule(boolean d, int nb, boolean p)
	{
		this.decouvert = d;
		this.nbMinesVoisines = nb;
		this.presenceMine = p;
	}
	
	//-----------------------------------------------------------------------
	// Methode
	//-----------------------------------------------------------------------


		/**
		 * Méthode spécifiant le contenu une cellule comme étant découverte (visible)
		 */
		public void decouverte()
		{
			this.decouvert = false;
		}

		
		/**
		 * Méthode spécifiant le contenu une cellule comme étant couverte (caché)
		 */
		public void couverte()
		{
			this.decouvert = true;
		}


		/**
		 * Méthode spécifiant qu'une mine est présente "sous" la cellule caché.
		 * @return 
		 */
		public void ouiMine()
		{
			this.presenceMine=true;
		}
			

		/**
		 * Méthode spécifiant qu'aucune mine n'est présente "sous" la cellule caché.
		 */
		public void nonMine()
		{
			this.presenceMine=false;
		}


		// FIXME compléter le commentaire    FIXED
		/**
		 * On retourne une chaine de caractère représentant notre objet, ici nos cellules
		 * Avec un "+" si la cellule est couverte
		 * Ou un "-" si la cellule est decouverte
		 * @see java.lang.Object#toString()
		 */
		public String toString()
		{
			String result ="";
			
			if (this.decouvert)
				if (this.presenceMine)
					result = result + ("+"+ nbMinesVoisines + "¤");
				else
					result = result + ("+"+ nbMinesVoisines + " ");
			else
				result = result + ("-"+ nbMinesVoisines);
		
			return result;
		}	
		
}
	
