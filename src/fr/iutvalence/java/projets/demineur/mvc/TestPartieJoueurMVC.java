package fr.iutvalence.java.projets.demineur.mvc;

import fr.iutvalence.java.projets.demineur.exceptions.MenuInvalideException;
import fr.iutvalence.java.projets.demineur.exceptions.PositionInvalideException;
import fr.iutvalence.java.projets.demineur.interfaces.InterfaceAffichage;
import fr.iutvalence.java.projets.demineur.interfaces.InterfaceConfigDemineur;
import fr.iutvalence.java.projets.demineur.interfaces.InterfaceJoueur;

/**
 * Classe permettat de tester une partie de demineurMVC
 * 
 * @author Lambert Quentin / Chaufournais Loic
 */
public class TestPartieJoueurMVC
{
		/**
		 * Construction d'un objet affichage console via l'interface "InterfaceAffichage"
		 */
		static InterfaceAffichage msgConsole = new AffichageConsole();
		
		/**
		 * Construction d'un objet JoueurClavier via l'interface "InterfaceJoueur"
		 */
		static InterfaceJoueur choixClavier = new JoueurClavier();
		
		/**
		 * Construction d'un objet choixMenu via l'interface "InterfaceConfigDemineur"
		 */
		static InterfaceConfigDemineur choixConfig = new ConfigDemineur();
		
		/**
		 * @param args Argument de la fonction main
		 * @throws MenuInvalideException Exception choix du menu invalide
		 */
		public static void main(String[] args) throws MenuInvalideException
		{
			msgConsole.afficherMsg("Veuillez choisir votre mode de jeu (en entrant le numéro correspondant au mode) :");
			msgConsole.afficherMsg("1 - Grille de jeu par défaut. Taille de 10x10 avec 10 mines ");
			msgConsole.afficherMsg("2 - Grille de jeu personnalisé. Vous devez spécifier la taille et le nombres de mines de la zone de jeu");
			msgConsole.afficherMsg("Votre choix :");
			msgConsole.afficherMsg("-------------------------------------------------------------------------");
			
			if (choixConfig.getChoixConfigGrille() == 1) 
			{
				DemineurMVC d = new DemineurMVC();
				try {
				    d.utilisateurJoue(d);
				} catch (PositionInvalideException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
			}
			else if (choixConfig.getChoixConfigGrille() == 2)
			{
				msgConsole.afficherMsg("Veuillez choisir la largeur de la grille");
				choixConfig.getChoixConfigGrille();
				msgConsole.afficherMsg("Veuillez choisir la hauteur de la grille");
				choixConfig.getChoixConfigGrille();
				msgConsole.afficherMsg("Veuillez choisir le nombre de mines de la grille");
				choixConfig.getChoixConfigGrille();
				DemineurMVC d = new DemineurMVC(20, 20, 10);	// FIXME  A modifier : pas acces
				try {
				    d.utilisateurJoue(d);
				} catch (PositionInvalideException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
			}
			else throw new MenuInvalideException();

		}
	}
