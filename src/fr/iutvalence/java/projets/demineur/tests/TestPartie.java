package fr.iutvalence.java.projets.demineur.tests;

import fr.iutvalence.java.projets.demineur.Demineur;

/**
 * Classe permettant de jouer une partie de démineur aléatoirement
 * @author Loic
 */
public class TestPartie
{
	/**
	 * @param args Argument de la fonction main
	 */
	public static void main(String[] args)
	{
		System.out.println(" Bienvenue sur le démineur");
		Demineur d = new Demineur(2,4,2);
		d.jouer();
	}

}
