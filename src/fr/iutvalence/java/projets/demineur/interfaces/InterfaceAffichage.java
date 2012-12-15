package fr.iutvalence.java.projets.demineur.interfaces;

import fr.iutvalence.java.projets.demineur.Grille;

/**
 * Interface pour la gestion de l'affichage
 * 
 * @author Lambert Quentin / Chaufournais Loïc
 */
public interface InterfaceAffichage
{
	/**
	 * Méthode permettant d'affiche une grille
	 * @param g grille à afficher
	 */
	public void afficherGrille(Grille g);
	
	/**
	 * Méthode permettant d'afficher un message
	 * @param chaine Chaine de caractère à afficher
	 */
	public void afficherMsg(String chaine);	
	
	/**
	 * Méthode permettant d'afficher un message spécifiant au joueur que celui-ci à perdu
	 * @param compteur Nombre de mines qu'il restait à découvrir
	 */
	public void messageGameOver(int compteur);
	
	/**
	 * Méthode permettant d'afficher une message à l'utilisateur lui indiquant
	 * quelle cellule celui-ci a choisi de découvrir
	 * @param g grille de jeu
	 * @param x abscisse de la celulle
	 * @param y ordonnee de la cellule
	 */
	public void messageChoixCelulle(Grille g, int x, int y);
	
	/**
	 * Méthode affichant un message indiquant à l'utilisateur combien de mines se trouvent 
	 * autour de la cellule choisie ainsi que le nombre de cases restantes à découvrir
	 * @param g grille de jeu
	 * @param x abscisse de la celulle
	 * @param y ordonnee de la cellule
	 * @param compteur nombre de cases non découvertes
	 */
	public void messageContinuerAJouer(Grille g,int x, int y, int compteur);
	
}
