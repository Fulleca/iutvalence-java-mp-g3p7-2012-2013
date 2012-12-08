package fr.iutvalence.java.projets.demineur;

import fr.iutvalence.java.projets.demineur.interfaces.InterfaceAffichage;


/**
 * Classe AffichageConsole permettant d'afficher des messages console
 * Cette classe implémente InterfaceAffichage
 * @author Loic
 */
public class AffichageConsole implements InterfaceAffichage
{
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private String affiche;
	
	/**
	 * Constructeur par défaut  
	 */
	public AffichageConsole()
	{
		this.affiche = "";
	}
	
	@Override
	public void afficherGrille(Grille g)
	{		
		System.out.println(g.toString());	
	}
	
	@Override
	public void messageGameOver(int compteur)
	{
		System.out.println("GAME OVER");
		System.out.println("Dommage,il vous restait " + (compteur + 1) + " case(s) à découvrir");
		System.out.println("---------------------------------------------");
		System.out.println("Fin du démineur");
	}
	
	@Override
	public void messageChoixCelulle(Grille g, int x, int y)
	{
		g.getCellule(x,y);
		System.out.println("Cellule choisie : [" + (x+1) + "," + (y+1) + "]");
	}
	
	@Override
	public void messageContinuerAJouer(Grille g,int x, int y, int compteur)
	{
		System.out.println("ATTENTION ! Il y a " + g.getCellule(x, y).nbMinesVoisines + " mine(s) autour de la cellule [" + (x+1) + "," + (y+1) + "]");
		System.out.println("/** Nombre de case(s) restante(s) à dévouvrir : " + compteur + " **/" );
		System.out.println("----------------------------------------------------");
	}
	
	@Override
	public void afficherMsg(String chaine)
	{
		System.out.println(chaine);
	}
}
