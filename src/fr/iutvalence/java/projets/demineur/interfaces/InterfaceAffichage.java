package fr.iutvalence.java.projets.demineur.interfaces;

import fr.iutvalence.java.projets.demineur.Grille;
//import fr.iutvalence.java.projets.demineur.String;

/**
 * Interface pour l'affichage
 * @author Loic
 */
public interface InterfaceAffichage
{
	/**
	 * affiche une grille
	 * @param g grille à afficher
	 */
	public void afficherGrille(Grille g);
	
	/**
	 * Méthode permettant d'afficher un message
	 * @param message Message a ecrire sur la console
	 */
	public void afficherMsg(String chaine);	
	
	/**
	 * Message indiquant à l'utilisateur quel cellule celui-ci à choisie
	 * @param g grille de jeu
	 * @param x abscisse de la celulle
	 * @param y ordonnee de la cellule
	 */
	public void messageChoixCelulle(Grille g, int x, int y);
	
	/**
	 * Message indiquant à l'utilisateur quel le nombre de mines présentent
	 * autour de la cellule choisie ainsi que le nombre de cases restantes à découvrir
	 * @param g grille de jeu
	 * @param x abscisse de la celulle
	 * @param y ordonnee de la cellule
	 * @param compteur nombre de cases non découvertes
	 */
	public void messageContinuerAJouer(Grille g,int x, int y, int compteur);
	
}
