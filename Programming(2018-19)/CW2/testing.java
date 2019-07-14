import java.awt.*;
import javax.swing.*;

class Testing {

        JFrame frame;
        JPanel rootPanel;

        public static void main(String[] args) {
                new Testing().runApp();
        }

        void runApp() {

                frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 800);

                rootPanel = new JPanel();
                int panelWidth = 590;
                int panelHeight = 770;
                rootPanel.setLayout(null);
                int x = (frame.getWidth() - panelWidth) / 2;
                rootPanel.setBounds(x, x, panelWidth, panelHeight);
                rootPanel.setBorder(BorderFactory.createMatteBorder(3, 1, 1, 1, Color.black));
                frame.add(rootPanel);

                JPanel insidePanel = new JPanel();
                insidePanel.setSize(580, 400);
                insidePanel.setLayout(null);
                insidePanel.setBorder(BorderFactory.createTitledBorder("title"));
                rootPanel.add(insidePanel);

                JLabel label1 = new JLabel("Label 1");
                label1.setBounds(20, 20, 100, 40);
                insidePanel.add(label1);

                JTextField tf1 = new JTextField("tf 1");
                tf1.setBounds(130, 20, 100, 40);
                insidePanel.add(tf1);

                frame.setVisible(true);
                frame.setLayout(null);

        }
}