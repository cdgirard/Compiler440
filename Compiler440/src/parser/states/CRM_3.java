package parser.states;

import tokenizer.TokenTypes;

public class CRM_3 extends State
{
	/**
	 * reduces to the CRM_1 state and generates the token VAR_DECL_L
	 * @author Chris Kjeldgaard
	 */
	@Override
	protected void invalidState() throws ParserException
	{
		reduceToState(new CRM_1(), TokenTypes.VAR_DECL_L);
	}
}