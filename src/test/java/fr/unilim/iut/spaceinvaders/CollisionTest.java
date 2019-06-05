package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders.model.Collision;
import fr.unilim.iut.spaceinvaders.model.Dimension;
import fr.unilim.iut.spaceinvaders.model.Envahisseur;
import fr.unilim.iut.spaceinvaders.model.Position;
import fr.unilim.iut.spaceinvaders.model.Sprite;
import fr.unilim.iut.spaceinvaders.model.Vaisseau;

public class CollisionTest {
	private Collision detecteur;
	private Sprite premier;
	private Sprite second;
	

	@Before
	public void initialisation() {
		detecteur = new Collision();
	}
	
	@Test
	public void test_collisionAxeYEntre2Sprite() {
		premier = new Vaisseau(new Dimension(2,2), new Position(2,2), 1);
		second = new Envahisseur(new Dimension(2,2), new Position(7,3), 1);
		
		assertTrue(detecteur.detecterCollisionAxeY(premier, second));
	}

	@Test
	public void test_collisionAxeXEntre2Sprite() {
		premier = new Vaisseau(new Dimension(2,2), new Position(3,10), 1);
		second = new Envahisseur(new Dimension(2,2), new Position(4,1), 1);
		
		assertTrue(detecteur.detecterCollisionAxeX(premier, second));
	}
	
	@Test
	public void test_collisionAxeXetAxeYEntre2Sprite() {
		premier = new Vaisseau(new Dimension(2,2), new Position(1,1), 1);
		second = new Envahisseur(new Dimension(2,2), new Position(2,2), 1);
		
		assertTrue(detecteur.detecterCollision(premier, second));
	}

}
