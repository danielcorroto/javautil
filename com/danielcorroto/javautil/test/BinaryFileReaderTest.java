package com.danielcorroto.javautil.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.junit.Test;

import com.danielcorroto.javautil.BinaryFileReader;

public class BinaryFileReaderTest {
	private static final int SIZE = 1000;
	private static final byte[] WRITE = new byte[] { 66, 68, 70, 72, 74 };

	@Test
	public void testRead() {
		try {
			File file = File.createTempFile("tempfile", ".tmp");
			writeTemp(file);
			BinaryFileReader r = new BinaryFileReader(file);
			int count = 0;
			int readed = 0;
			byte buffer[] = new byte[1024];
			while ((readed = r.read(buffer)) >= 0) {
				count += readed;
			}
			r.close();
			assertEquals("Read file", SIZE * WRITE.length, count);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	private void writeTemp(File file) throws Exception {
		OutputStream out = new FileOutputStream(file);
		for (int i = 0; i < SIZE; i++) {
			out.write(WRITE);
		}
		out.close();
	}
}
