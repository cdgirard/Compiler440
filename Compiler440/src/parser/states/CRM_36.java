package parser.states;

import tokenizer.Token;
import tokenizer.TokenTypes;

public class CRM_36 extends State {
	/**
	 * Changes to state CRM_38
	 * 
	 * @author Chris Kjeldgaard
	 */
	@Override
	public void shiftFORMAL_R() {
		changeToState(new CRM_38());
	}

	/**
	 * Empty String reduce that puts a FORMAL_R token on the stack
	 * 
	 * @author Chris Kjeldgaard
	 */
	@Override
	public void invalidState() {
		currentParser.pushInputStack(new Token(TokenTypes.FORMAL_R.name(),
				TokenTypes.FORMAL_R.toString(), currentParser.peekInputStack()
						.getLineNumber()));
	}
}