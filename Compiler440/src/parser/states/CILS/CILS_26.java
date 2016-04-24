package parser.states.CILS;

import parser.states.ParserException;
import parser.states.State;

/**
 * @author Chad Nunemaker
 */
public class CILS_26 extends State
{
	/**
	 * Method used to shift on SemiColon and change to state 27.
	 */
	@Override
	public void shiftSemiColon() throws ParserException
	{
		changeToState(new CILS_27());
	}
}
