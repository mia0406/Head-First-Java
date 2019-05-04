package com.mia.fourteen.fileIO;

import java.io.File;

public class FileIO {

	public static void main(String[] args) {
		
		// �̹� �����ϴ� ������ ��Ÿ���� File ��ü ����
		File f = new File("C:/Mia/test/file.txt");
		
		// ���ο� ���丮 ����
		File dir = new File("C:/Mia/test/chapter14");
		dir.mkdir();
		
		// ���丮�� ����ִ� ������ ��� ���
		if(dir.isDirectory()) {
			
			String[] dirContents = dir.list();
			for(int i=0; i<dirContents.length; i++) {
				System.out.println(dirContents[i]);
			}
		}
		
		// ����/���丮 ���� ��� ���
		System.out.println(f.getAbsolutePath());
		System.out.println(dir.getAbsolutePath());
		
		// ����/���丮 ���� (�������� ��� true ����)
		boolean isDeleted = f.delete();
		System.out.println(isDeleted);
	}
}
