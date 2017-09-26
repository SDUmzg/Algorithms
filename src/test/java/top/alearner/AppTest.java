package top.alearner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import top.alearner.Tree.BinaryTree.BST;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        BST bst=new BST();
        bst.put(10,100);
        bst.put(9,90);
        System.out.println(bst.max());
        System.out.println(bst.min());
        System.out.println(bst.get(10));
        System.out.println(bst.size());

    }
}
