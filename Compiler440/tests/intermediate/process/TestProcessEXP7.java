package intermediate.process;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import symboltable.Class;
import symboltable.VariableType;
import symboltable.method.impl.PublicMethod;
import tokenizer.Token;
import tokenizer.TokenTypes;

/**
 * 
 * @author Chris Hersh
 *
 */
public class TestProcessEXP7 
{
	
	/**
	 * id.length
	 */
	@Test
	public void testProcessPass1Length()
	{
		Token t0 = new Token(TokenTypes.Id.name(), 1, null);
		Token t1 = new Token(TokenTypes.Length.name(), 1, null);
		t0.setVisited();
		t1.setVisited();
		t1.setType(TokenTypes.Length.name());

		ArrayList<Token> tokens = new ArrayList<Token>();
		tokens.add(t0);
		tokens.add(t1);

		Token t2 = new Token(TokenTypes.Boolean.name(), 1, tokens);
		Class c1 = new Class("ClassName", null, null);
		PublicMethod pm = new PublicMethod("MethodName", null, VariableType.BOOLEAN, null);
		t2.setParentMethod(pm);
		t2.setParentClass(c1);
		
		assertFalse(t2.isVisited());
		
		ProcessEXP7.processPass1(t2);
		assertTrue(t2.isVisited());
		assertEquals(t2.getType(), t2.getChildren().get(0).getType());
		assertEquals(t2.getParentClass(), t2.getChildren().get(0).getParentClass());
		assertEquals(t2.getParentMethod(), t2.getChildren().get(0).getParentMethod());
		assertEquals(t2.getParentClass(), t2.getChildren().get(1).getParentClass());
		assertEquals(t2.getParentMethod(), t2.getChildren().get(1).getParentMethod());
	}
	
	/**
	 * id.id[EXP_L]
	 */
	@Test
	public void testProcessPass1IdIdLBraceEXP1RBrace()
	{
		Token t0 = new Token(TokenTypes.Id.name(), 1, null);
		Token t1 = new Token(TokenTypes.Id.name(), 1, null);
		Token t2 = new Token(TokenTypes.LBrace.name(), 1, null);
		Token t3 = new Token(TokenTypes.EXP_L.name(), 1, null);
		Token t4 = new Token(TokenTypes.RBrace.name(), 1, null);
		t0.setVisited();
		t1.setVisited();
		t2.setVisited();
		t3.setVisited();
		t4.setVisited();
		t3.setType(TokenTypes.Boolean.name());

		ArrayList<Token> tokens = new ArrayList<Token>();
		tokens.add(t0);
		tokens.add(t1);
		tokens.add(t2);
		tokens.add(t3);
		tokens.add(t4);

		Token t5 = new Token(TokenTypes.Boolean.name(), 1, tokens);
		Class c1 = new Class("ClassName", null, null);
		PublicMethod pm = new PublicMethod("MethodName", null, VariableType.BOOLEAN, null);
		t5.setParentMethod(pm);
		t5.setParentClass(c1);
		
		assertFalse(t5.isVisited());
		ProcessEXP7.processPass1(t5);
		assertTrue(t5.isVisited());
		assertEquals(t5.getType(), t5.getChildren().get(4).getType());
		assertEquals(t5.getParentClass(), t5.getChildren().get(0).getParentClass());
		assertEquals(t5.getParentMethod(), t5.getChildren().get(0).getParentMethod());
		assertEquals(t5.getParentClass(), t5.getChildren().get(1).getParentClass());
		assertEquals(t5.getParentMethod(), t5.getChildren().get(1).getParentMethod());
		assertEquals(t5.getParentClass(), t5.getChildren().get(2).getParentClass());
		assertEquals(t5.getParentMethod(), t5.getChildren().get(2).getParentMethod());
		assertEquals(t5.getParentClass(), t5.getChildren().get(3).getParentClass());
		assertEquals(t5.getParentMethod(), t5.getChildren().get(3).getParentMethod());
		assertEquals(t5.getParentClass(), t5.getChildren().get(4).getParentClass());
		assertEquals(t5.getParentMethod(), t5.getChildren().get(4).getParentMethod());
	
	}
	
