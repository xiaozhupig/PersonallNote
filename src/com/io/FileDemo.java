package com.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;





public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(File.separator);  //
		System.out.println(File.separatorChar);
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		File file=new File("D:/emp.txt");
		File file2 = new File("D:"+File.separator+"test2.txt");
		String dir= "D:/test2";
		File file3= new File(dir, "test");
		System.out.println(file3);
		File file4 = new File(file2, "test4");
		System.out.println(file4);
		System.out.println("*******");
		System.out.println(file4.getAbsoluteFile());
		System.out.println(file3.getAbsolutePath());
		//���¿�ִ�У��ɶ�д����������ļ���������Ϊfalse
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		//---------------------------------
		System.out.println(file.getParent());
		System.out.println(file.getName());
		System.out.println(file.isAbsolute());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println("****");
		System.out.println(file.length());
		System.out.println(new Date(file.lastModified()).toLocaleString());
		System.out.println(file.exists());
		if(file.exists()){
			System.out.println("���ڴ��ļ�Ҫɾ��");
			file.delete();
		}else {
			System.out.println("���ļ������ڣ���Ҫ����");
			file.createNewFile();
		}
		file4.renameTo(new File("D:/123.java"));
		System.out.println(file4);
		System.out.println("*****");
			System.getProperty("FileDemo.java");
			PrintStream p
			
		
			
		
		
		
		
		
	}

}
