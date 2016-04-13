package parser.states.JMCC;

import parser.states.ParserException;
import parser.states.State;
import tokenizer.TokenTypes;

/**
 * 
 * @author Chris Hersh
 *
 */
public class JMCC_9 extends State {

    @Override
    public void invalidState() throws ParserException
    {
        reduceNumberOfStates(1, TokenTypes.EXP1);
    }
    
    @Override
    public void shiftOP2() throws ParserException
    {
        changeToState(new JMCC_5());
    }
    
    @Override
    public void shiftAnd() throws ParserException
    {
        changeToState(new JMCC_10());
    }
}