	/**
	 * id[EXP1]
	 */
	@Test
	public void testProcessPass1IdLBraceEXP1RBrace()
	{
		Token t1 = new Token(TokenTypes.Id.name(), 1, null);
		Token t2 = new Token(TokenTypes.LBrace.name(), 1, null);
		Token t3 = new Token(TokenTypes.EXP_L.name(), 1, null);
		Token t4 = new Token(TokenTypes.RBrace.name(), 1, null);
		t1.setVisited();
		t2.setVisited();
		t3.setVisited();
		t4.setVisited();
		t3.setType(TokenTypes.Boolean.name());

		ArrayList<Token> tokens = new ArrayList<Token>();
		tokens.add(t1);
		tokens.add(t2);
		tokens.add(t3);
		tokens.add(t4);

		Token t5 = new Token(TokenTypes.Boolean.name(), 1, tokens);
		Class c1 = new Class("ClassName", null, null);
		PublicMethod pm = new PublicMethod("MethodName", null, VariableType.BOOLEAN, null);
		t5.setParentMethod(pm);
		t5.setParentClass(c1);
		
		assertFalse(t5.isVisited());
		ProcessEXP7.processPass1(t5);
		assertTrue(t5.isVisited());
		assertEquals(t5.getType(), t5.getChildren().get(3).getType());
		assertEquals(t5.getParentClass(), t5.getChildren().get(0).getParentClass());
		assertEquals(t5.getParentMethod(), t5.getChildren().get(0).getParentMethod());
		assertEquals(t5.getParentClass(), t5.getChildren().get(1).getParentClass());
		assertEquals(t5.getParentMethod(), t5.getChildren().get(1).getParentMethod());
		assertEquals(t5.getParentClass(), t5.getChildren().get(2).getParentClass());
		assertEquals(t5.getParentMethod(), t5.getChildren().get(2).getParentMethod());
		assertEquals(t5.getParentClass(), t5.getChildren().get(3).getParentClass());
		assertEquals(t5.getParentMethod(), t5.getChildren().get(3).getParentMethod());
	}
	
	/**
     * Makes sure EXP7 -> id works
     */
    @Test
    public void testProcessPass1Id()
    {
        Token t0 = new Token("str", TokenTypes.Id.name(), 1);

        t0.setVisited();

        ArrayList<Token> tokens = new ArrayList<Token>();
        tokens.add(t0);

        Token t1 = new Token(TokenTypes.EXP7.name(), 1, tokens);
        Class c1 = new Class("ClassName", null, null);
        PublicMethod pm = new PublicMethod("MethodName", null, VariableType.BOOLEAN, null);
        t1.setParentMethod(pm);
        t1.setParentClass(c1);
        
        assertFalse(t1.isVisited());
        ProcessEXP7.processPass1(t1);
        assertTrue(t1.isVisited());
        assertEquals(t1.getToken(), "str");
    }
    
    /**
     * Makes sure EXP7 -> id works
     */
    @Test
    public void testProcessPass1This()
    {
        Token t0 = new Token("this", TokenTypes.This.name(), 1);

        t0.setVisited();

        ArrayList<Token> tokens = new ArrayList<Token>();
        tokens.add(t0);

        Token t1 = new Token(TokenTypes.EXP7.name(), 1, tokens);
        Class c1 = new Class("ClassName", null, null);
        PublicMethod pm = new PublicMethod("MethodName", null, VariableType.BOOLEAN, null);
        t1.setParentMethod(pm);
        t1.setParentClass(c1);
        
        assertFalse(t1.isVisited());
        ProcessEXP7.processPass1(t1);
        assertTrue(t1.isVisited());
        assertEquals(t1.getType(), "ClassName");
    }
	
    /**
     * Makes sure EXP7 -> new int [ EXP ] works
     */
    @Test
    public void testProcessPass1NewInt()
    {
        Token t0 = new Token("new", TokenTypes.New.name(), 1);
        Token t1 = new Token("int", TokenTypes.Int.name(), 1);
        Token t2 = new Token("[", TokenTypes.LBracket.name(), 1);
        Token t3 = new Token(TokenTypes.EXP1.name(), 1, null);
        Token t4 = new Token("]", TokenTypes.RBracket.name(), 1);

        t0.setVisited();

        ArrayList<Token> tokens = new ArrayList<Token>();
        tokens.add(t0);
        tokens.add(t1);
        tokens.add(t2);
        tokens.add(t3);
        tokens.add(t4);

        Token t5 = new Token(TokenTypes.EXP7.name(), 1, tokens);
        Class c1 = new Class("ClassName", null, null);
        PublicMethod pm = new PublicMethod("MethodName", null, VariableType.BOOLEAN, null);
        t5.setParentMethod(pm);
        t5.setParentClass(c1);
        
        assertFalse(t5.isVisited());
        try
        {
            ProcessEXP7.processPass1(t5);
        } catch (NullPointerException e)
        {
            //do nothing we expect an exception to be thrown
        }
        assertTrue(t5.isVisited());
        assertEquals(t5.getType(), "int[]");
        assertEquals(t3.getParentClass(), c1);
        assertEquals(t3.getParentMethod(), pm);
    }

}