package fr.demineur;

// FIXME détailler le commentaire
/**
 * Classe de gestion d'une partie de demineur
 * @Author Lambert & Chaufournais
 */


public class Demineur
{
	
	
	// FIXME attributs, constructeurs ?
	
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
	
