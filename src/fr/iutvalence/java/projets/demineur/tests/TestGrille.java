package fr.iutvalence.java.projets.demineur.tests;

import fr.iutvalence.java.projets.demineur.Grille;
 
/**
 * Classe de test permettant d'afficher une simple grille pour vérifier le fonctionnement de l'affichage
 * 
 * @author Lambert Quentin / Chaufournais Loic
 */
public class TestGrille
{

	/**
	 * Affichage de deux grilles (par défaut et personnalisé) avec leurs largeur, leurs hauteur et leurs 
	 * nombres de mines
	 * @param args Argument de la fonction main
	 */
	public static void main(String[] args)
	{
		Grille g1 = new Grille();
		Grille g2 = new Grille(5, 10, 8);
		
		System.out.println(g1.toString());
		System.out.print("Hauteur de la grille : ");
		System.out.println(g1.getHauteur());
		System.out.print("Largeur de la grille : ");
		System.out.println(g1.getLargeur());
		System.out.print("Nombres de mines de la grille : ");
		System.out.println(g1.getNbMines());
		
		System.out.println(g2.toString());
		System.out.print("Hauteur de la grille : ");
		System.out.println(g2.getHauteur());
		System.out.print("Largeur de la grille : ");
		System.out.println(g2.getLargeur());
		System.out.print("Nombres de mines de la grille : ");
		System.out.println(g2.getNbMines());
	}

}
