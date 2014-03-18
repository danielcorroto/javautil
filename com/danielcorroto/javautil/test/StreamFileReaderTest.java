package com.danielcorroto.javautil.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.junit.Test;

import com.danielcorroto.javautil.StreamFileReader;

public class StreamFileReaderTest {

	@Test
	public void testRead() {
		try {
			File file = File.createTempFile("tempfile", ".tmp");
			writeTemp(file);
			StreamFileReader r = new StreamFileReader(file);
			int count = 0;
			while (r.readLine() != null) {
				count++;
			}
			r.close();
			assertEquals("Read file", 6, count);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	private void writeTemp(File file) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write("This is the temporary file content1\n");
		bw.write("This is the temporary file content2\n");
		bw.write("This is the temporary file content3\n");
		bw.write("This is the temporary file content4\n");
		bw.write("This is the temporary file content5\n");
		bw.write("This is the temporary file content6\n");
		bw.close();
	}
}
