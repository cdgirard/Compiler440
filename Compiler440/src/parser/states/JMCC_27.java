package parser.states;

/**
 * 
 * @author Ian Keefer, Chris Hersh
 *
 */
public class JMCC_27 extends State
{
    @Override
    public void shiftEXP7() throws ParserException
    {
        changeToState(new JMCC_28());
    }
    
    @Override
    public void shiftIntegerLiteral() throws ParserException
    {
        changeToState(new JCTM_18());
    }
    
    @Override
	public void shiftTrue()
	{
	    changeToState(new JCTM_15());
	}
    
    @Override
	public void shiftFalse()
	{
	    changeToState(new JCTM_16());
	}

    @Override
	public void shiftThis()
	{
	    changeToState(new JCTM_17());
	}
	
    @Override
	public void shiftId()
	{
	    changeToState(new JCTM_1());
	}
}
