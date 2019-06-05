package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite {

	private Direction direction;
	
	public Envahisseur(Dimension dimension, Position origine, int vitesse) {
		super(dimension, origine, vitesse);
		this.direction = Direction.DROITE;
	}
	
	public Direction getDirection() {
		return this.direction;
	}

	public void changerDirection() {
		if (direction == Direction.GAUCHE)
			direction = Direction.DROITE;
		else 
			direction = Direction.GAUCHE;
		
	}

}



