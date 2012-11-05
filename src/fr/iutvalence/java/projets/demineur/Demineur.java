package fr.iutvalence.java.projets.demineur;

/**
 * Classe de gestion d'une partie de demineur
 * classe qui reprendra les autres classes pour pouvoir jouer
 * 
 * stardust00 <setsuna00ql@gmail.com>
 * @Author Lambert & Chaufournais
 */


public class Demineur
{
	
	//-----------------------------------------------------------------------
	// Attributs
	//-----------------------------------------------------------------------
		
	
	// FIXME déplacer les définitions des attributs avant celles des constructeurs   FIXED
	/**
	 * Booléen spécifiant si le joueur a perdu
	 */
	public boolean aPerdu;
	
	
	
	//-----------------------------------------------------------------------
	// Constructeur
	//-----------------------------------------------------------------------
	
	// FIXME attributs, constructeurs ?   FIXED
	

	
	

	
	//-----------------------------------------------------------------------
	// Methodes
	//-----------------------------------------------------------------------
	
	
	/**
	 * Défini la partie comme étant perdue
	 */
	public void perdu()
	{
		this.aPerdu = false;
	}
		
	/**
	 * Défini la partie comme n'étant pas perdu
	 */
	public void pasperdu()
	{
		this.aPerdu = true;
	}

 }
	
