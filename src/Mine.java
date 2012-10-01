/**
 * Classe utilisée pour la gestion des mines
 * @author chaufoul
 */
public class Mine
{
	// Attributs
	
	//FIXME pertinent ?
	/**
	 * Representation d'une mine (nombre 0)
	 */
	public int mine;
	
	
	// FIXME ne pas gérer le combre total de mines ici
	/**
	 * Nombre de mine présent dans la grille
	 */
	public int nombreMine;
	
	/**
	 * Etat d'une mine (activée ou non)
	 */
	public boolean estActivee;
	
	
	// Définitions des méthodes
	/**
	 * Défini une mine comme étant activée
	 */
	public void aciver()
	{
		this.estActivee = true;
	}
	
	 // FIXME respecter les conventions d'écriture
	/**
	 * Défini une mine comme étant non active
	 */
	public void nonactiver()
	{
		this.estActivee = false;
	}
	
	
	// Constructeur par défaut
	
	//FIXME compléter le commentaire
	/**
	 * Constructeur par défaut d'une mine
	 */
	public Mine()
	{
		this.mine = 0;
		this.nombreMine = 10;
		this.estActivee = false;
	}
}
