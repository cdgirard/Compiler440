package parser.states;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import parser.Parser;
import tokenizer.Token;

/**
 * Test class to check the methods of the CRM_2 class.
 * @author Chris Kjeldgaard
 *
 */
public class TestCRM_2 
{
    @Before
    public void setUp()
    {
        Parser.resetParser();
    }
    
    /**
     * @author Chris Kjeldgaard
     * @throws ParserException
     */
    @Test
	public void testShiftVAR_DECL() throws ParserException
	{
	    Parser p = Parser.getInstance();
	    State s = new CRM_2();
	        
	    Token token = new Token("VAR_DECL", "VAR_DECL", 25);
	    
	    p.getInputStack().push(token);
	    
	    assertFalse(p.getInputStack().empty());
	    assertEquals(p.getInputStack().peek(), token);
	    assertTrue(p.getHoldStack().empty());
	    assertTrue(p.getStateStack().empty());
	    
	    s.shiftVAR_DECL();
	    
	    assertTrue(p.getInputStack().empty());
	    assertFalse(p.getHoldStack().empty());
	    assertFalse(p.getStateStack().empty());
	    
	    assertEquals(p.getHoldStack().peek(), token);
	    assertEquals(p.getStateStack().peek(), s);
	    
	    assertTrue(p.getCurrentState() instanceof CRM_3);
	}
}