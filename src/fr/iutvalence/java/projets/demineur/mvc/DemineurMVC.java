package fr.iutvalence.java.projets.demineur.mvc;

import java.util.Random;

import fr.iutvalence.java.projets.demineur.Cellule;
import fr.iutvalence.java.projets.demineur.Grille;
import fr.iutvalence.java.projets.demineur.exceptions.PositionInvalideException;
import fr.iutvalence.java.projets.demineur.interfaces.InterfaceAffichage;
import fr.iutvalence.java.projets.demineur.interfaces.InterfaceJoueur;

/**
 * Classe permettant de jouer une partie de demineur
 * en utilisant des interfaces pour pouvoir séparer un Demineur
 * de l'affichage et de l'utilisateur (saisie)
 * 
 * @authorLambert Quentin / Chaufournais Loic
 */
public class DemineurMVC
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
		
		/**
		 * 
		 */
		private InterfaceAffichage affichage = new AffichageConsole();
		
		/**
		 * 
		 */
		private InterfaceJoueur saisieClavier = new JoueurClavier();
		
		//-----------------------------------------------------------------------
		// Constructeurs
		//-----------------------------------------------------------------------
		
		/**
		 * Constructeur par défaut d'un démineur
		 * Un démineur est une nouvelle grille de jeu 
		 * Il place les mines aléatoirement dans la grille
		 */
		public DemineurMVC()
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
		public DemineurMVC(int x, int y, int nombresMines)
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
			/////-----------------------------------/////
			/////--------- Variable locale ---------/////
			/////-----------------------------------/////
			int jouer = 1;
			int compteur = ((this.g.getHauteur()*this.g.getLargeur())-this.g.getNbMines());
			/////-----------------------------------/////
			/////------------ Programme ------------/////
			/////-----------------------------------/////
			try
			{
				Thread.sleep(2000);
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
				this.affichage.messageChoixCelulle(this.g, x, y);
				
				// On test si la cellule n'a pas encore été decouverte
				// Si elle ne l'a pas été, on décrémente le compteur
				// et on change sa visibilité
				if (!c.getVisibilite())
				{
					c.setVisibilite(true);
					--compteur;
				}
				
				// On test si on est sur une mine
				if (c.getPresenceMine())
				{
					jouer = 0;
					this.affichage.messageGameOver(compteur);
				}
				else
				{
					this.affichage.messageContinuerAJouer(this.g, x, y, compteur);
								
					// On test si on a gagné ou pas
					if (compteur == 0)
						{
						jouer = 0;
						System.out.println("Bravo, vous avez gagné la partie");
					}
				}
				this.affichage.afficherGrille(this.g);
				try
				{
					Thread.sleep(2000);
				}
				catch (InterruptedException e)
				{
					// ici on peut ignorer l exception
				}		
			}
			// Fin du démineur
			System.out.println("FIN DE LA PARTIE");
		}
		
		/** Méthode permettant à l'utilisateur de jouer une partie de démineur
		 * en choisissant les cellules sur lesquelles il veut "cliquer"
		 * @param dem Partie de demineur MVC
		 * @throws PositionInvalideException  Exception de gestion d'une position invalide
		 */
		public void utilisateurJoue(DemineurMVC dem) throws PositionInvalideException
		{
			/////-----------------------------------/////
			/////--------- Variable locale ---------/////
			/////-----------------------------------/////
			int jouer = 1;
			int compteur = ((this.g.getHauteur()*this.g.getLargeur()-this.g.getNbMines()));
			
			
			/////-----------------------------------/////
			/////------------ Programme ------------/////
			/////-----------------------------------/////
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				// ici on peut ignorer l exception
			}	
			
			while (jouer != 0)
			{
				// Saisie de l'abcisse par l'utilisateur
				System.out.println("veuillez choisir la position de la cellule a decouvrir en entrant " +
						"tous d'abord sa coordonnée x puis par la suite sa coordonnée y");
				
				if ((this.saisieClavier.getCaseADecouvrir().getX() > this.g.getLargeur()) || (this.saisieClavier.getCaseADecouvrir().getX() < 1))
				    throw new PositionInvalideException();
				if ((this.saisieClavier.getCaseADecouvrir().getY() > this.g.getHauteur()) || (this.saisieClavier.getCaseADecouvrir().getY() < 1))
				    throw new PositionInvalideException();
				
				Cellule c = this.g.getCellule(this.saisieClavier.getCaseADecouvrir().getX()-1, this.saisieClavier.getCaseADecouvrir().getY()-1);
				this.affichage.messageChoixCelulle(this.g, (this.saisieClavier.getCaseADecouvrir().getX()-1), (this.saisieClavier.getCaseADecouvrir().getY()-1));   
				
				
				// On test si la cellule n'a pas encore été decouverte
				// Si elle ne l'a pas été, on décrémente le compteur
				// et on change sa visibilité
				if (!c.getVisibilite()) 
				{
					c.setVisibilite(true);
					--compteur;
				}
				
				// On test si on est sur une mine
				if (c.getPresenceMine())
				{
					jouer = 0;
					this.affichage.messageGameOver(compteur);
				}
				else
				{
					this.affichage.messageContinuerAJouer(this.g, this.saisieClavier.getCaseADecouvrir().getX()-1, this.saisieClavier.getCaseADecouvrir().getY()-1, compteur);
					
					// On test si on a gagné ou pas
					if (compteur == 0)
					{
						jouer = 0;
						System.out.println("Bravo, vous avez gagné la partie");
					}
				}
				this.affichage.afficherGrille(this.g);
				try
				{
					Thread.sleep(2000);
				}
				catch (InterruptedException e)
				{
					// ici on peut ignorer l exception
				}	
			}
			
			// Fin du démineur
			System.out.println("FIN DE LA PARTIE");
		}
	}
