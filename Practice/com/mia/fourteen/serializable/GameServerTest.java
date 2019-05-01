package com.mia.fourteen.serializable;

import java.io.*;

public class GameServerTest {

	public static void main(String[] args) {
		
		GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
		GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big ax"});
		GameCharacter third = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"});
		
		try {
			
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\\\Mia\\\\test\\\\test.txt"));
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(third);
			os.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		one = null;
		two = null;
		third = null;
		
		try {
			
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\\\Mia\\\\test\\\\test.txt"));
			GameCharacter oneRestore = (GameCharacter)is.readObject();
			GameCharacter twoRestore = (GameCharacter)is.readObject();
			GameCharacter thirdRestore = (GameCharacter)is.readObject();
			
			System.out.println("One's type: " + oneRestore.getType());
			System.out.println("Two's type: " + twoRestore.getType());
			System.out.println("Third's type: " + thirdRestore.getType());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
