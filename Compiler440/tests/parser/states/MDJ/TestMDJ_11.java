package parser.states.MDJ;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import parser.Parser;
import parser.states.ParserException;
import parser.states.State;
import parser.states.MDJ.MDJ_11;
import parser.states.MDJ.MDJ_12;
import tokenizer.Token;

/**
 * @author Jared Good
 */

public class TestMDJ_11 
{

	/**
	 * prepares the parser from former test
	 */
	@Before
	public void setUp()
	{
		Parser.resetParser();
	}
	
	/**
	 * @author Jared Good
	 * @throws ParserException
	 * Tests that MDJ_11 can properly shift to MDJ_12 when reading a "Void" token
	 */
	@Test
	public void testShiftVoid() throws ParserException
	{
		Parser p = Parser.getInstance();
		State s = new MDJ_11();

		Token token = new Token("Void", "Void", 15);

		p.getInputStack().push(token);

		assertFalse(p.getInputStack().empty());
		assertEquals(p.getInputStack().peek(), token);
		assertTrue(p.getHoldStack().empty());
		assertTrue(p.getStateStack().empty());

		s.shiftVoid();

		assertTrue(p.getInputStack().empty());
		assertFalse(p.getHoldStack().empty());
		assertFalse(p.getStateStack().empty());

		assertEquals(p.getHoldStack().peek(), token);
		assertEquals(p.getStateStack().peek(), s);

		assertTrue(p.getCurrentState() instanceof MDJ_12);
	}
	
}
