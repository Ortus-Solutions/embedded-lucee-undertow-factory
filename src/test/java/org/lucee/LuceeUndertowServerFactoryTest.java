package org.lucee;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LuceeUndertowServerFactoryTest extends TestCase {

    public LuceeUndertowServerFactoryTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( LuceeUndertowServerFactoryTest.class );
    }

    public void testUndertowServerFactory() {
        assertTrue( true );
    }

}
