package com.danielcorroto.javautil;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamFileReader {
	private File file;
	private DataInputStream in;
	private BufferedReader br;

	public StreamFileReader(String filename) throws FileNotFoundException {
		file = new File(filename);
		init();
	}

	public StreamFileReader(File file) throws FileNotFoundException {
		this.file = file;
		init();
	}

	protected void finalize() throws Throwable {
		close();
	};

	private void init() throws FileNotFoundException {
		FileInputStream fstream = new FileInputStream(file);
		in = new DataInputStream(fstream);
		br = new BufferedReader(new InputStreamReader(in));
	}

	public String readLine() throws IOException {
		return br.readLine();
	}

	public void close() throws IOException {
		in.close();
	}

}
