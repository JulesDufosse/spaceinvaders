package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite {
 
	public Envahisseur(Dimension dimensionEnvahisseur, Position positionOrigineEnvahisseur, int vitesseEnvahisseur) {
		this.dimension=dimensionEnvahisseur;
		this.origine=positionOrigineEnvahisseur;
		this.vitesse=vitesseEnvahisseur;
	}
}
