package fr.iutvalence.java.projets.demineur.tests;

import fr.iutvalence.java.projets.demineur.Demineur;

/**
 * Classe test permettant de simuler une partie de démineur joué par l'ordinateur
 * 
 * @author Lambert Quentin / Chaufornais Loic
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
