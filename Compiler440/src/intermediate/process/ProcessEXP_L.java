package intermediate.process;

import tokenizer.Token;
import tokenizer.TokenTypes;

/**
 * @author Curtis Rabe, Jared Good, Mike Zimmerman
 * 
 * The Process class for EXP_L (3 passes included)
 *
 */
public class ProcessEXP_L
{
	/**
	 * Using DFS, checks to make sure that the current token has children, then
	 * processes the first child of EXP_L (which is EXP1), Then processes the second child
	 * (of 2 total children) which is EXP_R. Nothing is added to the symboltable at this step,
	 * because the program would not yet have come across an addable item.
	 * 
	 * @param subject the incoming token
	 * 
	 */
	public static void processPass1(Token subject)
	{
		if(subject.getChildren() != null)
		{
			ProcessEXP1.processPass1(subject.getChildren().get(0));
			ProcessEXP_R.processPass1(subject.getChildren().get(1));
		}
		
	}

	/**
	 * the second pass for processing EXP_L
	 * @param subject
	 */
	public static void processPass2(Token subject) {
		if(subject.getChildren() != null)
		{
			ProcessEXP1.processPass2(subject.getChildren().get(0));
			ProcessEXP_R.processPass2(subject.getChildren().get(1));
		}
	}

	
	/**
	 * Generates intermediate code for EXP_L
	 * 
	 * @author Jared Good
	 * @param subject Token to be processed
	 */
	public static void processPass3(Token subject) 
	{
		// Generates the code for the rule:
		// EXP_L -> EXP1, EXP_R
		if(subject.getChildren().get(0).getTokenName() == TokenTypes.EXP1.name())
		{
			// EXP1 token
			Token child = subject.getChildren().get(0);
			
			// Processes EXP1 to generate its intermediate code
			child.Pass3(child.getChildren());
			
			// EXP_R token
			child = subject.getChildren().get(1);
			
			// Processes EXP_R to generate its intermediate code
			child.Pass3(child.getChildren());
		}		
	}
}