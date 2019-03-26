import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

class AllComponents implements ActionListener {

        // 1. JFrame
        // 2. Container
        // 3. JLabel
        // 4. JMenuBar
        // 5. JMenu
        // 6. JMenuItem
        // 7. JOptionPane
        // 8. Event Handling
        // 9. Dialogs
        // 10. Buttons
        // 11. TextFields
        // 12. Layouts
        // 13. JCheckBox
        // 14. JRadioButton
        // 15. JComboBox
        // 16. JTextAreas
        //

        JFrame jFrame;
        Container container;

        public static void main(String[] args) {
                AllComponents allComponents = new AllComponents();
                allComponents.runApp();
        }

        void runApp() {
                myJFrame();
                myContainer();
                // myJLabel();
                // myJMenuBar();
                // myJOptionPane();
                // myEventHandling();
                // myDialogs();
                // myButtons();
                // myTextFields();
                // myJCheckBox();
                // myJRadioButton();
                // myJComboBox();
                // myJTextArea();
        }

        // 1. JFrame
        void myJFrame() {
                jFrame = new JFrame("All Components");
                jFrame.setVisible(true);
                // Menu bar could be hidden if you dont call setLayout method
                jFrame.setLayout(null);
                // jFrame.setBackground(Color.BLUE);
                // Using setLocationRelativeTo method before setSize could provide different
                // result
                jFrame.setSize(600, 400);
                // jFrame.pack();

                jFrame.setLocationRelativeTo(null);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setTitle("All Components Updated");
        }

        // 2. Container
        void myContainer() {
                container = jFrame.getContentPane();
                // container.setBackground(Color.CYAN);
        }

        // 3. JLabel
        void myJLabel() {
                // JLabel jLabel = new JLabel("This is jLabel");
                // // jLabel.setText("This is jLabel updated");
                // jLabel.setBounds(40, 40, 200, 40);
                // // jLabel.setHorizontalAlignment(SwingConstants.CENTER);
                // // jLabel.setVerticalAlignment(SwingConstants.TOP);
                // container.add(jLabel);
                // // jFrame.add(jLabel);
        }

        // 4. JMenuBar
        // 5. JMenu
        // 6. JMenuItem
        void myJMenuBar() {

                // JMenuBar mb = new JMenuBar();

                // // JMenu menu, submenu;
                // // JMenuItem i1, i2, i3, i4, i5;

                // JMenu menu = new JMenu("Menu");
                // JMenu submenu = new JMenu("Sub Menu");

                // JMenuItem i1 = new JMenuItem("Item 1");
                // JMenuItem i2 = new JMenuItem("Item 2");
                // JMenuItem i3 = new JMenuItem("Item 3");
                // JMenuItem i4 = new JMenuItem("Item 4");
                // JMenuItem i5 = new JMenuItem("Item 5");

                // menu.add(i1);
                // menu.add(i2);
                // menu.add(i3);

                // submenu.add(i4);
                // submenu.add(i5);

                // menu.add(submenu);
                // mb.add(menu);

                // jFrame.setJMenuBar(mb);

        }

        // 7. JOptionPane
        void myJOptionPane() {
                // JOptionPane.showMessageDialog(jFrame, "Hello, This is JOptionPane.");
                // JOptionPane.showMessageDialog(jFrame, " Successfully Updated.", "Alert",
                // JOptionPane.WARNING_MESSAGE);
                // String name = JOptionPane.showInputDialog(jFrame, "Enter Name");

                // For this need window listener
                // int a = JOptionPane.showConfirmDialog(jFrame, "Are you sure?");
                // if (a == JOptionPane.YES_OPTION) {
                // jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // }
        }

        // ===================================================
        // For myEventHandling
        // ===================================================
        // JTextField tf;

        // ===================================================
        // For textfield
        // ===================================================
        // JTextField tf1, tf2, tf3;
        // JButton b1, b2;

        // ===================================================
        // For checkbox
        // ===================================================
        // JLabel l;
        // JCheckBox cb1, cb2, cb3;
        // JButton b;

