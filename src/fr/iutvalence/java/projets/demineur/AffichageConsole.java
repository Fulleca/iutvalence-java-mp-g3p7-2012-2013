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
	public void msgBienvenue()
	{
		System.out.println("-------------------------------");
		System.out.println("-- Bienvenue sur le démineur --");
		System.out.println("-------------------------------");
	}
	
	@Override
	public void afficherMenu()
	{
		System.out.println("Veuillez choisir votre mode de jeu (en entrant le numéro correspondant au mode) :");
		System.out.println("1 - Grille de jeu par défaut. Taille de 10x10 avec 10 mines ");
		System.out.println("2 - Grille de jeu personnalisé. Vous devez spécifier la taille et le nombres de mines de la zone de jeu");
		System.out.println("Votre choix :");
	}
	
	@Override
	public void messageChoixLargeur()
	{
		System.out.println("Choississez la largeur de la grille de jeu :");
	}
	
	@Override
	public void messageChoixHauteur()
	{
		System.out.println("Choississez la hauteur de la grille de jeu :");
	}
	
	@Override
	public void messageChoixNombreMines()
	{
		System.out.println("Choississez le nombres de mines quie seront dans la grille :");
	}
	
	@Override
	public void messageErreurChoixMenu()
	{
		System.out.println("Erreur mode - Le mode choisie n'existe pas !");
		System.out.println("Votre nouveau choix :");
	}
	
	@Override
	public void messageGameOver(int compteur)
	{
		System.out.println("GAME OVER");
		System.out.println("Dommage,il vous restait " + (compteur + 1) + " case(s) à découvrir");
		System.out.println("---------------------------------------------");
	}
	
	@Override
	public void messageWinner()
	{
		System.out.println("GAGNER");
	}
	
	@Override
	public void messageFinPartie()
	{
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
	public void messageChoixAbcisse()
	{
		System.out.println("Veuillez saisir l'abscisse de la cellule :");
	}
	
	@Override
	public void messageChoixOrdonnée()
	{
		System.out.println("Veuillez saisir l'ordonnée de la cellule :");
	}
	
	@Override
	public void messageAbscisseInvalide()
	{
		System.out.println("----------------------------------------------------------");
		System.out.println("Valeur non valide - Dépassement de la largeur de la grille");
		System.out.println("Veuillez re-saisir l'abscisse de la cellule :");
	}
	
	@Override
	public void messageOrdonneeInvalide()
	{
		System.out.println("----------------------------------------------------------");
		System.out.println("Valeur non valide - Dépassement de la hauteur de la grille");
		System.out.println("Veuillez re-saisir l'ordonnée de la cellule :");
	}
}
