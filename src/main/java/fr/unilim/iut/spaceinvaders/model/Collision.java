package fr.unilim.iut.spaceinvaders.model;

public class Collision {
	public boolean detecterCollisionAxeY(Sprite premier, Sprite deuxieme) {
		return detecterCollisionHautContreBas(premier, deuxieme) || detecterCollisionBasContreHaut(premier, deuxieme);
	}

	private boolean detecterCollisionBasContreHaut(Sprite premier, Sprite deuxieme) {
		return premier.ordonneeLaPlusBasse() <= deuxieme.ordonneeLaPlusHaute()
				&& premier.ordonneeLaPlusBasse() >= deuxieme.ordonneeLaPlusBasse();
	}

	private boolean detecterCollisionHautContreBas(Sprite premier, Sprite deuxieme) {
		return premier.ordonneeLaPlusHaute() >= deuxieme.ordonneeLaPlusBasse()
				&& premier.ordonneeLaPlusHaute() <= deuxieme.ordonneeLaPlusBasse();
	}

	public boolean detecterCollisionAxeX(Sprite premier, Sprite deuxieme) {
		return detecterCollisionDroitContreGauche(premier, deuxieme)
				|| detecterCollisionGaucheContreDroite(premier, deuxieme);

	}

	private boolean detecterCollisionGaucheContreDroite(Sprite premier, Sprite deuxieme) {
		return premier.abscisseLaPlusAGauche() <= deuxieme.abscisseLaPlusADroite()
				&& premier.abscisseLaPlusAGauche() >= deuxieme.abscisseLaPlusAGauche();
	}

	private boolean detecterCollisionDroitContreGauche(Sprite premier, Sprite deuxieme) {
		return premier.abscisseLaPlusADroite() >= deuxieme.abscisseLaPlusAGauche()
				&& premier.abscisseLaPlusADroite() <= deuxieme.abscisseLaPlusAGauche();
	}

	public boolean detecterCollision(Sprite premier, Sprite deuxieme) {
		return (detecterCollisionAxeX(premier, deuxieme) && detecterCollisionAxeY(premier, deuxieme))
				|| (detecterCollisionAxeX(deuxieme, premier) && detecterCollisionAxeY(deuxieme, premier));
	}

}
