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
	
	
	// FIXME attributs, constructeurs ?
	
	// FIXME compléter le commentaire
	/**
	 * 
	 * @return nbmines
	 */
	public int nbMines()
	{
		int nbmines = 0;
		int j = -1;
		while (j < 2)
		{
			int i = -1;
			while (i < 2)
			{
				if (grille[largeur+i][hauteur+j] ==1)
				{
					nbmines = nbmines+1;
				}			
			i = i+1;
			}
		j = j+1;
		}
		return nbmines;
	}
	
	
	// FIXME déplacer les définitions des attributs avant celles des constructeurs
	/**
	 * Booléen spécifiant si le joueur a perdu
	 */
	public boolean aPerdu;
	
	// Définitions des méthodes
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
	
