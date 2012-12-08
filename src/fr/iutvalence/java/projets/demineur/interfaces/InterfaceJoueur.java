package fr.iutvalence.java.projets.demineur.interfaces;

import fr.iutvalence.java.projets.demineur.mvc.Position;

/**
 * @author Loic
 * Interface joueur
 */
public interface InterfaceJoueur
{
	/**
	 * Méthode permettant de retourner la cellule a decouvrir
	 * @return la position de la case a decouvrir
	 */
	public Position getCaseADecouvrir();
}
