package intermediate.process;

import tokenizer.Token;

public class ProcessEXP_R {
	public static void processPass1(Token subject) {
		// TODO Auto-generated method stub
		
	}

	public static void processPass2(Token subject) {
		// TODO Auto-generated method stub
		
	}

	public static void processPass3(Token subject) 
	{
		Token child = subject.getChildren().get(1);
		child.Pass3(child.getChildren());
	}
}
