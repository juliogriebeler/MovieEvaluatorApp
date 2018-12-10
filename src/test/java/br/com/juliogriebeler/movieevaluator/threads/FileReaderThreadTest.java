/**
 * 
 */
package br.com.juliogriebeler.movieevaluator.threads;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

/**
 * @author jfgriebeler
 *
 */
public class FileReaderThreadTest {
	
	FileReaderThread thread;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		thread = new FileReaderThread();
	}

	/**
	 * Test method for {@link br.com.juliogriebeler.movieevaluator.threads.FileReaderThread#FileReaderThread()}.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testFileReaderThread() throws FileNotFoundException, IOException {
		thread.run();
	}

}
