package fr.iutvalence.java.projets.demineur;

import java.util.Random;
import java.util.Scanner;

/**
 * Classe de gestion d'une partie de demineur
 * classe qui reprendra les autres classes pour pouvoir joue
 * 
 * stardust00 <setsuna00ql@gmail.com>
 * @Author Lambert & Chaufournais
 */

public class Demineur
{
	//-----------------------------------------------------------------------
	// Attributs
	//-----------------------------------------------------------------------		
	/**
	 * Booléen spécifiant si le joueur a perdu
	 */
	public boolean aPerdu;
	
	/**
	 * Définition d'une grille ayant pour nom g
	 */
	private Grille g;

	//-----------------------------------------------------------------------
	// Constructeurs
	//-----------------------------------------------------------------------
	
	/**
	 * Constructeur par défaut d'un démineur
	 * Un démineur est une nouvelle grille de jeu 
	 * Il place les mines aléatoirement dans la grille
	 */
	public Demineur()
	{
		this.g = new Grille();
		this.aPerdu = false;

		//--------------------------------------
		//--- Géneration aléatoire des mines ---
		//--------------------------------------
		
		Random mineAleatoire = new Random();
		int mineGenerer = 0;
		
		while (mineGenerer < this.g.getNbMines() + 1)
		{
			Cellule c = this.g.getCellule(mineAleatoire.nextInt(this.g.getLargeur()), mineAleatoire.nextInt(this.g.getHauteur())); 
			c.setPresenceMine(true);
			mineGenerer++;
		}
		//-----------------------------------------
		//--- Algorithme de recherche des mines ---
		//-----------------------------------------
		for (int i = 0; i < this.g.getLargeur(); i++)
		{	
			for (int j = 0; j < this.g.getHauteur(); j++)
			{
				int nbMines = 0;
				if (j-1 >= 0)
				{
					if (this.g.getCellule(i, j-1).getPresenceMine()) 
						nbMines++;
				}
				if (i-1 >=0)
				{
					if (this.g.getCellule(i-1, j).getPresenceMine()) 
						nbMines++;
				}
				if (j+1 < 10)
				{
					if (this.g.getCellule(i, j+1).getPresenceMine()) 
						nbMines++;
				}
				if (i+1 < 10)
				{
					if (this.g.getCellule(i+1, j).getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >= 0)&&(j-1 >= 0))
				{
					if (this.g.getCellule(i-1, j-1).getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < 10)&&(j+1 < 10))
				{
					if (this.g.getCellule(i+1, j+1).getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < 10)&&(j-1 >=0))
				{
					if (this.g.getCellule(i+1, j-1).getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >=0)&&(j+1 < 10))
				{
					if (this.g.getCellule(i-1, j+1).getPresenceMine()) 
						nbMines++;
				}
				this.g.getCellule(i, j).setNbMinesVoisines(nbMines);
			}
		}
		System.out.println("Bienvenue sur le démineur");
		System.out.println(this.g.toString());
	}	
	

	/**
	 * Constructeur personnalisé d'un démineur
	 * Un démineur est une nouvelle zone de jeu
	 * Le constructeur génère aléatoirement un nombre nombresMines
	 * de mines dans la grille x par y
	 * @param x largeur de la grille
	 * @param y hauteur de la grille
	 * @param nombresMines nombres de mines dans la grille de jeu
	 */
	public Demineur(int x, int y, int nombresMines)
	{
		this.g = new Grille(x,y,nombresMines);
		this.aPerdu = false;

		//--------------------------------------
		//--- Géneration aléatoire des mines ---
		//--------------------------------------
		
		Random mineAleatoire = new Random();
		int mineGenerer = 0;
		
		while (mineGenerer < this.g.getNbMines())
		{
			Cellule c = this.g.getCellule(mineAleatoire.nextInt(this.g.getLargeur()), mineAleatoire.nextInt(this.g.getHauteur())); 
			c.setPresenceMine(true);
			mineGenerer++;
		}
		//-----------------------------------------
		//--- Algorithme de recherche des mines ---
		//-----------------------------------------
		for (int i = 0; i < this.g.getLargeur(); i++)
		{	
			for (int j = 0; j < this.g.getHauteur(); j++)
			{
				int nbMines = 0;
				if (j-1 >= 0)
				{
					if (this.g.getCellule(i, j-1).getPresenceMine()) 
						nbMines++;
				}
				if (i-1 >=0)
				{
					if (this.g.getCellule(i-1, j).getPresenceMine()) 
						nbMines++;
				}
				if (j+1 < this.g.getHauteur())
				{
					if (this.g.getCellule(i, j+1).getPresenceMine()) 
						nbMines++;
				}
				if (i+1 < this.g.getLargeur())
				{
					if (this.g.getCellule(i+1, j).getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >= 0)&&(j-1 >= 0))
				{
					if (this.g.getCellule(i-1, j-1).getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < this.g.getLargeur())&&(j+1 < this.g.getHauteur()))
				{
					if (this.g.getCellule(i+1, j+1).getPresenceMine()) 
						nbMines++;
				}
				if ((i+1 < this.g.getLargeur())&&(j-1 >=0))
				{
					if (this.g.getCellule(i+1, j-1).getPresenceMine()) 
						nbMines++;
				}
				if ((i-1 >=0)&&(j+1 < this.g.getHauteur()))
				{
					if (this.g.getCellule(i-1, j+1).getPresenceMine()) 
						nbMines++;
				}
				this.g.getCellule(i, j).setNbMinesVoisines(nbMines);
			}
		}
		System.out.println("Bienvenue sur le démineur");
		System.out.println(this.g.toString());
	}	
	
	
	//-----------------------------------------------------------------------
	// Méthodes
	//-----------------------------------------------------------------------
	