        // ===================================================
        // For JRadioButton
        // ===================================================
        // JRadioButton rb1, rb2;
        // JButton b;

        // ===================================================
        // For JTextArea
        // ===================================================
        // JLabel l1, l2;
        // JTextArea area;
        // JButton b;

        @Override
        public void actionPerformed(ActionEvent e) {
                // ===================================================
                // For myEventHandling
                // ===================================================
                // String command = e.getActionCommand();
                // if (command.equals("Click Here")) {
                // tf.setText("Welcome to Event Handling.");

                // JOptionPane.showMessageDialog(jFrame, tf.getText(), "title",
                // JOptionPane.INFORMATION_MESSAGE);
                // }

                // ===================================================
                // For textfield
                // ===================================================
                // String s1 = tf1.getText(); // 10
                // String s2 = tf2.getText(); // 20

                // int a = Integer.parseInt(s1); // 10
                // int b = Integer.parseInt(s2); // 20

                // int c = 0; // 30

                // if (e.getSource() == b1) {
                // c = a + b;
                // } else if (e.getSource() == b2) {
                // c = a - b;
                // }

                // String result = String.valueOf(c); // 30

                // tf3.setText(result);

                // ===================================================
                // For checkbox
                // ===================================================
                // float amount = 0;
                // String msg = "";
                // if (cb1.isSelected()) {
                // amount += 100;
                // msg = "Pizza: 100\n";
                // }
                // if (cb2.isSelected()) {
                // amount += 30;
                // msg += "Burger: 30\n";
                // }
                // if (cb3.isSelected()) {
                // amount += 10;
                // msg += "Tea: 10\n";
                // }

                // msg += "-----------------\n";
                // JOptionPane.showMessageDialog(jFrame, msg + "Total: " + amount);

                // ===================================================
                // For JRadioButton
                // ===================================================
                // if (rb1.isSelected()) {
                // JOptionPane.showMessageDialog(jFrame, "You are Male.");
                // }
                // if (rb2.isSelected()) {
                // JOptionPane.showMessageDialog(jFrame, "You are Female.");
                // }

                // ===================================================
                // For JTextArea
                // ===================================================
                // String text = area.getText();
                // String words[] = text.split("\\s");
                // l1.setText("Words: " + words.length);
                // l2.setText("Characters: " + text.length());

        }

        // 8. Event Handling
        void myEventHandling() {

                // tf = new JTextField();
                // tf.setBounds(50, 50, 250, 20);
                // JButton b = new JButton("Click Here");
                // b.setBounds(50, 100, 100, 30);

                // // b.addActionListener(new ActionListener() {

                // // @Override
                // // public void actionPerformed(ActionEvent e) {
                // // tf.setText("Welcome to Event Handling.");
                // // }
                // // });
                // b.addActionListener(this);

                // container.add(tf);
                // container.add(b);

        }

        // 9. Dialogs
        void myDialogs() {
                // JDialog d = new JDialog(jFrame, "Dialog Example", true);
                // d.setLayout(new FlowLayout());
                // JButton b = new JButton("OK");
                // b.addActionListener(new ActionListener() {
                // public void actionPerformed(ActionEvent e) {
                // d.setVisible(false);
                // }
                // });
                // d.add(new JLabel("Click button to continue."));
                // d.add(b);
                // d.setSize(300, 300);
                // d.setVisible(true);
        }

        // 10. Buttons
        void myButtons() {

                // JButton b = new JButton(new ImageIcon("java_icon.jpeg"));

                // JButton c = new JButton("Normal");

                // b.setBounds(100, 100, 100, 40);
                // c.setBounds(100, 160, 100, 40);
                // jFrame.add(b);
                // jFrame.add(c);
        }

