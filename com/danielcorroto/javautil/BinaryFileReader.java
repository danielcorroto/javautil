package com.danielcorroto.javautil;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryFileReader {
	private File file;
	private BufferedInputStream in;
	private int readed = 0;

	public BinaryFileReader(String filename) throws FileNotFoundException {
		file = new File(filename);
		init();
	}

	public BinaryFileReader(File file) throws FileNotFoundException {
		this.file = file;
		init();
	}

	private void init() throws FileNotFoundException {
		in = new BufferedInputStream(new FileInputStream(file));
	}

	public int read(byte[] buffer) throws IOException {
		readed = in.read(buffer, 0, buffer.length);
		return readed;
	}

	public void close() throws IOException {
		in.close();
	}

	public class BinaryFileReaderWrapper {
		private int size;
		private byte[] buffer;

		public BinaryFileReaderWrapper(int size, byte[] buffer) {
			this.size = size;
			this.buffer = buffer;
		}

		public int getSize() {
			return size;
		}

		public byte[] getBuffer() {
			return buffer;
		}
	}

}