	/**
	 * Méthode permettant de rendre indépendant le démineur
	 * Le démineur joue une partie de démineur et peut gagner ou perdre
	 */
	public void jouer()
	{
		int jouer = 1;
		int compteur = ((this.g.getHauteur()*this.g.getLargeur())-this.g.getNbMines());
		
		// On fait une pause
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// ici on peut ignorer l exception
		}	
		
		// Tantque jouer est différent de 0, on continue à jouer
		while (jouer != 0)
		{
			Random mineAleatoire = new Random();
			int x = mineAleatoire.nextInt(this.g.getLargeur());
			int y = mineAleatoire.nextInt(this.g.getHauteur());
			Cellule c = this.g.getCellule(x,y);
			
			// On test si la cellule n'a pas encore été decouverte
			// Si elle ne l'a pas été, on décrémente le compteur
			// et on change sa visibilité
			if (!c.getVisibilite())
			{
				c.setVisibilite(true);
				--compteur;
			}
			
			System.out.println("Cellule choisie : " + (x + 1) + " ; " + (y + 1));
			System.out.println("// Nombres de cases vides restantes: " + compteur + " //");
			
			// On vérifie que nous somme pas tombé sur une mine
			if (c.getPresenceMine())
			{
				jouer = 0;
				System.out.println("PERDU");
				System.out.println("Dommage, il vous restait "+(compteur+1)+"case(s) non découverte");
			}
			
			// On actualise l'affichage de la grille
			System.out.println(this.g.toString());
			
			// On test si on a gagné ou pas
			if (compteur == 0)
			{
				jouer = 0;
				System.out.println("GAGNER");
			}
			
			// On fait une pause
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				// ici on peut ignorer l exception
			}		
		}
		
		// Fin du démineur
		System.out.println("Fin du démineur");
	}
	
	
	/**
	 * Méthode permettant à l'utilisateur de jouer une partie de démineur
	 * en choisissant les cellules sur lesquelles il veut "cliquer"
	 */
	public void utilisateurJoue()
	{
		int jouer = 1;
		int compteur = ((this.g.getHauteur()*this.g.getLargeur())-this.g.getNbMines());
		
		// On fait une pause
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// ici on peut ignorer l exception
		}	
		
		// Tantque jouer est différent de 0, on joue
		while (jouer != 0)
		{
			// On créer un nouveau scanner permettant de récupérer ce que tape l'utilisateur
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Veuillez saisir l'abscisse de la cellule :");
			int choixX = sc.nextInt();
			while (choixX > this.g.getLargeur())
			{
				System.out.println("Valeur non valide - Dépassement de la largeur de la grille");
				System.out.println("Veuillez saisir l'abscisse de la cellule :");
				choixX = sc.nextInt();
			}
			
			System.out.println("Veuillez saisir l'ordonnée de la cellule :");
			int choixY = sc.nextInt();
			while (choixY > this.g.getHauteur())
			{
				System.out.println("Valeur non valide - Dépassement de la hauteur de la grille");
				System.out.println("Veuillez saisir l'ordonnée de la cellule :");
				choixY = sc.nextInt();
			}
			
			System.out.println("Vous avez choisi(e) la cellule [" + choixX + "," + choixY + "]");
			
			Cellule c = this.g.getCellule(choixX-1, choixY-1);
			
			// On test si la cellule n'a pas encore été decouverte
			// Si elle ne l'a pas été, on décrémente le compteur
			// et on change sa visibilité
			if (!c.getVisibilite())
			{
				c.setVisibilite(true);
				--compteur;
			}
			
			System.out.println("Cellule choisie : " + choixX + " ; " + choixY);
			System.out.println("// Nombres de cases vides restantes: " + compteur + " //");
			
			// On vérifie que nous somme pas tombé sur une mine
			if (c.getPresenceMine())
			{
				jouer = 0;
				System.out.println("PERDU");
				System.out.println("Dommage, il vous restait "+(compteur+1)+"case(s) non découverte");
			}
			
			// On actualise l'affichage de la grille
			System.out.println(this.g.toString());
			
			// On test si on a gagné ou pas
			if (compteur == 0)
			{
				jouer = 0;
				System.out.println("GAGNER");
			}
			
			// On fait une pause
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				// ici on peut ignorer l exception
			}	
		}
		
		// Fin du démineur
		System.out.println("Fin du démineur");
	}
	
	/**
	 * Défini la partie comme étant perdue
	 * @return false
	 */
	public boolean perdu()
	{
		return this.aPerdu = true;
	}
		
	/**
	 * Défini la partie comme n'étant pas perdu
	 * @return true
	 */
	public boolean pasPerdu()
	{
		return this.aPerdu = false;
	}

 }
	
