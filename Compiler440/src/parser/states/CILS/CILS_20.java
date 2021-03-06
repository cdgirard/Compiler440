package parser.states.CILS;

import parser.states.ParserException;
import parser.states.State;

/**
 * A parser state for CILS_20.
 * @author Chad Nunemaker
 */
public class CILS_20 extends State
{
	/**
	 * Method used to shift on assignment and change to state 25.
	 */
	@Override
	public void shiftAssignment() throws ParserException
	{
		changeToState(new CILS_25());
	}
}
