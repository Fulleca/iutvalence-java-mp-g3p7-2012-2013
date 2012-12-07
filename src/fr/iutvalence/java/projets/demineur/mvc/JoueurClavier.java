package fr.iutvalence.java.projets.demineur.mvc;

import java.util.Scanner;

import fr.iutvalence.java.projets.demineur.interfaces.InterfaceJoueur;

/**
 * Classe SaisieClavier regroupant les méthodes de saisie clavier de l'utilisateur
 * Cette classe implémente InterfaceClavier
 * @author Loic
 *
 */
public class JoueurClavier implements InterfaceJoueur
{
	/**
	 * 
	 */
	private int choixX;
	
	/**
	 * 
	 */
	private int choixY;

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
	 * @param choixX Modifie la coordonnée x de la cellule 
	 */
	public void setChoixX(int choixX)
	{
		this.choixX = choixX;
	}

	/**
	 * @return La coordonnée t de la cellule choisi par l'utilisateur
	 */
	public int getChoixY()
	{
		return this.choixY;
	}

	/**
	 * @param choixY
	 */
	public void setChoixY(int choixY)
	{
		this.choixY = choixY;
	}

}
