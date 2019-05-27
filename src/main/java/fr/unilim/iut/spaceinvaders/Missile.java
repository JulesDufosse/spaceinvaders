package fr.unilim.iut.spaceinvaders;

public class Missile extends Sprite {

public Missile(Dimension dimensionMissile, Position positionOrigineMissile, int vitesseMissile) {
		this.dimension=dimensionMissile;
		this.origine=positionOrigineMissile;
		this.vitesse=vitesseMissile;
	}

public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
		
		int abscisseMilieuVaisseau = this.abscisseLaPlusAGauche() + (this.longueur() / 2);
		int abscisseOrigineMissile = abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);

		int ordonneeeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
		Position positionOrigineMissile = new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);

		return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
	}
}
