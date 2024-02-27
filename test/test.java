package test;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class test implements KeyListener {
    String text = "";

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        text += keyChar;
        System.out.println("Key typed: " + keyChar);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key pressed: " + keyCode);

        // Check if Enter key is pressed
        if (keyCode == KeyEvent.VK_ENTER) {
            System.out.println("Enter key pressed. Closing the program." + text);
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key released: " + keyCode);
    }

    public static void main(String[] args) {
        while(true) {
            test keyListener = new test();
        }
    }
}