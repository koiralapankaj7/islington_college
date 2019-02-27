import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

class JFrameExample {

        // Static method cannot call non static method and variable
        // Non static method can call static method and variable
        // We cannot use this keyword for static method and variables

        public static void main(String[] args) {

                JFrame frame = new JFrame();

                frame.setVisible(true);
                frame.setSize(800, 500); // Width and height
                // frame.setLocation(200, 80); // X and Y

                // frame.setBounds(100, 50, 700, 400); // X, Y, Width, Height

                frame.setTitle("This is my JFrame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                ImageIcon icon = new ImageIcon("java_icon.jpeg");
                frame.setIconImage(icon.getImage());

                Container container = frame.getContentPane();

                container.setBackground(Color.GREEN);

                frame.setResizable(false);

                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
                int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
                frame.setLocation(x, y);

                frame.setLocation(x, y); // X and Y
                // frame.setLocationRelativeTo(null);

        }

}