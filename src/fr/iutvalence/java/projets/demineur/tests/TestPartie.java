package fr.iutvalence.java.projets.demineur.tests;

import fr.iutvalence.java.projets.demineur.AffichageConsole;
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
		AffichageConsole affiche = new AffichageConsole();
		Demineur d = new Demineur(2,4,5);
	}

}
