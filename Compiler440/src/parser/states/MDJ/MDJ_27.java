package parser.states.MDJ;

import parser.states.ParserException;
import parser.states.State;

public class MDJ_27 extends State
{
	/**
	 * Method used to shift on  right bracket '}' and change to state 28
	 * @author Shannon Jones
	 */
	@Override
	public void shiftRightBrace() throws ParserException
	{
		changeToState(new MDJ_28());
	}
}