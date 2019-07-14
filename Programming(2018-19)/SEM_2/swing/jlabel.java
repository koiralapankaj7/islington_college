import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

class JLabelExample {

        public static void main(String[] args) {
                JFrame frame = new JFrame();

                frame.setVisible(true);
                frame.setSize(700, 400); // Width and height
                frame.setLocationRelativeTo(null);

                frame.setTitle("This is my JLabel");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Container container = frame.getContentPane();

                ImageIcon imageIcon = new ImageIcon("java_icon.jpeg");

                JLabel label = new JLabel("This is title", imageIcon, JLabel.LEFT);
                label.setBounds(40, 20, 500, 50); // x, y, width, height //imageIcon.getIconHeight()
                // label.setText("Updated name of JLabel");
                // label.setIcon(imageIcon);

                Font font = new Font("Arial", Font.BOLD, 20);
                label.setFont(font);

                // frame.setLayout(null);
                // frame.add(label);
                container.setLayout(null);
                container.add(label);

        }

}