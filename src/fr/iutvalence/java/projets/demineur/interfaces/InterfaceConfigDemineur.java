package fr.iutvalence.java.projets.demineur.interfaces;

/**
 * interface permettant de configurer une partie de demineur, c'est-à-dire de choisir
 * le type de démineur
 * 
 * @author Lambert Quentin / Chaufournais Loic
 */
public interface InterfaceConfigDemineur
{	
	/**
	 * Méthode permettant de renvoyer la configuration d'une grille
	 * @return La configuration de la grille (le type de grille avec sa largeur, sa hauteur et son
	 * nombres de mines)
	 */
	public int getChoixConfigGrille();
	
	/**
	 * Accesseur permettant de renvoyé l'entier correspondant au menu de jeu choisi
	 * par l'utilisateur
	 * @return L'entier correspondant au choix du menu de l'utilisateur
	 */
	public int getChoixConfig();

	/**
	 * @param choixConfig Entier
	 */
	public void setChoixConfig(int choixConfig);

}
