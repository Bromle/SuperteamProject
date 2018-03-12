

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NewspaperOrganizerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NewspaperOrganizerTest
{
    /**
     * Default constructor for test class NewspaperOrganizerTest
     */
    public NewspaperOrganizerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testListallNewspapers()
    {
        NewspaperOrganizer newspape2 = new NewspaperOrganizer();
        newspape2.listAllNewspapers();
    }
}

