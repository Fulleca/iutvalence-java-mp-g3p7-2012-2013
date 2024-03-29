package fr.iutvalence.java.projets.demineur.mvc;

import fr.iutvalence.java.projets.demineur.Grille;
import fr.iutvalence.java.projets.demineur.interfaces.InterfaceAffichage;


/**
 * Classe implémentant l'interface "InterfaceAffichage" permettant d'afficher des messages consoles 
 * en ASCII art
 * 
 * @author Lambert Quentin / Chaufournais Loic
 */
public class AffichageConsole implements InterfaceAffichage
{
	
	@Override
	public void afficherGrille(Grille g)
	{		
		System.out.println(g.toString());	
	}
	
	@Override
	public void afficherMsg(String chaine)
	{
		System.out.println(chaine);
	}
	
	@Override
	public void messageGameOver(int compteur)
	{
		System.out.println("GAME OVER");
		System.out.println("Dommage,il vous restait " + (compteur + 1) + " case(s) à découvrir");
		System.out.println("---------------------------------------------");
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
}
