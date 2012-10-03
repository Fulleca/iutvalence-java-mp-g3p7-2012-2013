// FIXME déplacer dans un paquetage

	// FIXME écrire un commentaire
public class Cellule
{
	
	// FIXME écrire un commentaire
	// FIXME réfléchir à la visibilité
	/**
	 * 
	 */
	public boolean presenceMine;
	
	// FIXME écrire un commentaire
	// FIXME réfléchir à la visibilité
	/**
	 * 
	 */
	public boolean decouvert;
	
	// FIXME écrire un commentaire
	// FIXME réfléchir à la visibilité
	/**
	 * 
	 */
	public int nbMines;
	
	
	// FIXME constructeurs ?
	
	
	// FIXME écrire un commentaire
	/**
	 * Cellule caché
	 */
	public void decouverte()
	{
		this.decouvert=false;
	}
	
	// FIXME écrire un commentaire
	/**
	 * 
	 */
	public void couverte()
	{
		this.decouvert=true;
	}

	// FIXME écrire un commentaire
	/**
	 * 
	 */
	public void ouiMine()
	{
		this.presenceMine=true;
	}
	
	// FIXME écrire un commentaire
	/**
	 * 
	 */
	public void nonMine()
	{
		this.presenceMine=false;
	}
	
	
}
	
