package fr.iutvalence.java.projets.demineur.mvc;

/**
 * Classe permettant de spécifier le fait qu'une cellule se situe 
 * à une certaine position dans une position
 * 
 * @author Lambert Quentin / Chaufournais Loic
 */
public class Position
{
	//////////////////////////////////////////////////////////////
	//////////////////////////  ATTRIBUTS  ///////////////////////
	/////////////////////////////////////////////////////////////
	
	/**
	 * Coordonnée x de la cellule
	 */
	private final int x;
	
	/**
	 * Coordonnée y de la cellule
	 */
	private final int y;

	//////////////////////////////////////////////////////////////
	///////////////////////  CONSTRUCTEURS  /////////////////////
	/////////////////////////////////////////////////////////////
	
	/**
	 * Constructeur par défaut. Permet de créer une position
	 * @param x Coordonnée x de la cellule
	 * @param y Coordonnée y de la cellule
	 */
	public Position(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}
	
	//////////////////////////////////////////////////////////////
	//////////////////////////  METHODES  ////////////////////////
	/////////////////////////////////////////////////////////////
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.x;
		result = prime * result + this.y;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (this.x != other.x)
			return false;
		if (this.y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Position [x=" + this.x + ", y=" + this.y + "]";
	}

	//////////////////////////////////////////////////////////////
	/////////////////////////  ACCESSEURS  //////////////////////
	/////////////////////////////////////////////////////////////
	
	/**
	 * Getteur retournant la coordonné x d'une cellule
	 * @return La position x d'une cellule
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * Getteur retournant la coordonné y d'une cellule
	 * @return La position y d'une cellule
	 */
	public int getY()
	{
		return this.y;
	}

	
	

	
}
