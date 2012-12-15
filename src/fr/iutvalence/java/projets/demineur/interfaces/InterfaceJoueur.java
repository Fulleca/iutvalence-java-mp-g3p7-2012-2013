package fr.iutvalence.java.projets.demineur.interfaces;

import fr.iutvalence.java.projets.demineur.mvc.Position;

/**
 * Interface joueur permettant de recupérer les cases à découvrir étant choisies par l'utilisateur
 * 
 * @author Lambert Quentin / Chaufournais Loic
 */
public interface InterfaceJoueur
{
	/**
	 * Méthode permettant de retourner la cellule a decouvrir
	 * @return la position de la cellule a decouvrir
	 */
	public Position getCaseADecouvrir();
	
	/**
	 * @return La coordonnée x de la cellule choisi par l'utilisateur
	 */
	public int getChoixX();

	/**
	 * @param choixX Modifie la coordonnée x (choisie par l'utilisateur) de la cellule 
	 */
	public void setChoixX(int choixX);

	/**
	 * @return La coordonnée x de la cellule choisi par l'utilisateur
	 */
	public int getChoixY();

	/**
	 * @param choixY MModifie la coordonnée y (choisie par l'utilisateur) de la cellule 
	 */
	public void setChoixY(int choixY);
}