        // 11. TextFields
        void myTextFields() {

                // tf1 = new JTextField();
                // tf1.setBounds(50, 50, 150, 20);
                // tf2 = new JTextField();
                // tf2.setBounds(50, 100, 150, 20);
                // tf3 = new JTextField();
                // tf3.setBounds(50, 150, 150, 20);
                // tf3.setEditable(false);
                // b1 = new JButton("+");
                // b1.setBounds(50, 200, 50, 50);
                // b2 = new JButton("-");
                // b2.setBounds(120, 200, 50, 50);

                // b1.addActionListener(this);
                // // b2.addActionListener(this);

                // b2.addActionListener(new ActionListener() {

                // @Override
                // public void actionPerformed(ActionEvent e) {

                // }
                // });

                // jFrame.add(tf1);
                // jFrame.add(tf2);
                // jFrame.add(tf3);
                // jFrame.add(b1);
                // jFrame.add(b2);

        }

        // 12. Layouts
        void myLayouts() {
                // https://www.javatpoint.com/java-layout-manager
        }

        // 13. JCheckBox
        void myJCheckBox() {
                // l = new JLabel("Food Ordering System");
                // l.setBounds(50, 50, 300, 20);
                // cb1 = new JCheckBox("Pizza @ 100");
                // cb1.setBounds(100, 100, 150, 20);
                // cb2 = new JCheckBox("Burger @ 30");
                // cb2.setBounds(100, 150, 150, 20);
                // cb3 = new JCheckBox("Tea @ 10");
                // cb3.setBounds(100, 200, 150, 20);
                // b = new JButton("Order");
                // b.setBounds(100, 250, 80, 30);
                // b.addActionListener(this);
                // jFrame.add(l);
                // jFrame.add(cb1);
                // jFrame.add(cb2);
                // jFrame.add(cb3);
                // jFrame.add(b);

        }

        // 14. JRadioButton
        void myJRadioButton() {
                // rb1 = new JRadioButton("Male");
                // rb1.setBounds(100, 50, 100, 30);
                // rb2 = new JRadioButton("Female");
                // rb2.setBounds(100, 100, 100, 30);
                // ButtonGroup bg = new ButtonGroup();
                // bg.add(rb1);
                // bg.add(rb2);
                // b = new JButton("click");
                // b.setBounds(100, 150, 80, 30);
                // b.addActionListener(this);
                // jFrame.add(rb1);
                // jFrame.add(rb2);
                // jFrame.add(b);
        }

        // 15. JComboBox
        void myJComboBox() {

                // JLabel label = new JLabel();
                // label.setHorizontalAlignment(JLabel.CENTER);
                // label.setSize(400, 100);
                // JButton b = new JButton("Show");
                // b.setBounds(200, 100, 75, 20);
                // String languages[] = { "C", "C++", "C#", "Java", "PHP" };
                // JComboBox cb = new JComboBox(languages);
                // cb.addItem("Dart");

                // cb.setBounds(50, 100, 90, 20);
                // jFrame.add(cb);
                // jFrame.add(label);
                // jFrame.add(b);
                // jFrame.setLayout(null);
                // jFrame.setSize(350, 350);
                // jFrame.setVisible(true);
                // b.addActionListener(new ActionListener() {
                // public void actionPerformed(ActionEvent e) {
                // String data = "Programming language Selected: " +
                // cb.getItemAt(cb.getSelectedIndex());
                // label.setText(data);
                // }
                // });
        }

        // 16. JTextArea
        void myJTextArea() {
                // l1 = new JLabel();
                // l1.setBounds(50, 25, 100, 30);
                // l2 = new JLabel();
                // l2.setBounds(160, 25, 100, 30);
                // area = new JTextArea();
                // area.setBounds(20, 75, 250, 200);
                // b = new JButton("Count Words");
                // b.setBounds(100, 300, 120, 30);
                // b.addActionListener(this);
                // jFrame.add(l1);
                // jFrame.add(l2);
                // jFrame.add(area);
                // jFrame.add(b);
        }

        // In case you want to know
        // ===========================================================================
        // As for why both JFrame.add() and JFrame.getContentPane().add() both do the
        // same thing - JFrame.add() is overridden to call
        // JFrame.getContentPane().add(). This wasn't always the case - pre-JDK 1.5 you
        // always had to specify JFrame.getContentPane().add() explicitly and
        // JFrame.add() threw a RuntimeException if you called it, but due to many
        // complaints, this was changed in JDK 1.5 to do what you'd expect.
}