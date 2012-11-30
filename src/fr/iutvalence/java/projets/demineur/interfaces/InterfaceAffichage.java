package fr.iutvalence.java.projets.demineur.interfaces;

import fr.iutvalence.java.projets.demineur.Grille;

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
	 * affiche le message de bienvenue
	 */
	public void msgBienvenue();
	
	/**
	 * affiche le menu du jeu
	 */
	public void afficherMenu();
	
	/**
	 * Message qui demande à l'utilisateur la largeur de la grille souhaité
	 */
	public void messageChoixLargeur();
	
	/**
	 * Message qui demande à l'utilisateur la hauteur de la grille souhaité
	 */
	public void messageChoixHauteur();
	
	/**
	 * Message qui demande à l'utilisateur le nombre de mines souhaité dans la grille
	 */
	public void messageChoixNombreMines();
	
	/**
	 * Message qui prévient l'utilisateur que celui-ci n'a pas choisi de menu existant
	 */
	public void messageErreurChoixMenu();
	
	/**
	 * Message qui prévient l'utilisateur que celui-ci à perdu la partie de démineur
	 * @param compteur nombre de cases non découvertes
	 */
	public void messageGameOver(int compteur);
	
	/**
	 * Message qui prévient l'utilisateur que celui-ci à gagner la partie de démineur
	 */
	public void messageWinner();
	
	/**
	 * Message de fin (message à la fin d'une partie)
	 */
	public void messageFinPartie();
	
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
	
	/**
	 * Message demandant à l'utilisateur de choisir l'abcsisse de la celulle qu'il veut découvrir
	 */
	public void messageChoixAbcisse();
	
	/**
	 * Message demandant à l'utilisateur de choisir l'ordonnee de la celulle qu'il veut découvrir
	 */
	public void messageChoixOrdonnée();
	
	
	/**
	 * Message indiquant à l'utilisateur que celui-ci à choisi une abscisse invalide 
	 * (inférieur à un ou en dehors de la grille)
	 */
	public void messageAbscisseInvalide();
	
	/**
	 * Message indiquant à l'utilisateur que celui-ci à choisi une ordonnee invalide 
	 * (inférieur à un ou en dehors de la grille)
	 */
	public void messageOrdonneeInvalide();
}
