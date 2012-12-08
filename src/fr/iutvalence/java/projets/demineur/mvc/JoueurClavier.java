package fr.iutvalence.java.projets.demineur.mvc;

import java.util.Scanner;

import fr.iutvalence.java.projets.demineur.interfaces.InterfaceConfigDemineur;
import fr.iutvalence.java.projets.demineur.interfaces.InterfaceJoueur;

/**
 * @author Loic
 * Classe SaisieClavier regroupant les méthodes de saisie clavier de l'utilisateur
 * Cette classe implémente InterfaceClavier
 */
public class JoueurClavier implements InterfaceJoueur
{
	/**
	 * Coordonnée x d'une cellule
	 */
	private int choixX;
	
	/**
	 * Coordonnée y d'une cellule
	 */
	private int choixY;
	
	//Scanner choixMenu = new Scanner(System.in);

	@Override
	public Position getCaseADecouvrir()
	{
		Scanner sc = new Scanner(System.in);
		this.choixX = sc.nextInt();
		this.choixY = sc.nextInt();
		return null;
	}

	/**
	 * @return La coordonnée x de la cellule choisi par l'utilisateur
	 */
	public int getChoixX()
	{
		return this.choixX;
	}

	/**
	 * @param choixX Modifie la coordonnée x (choisie par l'utilisateur) de la cellule 
	 */
	public void setChoixX(int choixX)
	{
		this.choixX = choixX;
	}

	/**
	 * @return La coordonnée x de la cellule choisi par l'utilisateur
	 */
	public int getChoixY()
	{
		return this.choixY;
	}

	/**
	 * @param choixY MModifie la coordonnée y (choisie par l'utilisateur) de la cellule 
	 */
	public void setChoixY(int choixY)
	{
		this.choixY = choixY;
	}
}	
