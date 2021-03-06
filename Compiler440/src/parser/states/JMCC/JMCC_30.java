package parser.states.JMCC;

import parser.states.ParserException;
import parser.states.State;
import parser.states.JCTM.JCTM_1;
import parser.states.JCTM.JCTM_15;
import parser.states.JCTM.JCTM_16;
import parser.states.JCTM.JCTM_17;
import parser.states.JCTM.JCTM_18;
import parser.states.JCTM.JCTM_19;
import parser.states.JCTM.JCTM_27;
import parser.states.JCTM.JCTM_29;

/**
 * JMCC_30.java
 * EXP4 State
 * @author Daniel Breitigan
 *
 */
public class JMCC_30 extends State
{
  //Shift EXP4
    @Override
    public void shiftEXP4() throws ParserException 
    {
        changeToState(new JMCC_19());
    }
    
  //Shift EXP5
    @Override
    public void shiftEXP5() throws ParserException
    {
        changeToState(new JMCC_20());
    }
    
  //Shift EXP6
    @Override
    public void shiftEXP6() throws ParserException
    {
        changeToState(new JMCC_32());
    }
    
  //Shift EXP7
    @Override
    public void shiftEXP7() throws ParserException
    {
        changeToState(new JMCC_29());
    }
    
  //Shift EXP ID
    @Override
    public void shiftId() throws ParserException
    {
        changeToState(new JCTM_1());
    }
    
  //Shift INTEGER_LITERAL
    @Override
    public void shiftIntegerLiteral() throws ParserException
    {
        changeToState(new JCTM_18());
    }
    
  //Shift True
    @Override
    public void shiftTrue() throws ParserException
    {
        changeToState(new JCTM_15());
    }
    
  //Shift False
    @Override
    public void shiftFalse() throws ParserException
    {
        changeToState(new JCTM_16());
    }
    
  //Shift This
    @Override
    public void shiftThis() throws ParserException
    {
        changeToState(new JCTM_17());
    }
    
  //Shift New
    @Override
    public void shiftNew() throws ParserException
    {
        changeToState(new JCTM_19());
    }
    
  //Shift Exclamation
    @Override
    public void shiftExclamation() throws ParserException
    {
        changeToState(new JCTM_27());
    }
    
  //Shift Left Parenthesis
    @Override
    public void shiftLeftPara() throws ParserException
    {
        changeToState(new JCTM_29());
    }
}
