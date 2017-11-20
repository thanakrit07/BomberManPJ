package input;

import java.util.ArrayList;

import javafx.scene.input.KeyCode;

public class KeyInput {
	
	private static ArrayList<KeyCode> keyPressed = new ArrayList<>();
	
	public static void setKeyPressed(KeyCode key,boolean pressed) {
		if (pressed) {
			if (!keyPressed.contains(key)) keyPressed.add(key);
			else keyPressed.remove(key);
		}
	}
	
	public static boolean getKeyPressed(KeyCode key) {
		return keyPressed.contains(key);
	}
}
