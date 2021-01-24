package bowling.tests;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import bowling.BowlingFactory;
import bowling.BowlingPackage;
import bowling.Game;
import bowling.League;
import bowling.Matchup;
import bowling.Player;

public class CustomTests {
	
	@Test
	public void testMatchupGameRef1() {
		Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
		Game game = BowlingFactory.eINSTANCE.createGame();
		matchup.getGames().add(game);
		assertEquals(matchup, game.getMatchup());
	}
	
	@Test
	public void testMatchupGameRef2() {
		Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
		Game game = BowlingFactory.eINSTANCE.createGame();
		matchup.getGames().add(game);
		assertEquals(matchup, game.eContainer());
	}

	
	@Test
	public void testReflection() {
		EObject eobject = BowlingFactory.eINSTANCE.createPlayer();
		eobject.eSet(BowlingPackage.eINSTANCE.getPlayer_Name(), "Max");
		Player player = (Player) eobject;
		assertEquals("Max", player.getName());
	}
	
	@Test
	public void testReflectiveInformation() {
		League league = BowlingFactory.eINSTANCE.createLeague();
		assertTrue(league.eClass().getEAllReferences().get(0).isMany());
		assertTrue(BowlingPackage.eINSTANCE.getLeague_Players().isMany());
	}
	
	@Test
	public void testValidation() {
		Matchup matchup = BowlingFactory.eINSTANCE.createMatchup();
		matchup.getGames().add(BowlingFactory.eINSTANCE.createGame());
		Diagnostic validate = Diagnostician.INSTANCE.validate(matchup);
		assertEquals(Diagnostic.ERROR, validate.getSeverity());
	}
	
	@Test
	public void testCopy() {
		Player player = BowlingFactory.eINSTANCE.createPlayer();
		player.setName("John");
		Player copy = EcoreUtil.copy(player);
		assertNotSame(player, copy);
		assertEquals(player.getName(), copy.getName());
	}
	
}
