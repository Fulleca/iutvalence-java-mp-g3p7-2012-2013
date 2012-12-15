package fr.iutvalence.java.projets.demineur.mvc;

import java.util.Scanner;

import fr.iutvalence.java.projets.demineur.interfaces.InterfaceConfigDemineur;

/**
 * Classe permettant de configurer une partie de démineur
 * 
 * @author Lambert Quentin / Chaufournais Loic
 */
public class ConfigDemineur implements InterfaceConfigDemineur
{
	
	/**
	 * Entier representant le type de démineur de l'utilisateur
	 */
	private int choixConfig;
	
	@Override
	public int getChoixConfigGrille()
	{
		Scanner sc = new Scanner(System.in);
		this.choixConfig = sc.nextInt();
		return this.choixConfig;
	}
	

	@Override
	public int getChoixConfig()
	{
		return this.choixConfig;
	}

	@Override
	public void setChoixConfig(int choixConfig)
	{
		this.choixConfig = choixConfig;
	}

}
