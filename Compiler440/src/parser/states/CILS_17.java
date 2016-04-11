package parser.states;

public class CILS_17 extends State {

	/**
	 * Method used to shift on ( and change to state 13
	 */
	@Override
	public void shiftRightPara() throws ParserException
	{
		changeToState(new CILS_22());
	}
}
