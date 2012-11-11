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
	
	// FIXME compléter pour que cela ressemble à une partie de démineur (gestion aléatoire des choix pour le moment)
	//-----------------------------------------------------------------------
	// Attributs
	//-----------------------------------------------------------------------
		
	/**
	 * Booléen spécifiant si le joueur a perdu
	 */
	public boolean aPerdu;
	
	
	
	//-----------------------------------------------------------------------
	// Constructeur
	//-----------------------------------------------------------------------
	
	/**
	 * algo de recherche pour une cellule choisie, du nombre de mine autour de celle ci
	 * @return nbmines
	 */
/*	public int nbMinesVoisines()
	{
		int nbmines = 0;
		int j = -1;
		while (j < 2)
		{
			int i = -1;
			while (i < 2)
			{
				if (grille[grille.getLargeur+i][hauteur+j] == 1)
				{
					nbmines = nbmines+1;
				}			
			i = i+1;
			}
		j = j+1;
		}
		return nbmines;
	}*/
	
	

	
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
	
