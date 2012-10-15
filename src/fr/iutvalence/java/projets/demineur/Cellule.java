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
	// FIXME la ligne au dessus est inutile FIXED
	private boolean presenceMine;
	


	/**
	 * Valeur indiquant le nombre de mines aux alentours de la cellule ciblé 
	 * (si celle-ci ne contenait déja pas une mine)
	 */
	public int nbMines;
		
	
	//-----------------------------------------------------------------------
	// Constructeur
	//-----------------------------------------------------------------------
	
	// FIXME placer le constructeur avant les méthodes  FIXED
	// FIXME compléter le commentaire (balises @param)  FIXED
	/**
	 * Constructeur d'une Cellule par défaut.
	 * Une cellule est couverte par défaut.
	 * Le nombre de mine aux alentours reste à 0 tant que l'on ne clique pas sur la cellule.
	 */
	public Cellule()
	{
		this.decouvert = true;
		this.nbMines = 0;

		
	}
	
	
	
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



		public String toString()
		{
			String result ="";
			
			if (this.decouvert)
				result = result + ("+"+ nbMines);
			else
				result = result + ("-"+ nbMines);
		
			return result;
		}

	
}
	
