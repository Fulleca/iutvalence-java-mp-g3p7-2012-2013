// FIXME déplacer dans un paquetage
// FIXME compléter le commentaire

/**
 * @Author Lambert & Chaufournais
 */


public class Demineur
{
	
	
	// FIXME attributs, constructeurs ?
	
	// FIXME écrire le commentaire
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
	
	
	// FIXME définir le main dans une classe à part
	// Constructeur par défaut de la classe démineur
	/**
	 * Constructeur du jeu Demineur
	 * @param args 
	 */
	public static void main(String[] args)
	{ 
        
    }
 }
	
