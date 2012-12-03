package fr.iutvalence.java.projets.demineur.interfaces;

import java.util.Scanner;

import fr.iutvalence.java.projets.demineur.Cellule;
import fr.iutvalence.java.projets.demineur.Position;

public class JoueurClavier implements InterfaceJoueur
{

	@Override
	public Position getCaseADecouvrir()
	{
		Scanner sc = new Scanner(System.in);
		int choixX = sc.nextInt();
		int choixY = sc.nextInt();
		return null;
	}

	

}
