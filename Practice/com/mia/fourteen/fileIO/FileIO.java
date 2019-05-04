package com.mia.fourteen.fileIO;

import java.io.File;

public class FileIO {

	public static void main(String[] args) {
		
		// 이미 존재하는 파일을 나타내는 File 객체 생성
		File f = new File("C:/Mia/test/file.txt");
		
		// 새로운 디렉토리 생성
		File dir = new File("C:/Mia/test/chapter14");
		dir.mkdir();
		
		// 디렉토리에 들어있는 내용의 목록 출력
		if(dir.isDirectory()) {
			
			String[] dirContents = dir.list();
			for(int i=0; i<dirContents.length; i++) {
				System.out.println(dirContents[i]);
			}
		}
		
		// 파일/디렉토리 절대 경로 출력
		System.out.println(f.getAbsolutePath());
		System.out.println(dir.getAbsolutePath());
		
		// 파일/디렉토리 삭제 (성공했을 경우 true 리턴)
		boolean isDeleted = f.delete();
		System.out.println(isDeleted);
	}
}
