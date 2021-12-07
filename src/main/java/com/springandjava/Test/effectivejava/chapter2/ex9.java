package com.springandjava.Test.effectivejava.chapter2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ex9 {

	private static final byte BUFFER_SIZE = 100;

	static void copy(String src, String dst) throws IOException{
		try(InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dst)) {
			byte[] buf = new byte[BUFFER_SIZE];
			int n;
			while ((n = in.read(buf)) >= 0)
				out.write(buf, 0,n);
		}
	}
	//
	// InputStream in = new FileOutputStream(dst);
	// try {
	// 	OutputStream out = new FileOutputStream(dst);
	// 	try{
	// 		byte[] buf = new byte[BUFFER_SIZE];
	// 		int n;
	// 		while ((n = in.read(buf)) >= 0)
	// 			out.write(buf,0,n);
	// 	} finally {
	// 		out.close();
	// 	} finally {
	// 		in.close();
	// 	}
	// }
}
