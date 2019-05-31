package fr.unilim.iut.spaceinvaders.moteurjeu;

import fr.unilim.iut.spaceinvaders.moteurjeu.Commande;

public interface Jeu {
	default void evoluer(Commande commmande) {

	}

	default boolean etreFini() {
		return false;

	}
}
