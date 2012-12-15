package fr.iutvalence.java.projets.demineur.mvc;

import java.util.Scanner;

import fr.iutvalence.java.projets.demineur.interfaces.InterfaceJoueur;

/**
 * Classe permettant de gérer les saisies claviers de l'utilisateur via l'implémentation
 * de l'interface "InterfaceJoueur"
 * 
 * @author Lambert Quentin / Chaufournais Loic
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

	@Override
	public int getChoixX()
	{
		return this.choixX;
	}

	@Override
	public void setChoixX(int choixX)
	{
		this.choixX = choixX;
	}

	@Override
	public int getChoixY()
	{
		return this.choixY;
	}

	@Override
	public void setChoixY(int choixY)
	{
		this.choixY = choixY;
	}
}	
