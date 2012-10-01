
public class Cellule
{
	/**
	 * 
	 */
	public boolean presenceMine;
	
	/**
	 * 
	 */
	public boolean decouvert;
	
	/**
	 * 
	 */
	public int nbMines;
	
	
	/**
	 * Cellule caché
	 */
	public void decouverte()
	{
		this.decouvert=false;
	}
	
	/**
	 * 
	 */
	public void couverte()
	{
		this.decouvert=true;
	}

	/**
	 * 
	 */
	public void ouiMine()
	{
		this.presenceMine=true;
	}
	
	/**
	 * 
	 */
	public void nonMine()
	{
		this.presenceMine=false;
	}
	
	
}
	
