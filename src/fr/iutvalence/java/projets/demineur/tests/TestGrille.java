package fr.iutvalence.java.projets.demineur.tests;

import fr.iutvalence.java.projets.demineur.Grille;
 
/**
 * Classe de test pour vérifier que l'affichage fonctionne
 * 
 * @author chaufoul
 */
public class TestGrille
{

	/**
	 * Affichage de notre nouvelle Grille avec la méthode toString
	 * @param args Argument de la fonction main
	 */
	public static void main(String[] args)
	{
		Grille G = new Grille(20,5,3);
		
		System.out.println(G.toString());
		System.out.print("Hauteur de la grille : ");
		System.out.println(G.getHauteur());
		System.out.print("Largeur de la grille : ");
		System.out.println(G.getLargeur());
		System.out.print("Nombres de mines de la grille : ");
		System.out.println(G.getNbMines());
	}

}
