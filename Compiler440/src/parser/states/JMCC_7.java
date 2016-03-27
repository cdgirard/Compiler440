package parser.states;


import parser.states.JCTM_1;
import parser.states.JCTM_16;
import parser.states.JCTM_17;
import parser.states.JCTM_18;
import parser.states.JCTM_27;
import parser.states.JCTM_29;
import parser.states.JMCC_33;
import parser.states.State;

/**
 * @author Jessica Schlesiger, Raistlin Hess, and Shannon Jones
 * This state is: EXP4 -> EXP4 op4 ⚫ EXP5
 * 
 */
public class JMCC_7 extends State
{
	@Override
	public void shiftThis()
	{
		JCTM_17 st = new JCTM_17();
		changeToState(st);
	}
	
	@Override
	public void shiftLeftPara()
	{
		JCTM_29 st = new JCTM_29();
		changeToState(st);
	}
	
	@Override
	public void shiftEXP5()
	{
		JMCC_33 st = new JMCC_33();
		changeToState(st);
	}
	
	/***** shifts; id, false, !, inter_literal ****/
	
	@Override
	public void shiftIntegerLiteral()
	{
		changeToState(new JCTM_18());
	}
	
	
	@Override
	public void shiftFalse()
	{
		changeToState(new JCTM_16());
	}
	
	@Override
	public void shiftId()
	{
		changeToState(new JCTM_1());
	}
	
	@Override
	public void shiftExclamation()
	{
		changeToState(new JCTM_27());
	}
	
	/**
	 * @author Jessica Schlesiger
	 */
	@Override
	public void shiftEXP6()
	{
		changeToState(new JMCC_32());
	}
	/**
	 * @author Jessica Schlesiger
	 */
	@Override
	public void shiftEXP7()
	{
		changeToState(new JMCC_29());
	}
	/**
	 * @author Jessica Schlesiger
	 */
	@Override
	public void shiftTrue()
	{
		changeToState(new JCTM_15());
	}
	/**
	 * @author Jessica Schlesiger
	 */
	@Override
	public void shiftNew()
	{
		changeToState(new JCTM_19());
	}
	
}