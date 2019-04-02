import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// For border watch this
//https://docs.oracle.com/javase/tutorial/uiswing/components/border.html

class GUI implements ActionListener {

        JFrame frame;

        JPanel rootPanel, platformPanel, seniorDevPanel, juniorDevPanel, btnPanel;

        JTextField tfPlatform, tfInterviewerName, tfDeveloperName, tfWorkingHourPerDay, tfSalary, tfJoiningData,
                        tfStaffRoomNo, tfContractPeriod, tfAdvanceSalary, tfAppointedDate, tfTerminationDate,
                        tfSpecialization, tfAppointedBy, tfEvaluationPeriod, tfDeveloperNo, tfDevNoJunior,
                        tfDevNameJunior;

        JButton btnPlatformForJunior, btnPlatformForSenior, btnAppointSenior, btnContractTermination, btnAppointJunior,
                        btnDisplayAll, btnClear;

        private Component currentComponent;

        public static void main(String[] args) {
                new GUI().runApp();
        }

        void initializeComponents() {
                rootPanel = new JPanel();
                platformPanel = new JPanel();
                seniorDevPanel = new JPanel();
                juniorDevPanel = new JPanel();
                btnPanel = new JPanel();

                tfPlatform = new JTextField();
                tfInterviewerName = new JTextField();
                tfSalary = new JTextField();
                tfWorkingHourPerDay = new JTextField();
                tfDeveloperName = new JTextField();
                tfSalary = new JTextField();
                tfJoiningData = new JTextField();
                tfStaffRoomNo = new JTextField();
                tfContractPeriod = new JTextField();
                tfAdvanceSalary = new JTextField();
                tfAppointedDate = new JTextField();
                tfTerminationDate = new JTextField();
                tfSpecialization = new JTextField();
                tfAppointedBy = new JTextField();
                tfEvaluationPeriod = new JTextField();
                tfDeveloperNo = new JTextField();
                tfDeveloperNo = new JTextField();
                tfDevNoJunior = new JTextField();
                tfDevNameJunior = new JTextField();

                btnPlatformForJunior = new JButton("Add for Junior");
                btnPlatformForSenior = new JButton("Add for Senior");
                btnAppointSenior = new JButton("Appoint");
                btnContractTermination = new JButton("Terminate");
                btnAppointJunior = new JButton("Appoint Junior Dev");
                btnDisplayAll = new JButton("Display All");
                btnClear = new JButton("Clear");

                btnPlatformForJunior.addActionListener(this);
                btnPlatformForSenior.addActionListener(this);
                btnAppointSenior.addActionListener(this);
                btnContractTermination.addActionListener(this);
                btnAppointJunior.addActionListener(this);
                btnDisplayAll.addActionListener(this);
                btnClear.addActionListener(this);
        }

        void runApp() {
                frame = new JFrame("Rigo Technology");
                frame.setBounds(50, 50, 600, 620);

                initializeComponents();
                createRootPanel();
                createPanel("Add platform for senior/junior developer", 160, platformPanel, null);

                // ================ Platform Start ============================
                // Platform
                createLabel("Platform :", null, null, platformPanel);
                createTextField(tfPlatform, currentComponent, null, 217, 30, platformPanel);

                // Working hour
                createLabel("Working Hour :", tfPlatform, null, platformPanel);
                createTextField(tfWorkingHourPerDay, currentComponent, null, 110, 30, platformPanel);

                // Interviewer name
                createLabel("Interviewer :", null, currentComponent, platformPanel);
                createTextField(tfInterviewerName, currentComponent, tfPlatform, 437, 30, platformPanel);

                // Buttons to add platform for junior and senior developer
                createButton(btnPlatformForJunior, null, currentComponent, 115, 40, platformPanel);
                createButton(btnPlatformForSenior, btnPlatformForJunior, currentComponent, 115, 40, platformPanel);

                // =============== Platform End =============================

                // =============== Senior Developer Start =============================

                createPanel("Appoint/Terminate senior developer", 160, seniorDevPanel, platformPanel);

                // Developer name
                createLabel("Name :", null, null, seniorDevPanel);
                createTextField(tfDeveloperName, currentComponent, null, 217, 30, seniorDevPanel);

                // Joining date
                createLabel("Joining Date :", tfDeveloperName, null, seniorDevPanel);
                createTextField(tfJoiningData, currentComponent, null, 110, 30, seniorDevPanel);

                // Developer number
                createLabel("Dev No :", null, currentComponent, seniorDevPanel);
                createTextField(tfDeveloperNo, currentComponent, tfJoiningData, 53, 30, seniorDevPanel);

                // Staff room no
                createLabel("Room No :", tfDeveloperNo, tfJoiningData, seniorDevPanel);
                createTextField(tfStaffRoomNo, currentComponent, tfJoiningData, 53, 30, seniorDevPanel);

                // Advance salary
                createLabel("Adv Salary :", tfStaffRoomNo, tfJoiningData, seniorDevPanel);
                createTextField(tfAdvanceSalary, currentComponent, tfJoiningData, 110, 30, seniorDevPanel);

                // Appoint senior developer button
                createButton(btnAppointSenior, null, currentComponent, 115, 40, seniorDevPanel);
                createButton(btnContractTermination, btnAppointSenior, currentComponent, 115, 40, seniorDevPanel);

                // ================ Senior Developer End ============================

                // ================ Junior Developer Start ============================

                createPanel("Appoint junior developer", 160, juniorDevPanel, seniorDevPanel);

                // Developer name
                createLabel("Name :", null, null, juniorDevPanel);
                createTextField(tfDevNameJunior, currentComponent, null, 217, 30, juniorDevPanel);

                // Specialization
                createLabel("Specialization :", tfDevNameJunior, null, juniorDevPanel);
                createTextField(tfSpecialization, currentComponent, null, 110, 30, juniorDevPanel);

                // Developer number
                createLabel("Dev No :", null, currentComponent, juniorDevPanel);
                createTextField(tfDevNoJunior, currentComponent, tfSpecialization, 30, 30, juniorDevPanel);

                // Appointed date
                createLabel("Appoint Date :", tfDevNoJunior, tfSpecialization, juniorDevPanel);
                createTextField(tfAppointedDate, currentComponent, tfSpecialization, 77, 30, juniorDevPanel);

                // Termination date
                createLabel("Termi Date :", tfAppointedDate, tfSpecialization, juniorDevPanel);
                createTextField(tfTerminationDate, currentComponent, tfSpecialization, 110, 30, juniorDevPanel);

                // Appoint Junior button
                createButton(btnAppointJunior, null, currentComponent, 235, 40, juniorDevPanel);

                // =============== Junior Developer End =============================

                // =============== Buttons Start =============================

                // Display button
                createButton(btnDisplayAll, null, juniorDevPanel, 125, 40, rootPanel);

                // Clear button
                createButton(btnClear, btnDisplayAll, juniorDevPanel, 125, 40, rootPanel);

                // =============== Buttons End =============================

                frame.setLayout(null);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
        }

        void createRootPanel() {
                int panelWidth = 580;
                int panelHeight = 580;
                int x = (frame.getWidth() - panelWidth) / 2;

                rootPanel.setLayout(null);
                rootPanel.setBounds(x, 10, panelWidth, panelHeight);
                rootPanel.setBorder(BorderFactory.createMatteBorder(3, 1, 1, 1, Color.black));
                frame.add(rootPanel);
        }

        void createPanel(String label, int height, JPanel panel, Component below) {
                int width = 560;
                int x = (rootPanel.getWidth() - width) / 2;
                int y = below == null ? 10 : below.getY() + below.getHeight() + 10;
                panel.setBounds(x, y, width, height);
                panel.setLayout(null);
                panel.setBorder(BorderFactory.createTitledBorder(label));
                rootPanel.add(panel);
        }

        private void createLabel(String labelName, Component rightOf, Component below, JPanel panel) {
                JLabel label = new JLabel(labelName);
                this.currentComponent = label;
                // If below is null then default value for x is 10
                // If rightOf is null then default value
                int x = rightOf == null ? 10 : rightOf.getX() + rightOf.getWidth() + 5;
                // rightOf.getX() + rightOf.getWidth() + stdMargin()
                int y = below == null ? 32 : below.getY() + below.getHeight() + 10;
                // below.getY()+ below.getHeight() + stdMargin
                // int width = 150;
                // int height = 30;
                // label.setOpaque(true);
                // label.setBackground(Color.LIGHT_GRAY);
                label.setBounds(x, y, 100, 25);
                panel.add(label);
        }

        private void createTextField(JTextField textField, Component rightOf, Component below, int width, int height,
                        JPanel panel) {
                // If below is null then default value for x is 10
                // If rightOf is null then default value
                int x = rightOf == null ? 10 : rightOf.getX() + rightOf.getWidth() + 5;
                // rightOf.getX() + rightOf.getWidth() + stdMargin()
                int y = below == null ? 30 : below.getY() + below.getHeight() + 5;
                // below.getY()+ below.getHeight() + stdMargin
                // int width = 250;
                // int height = 30;
                // textField.setOpaque(true);
                // textField.setBackground(Color.CYAN);
                textField.setBounds(x, y, width, height);
                panel.add(textField);
        }

        private void createButton(JButton button, Component rightOf, Component below, int width, int height,
                        JPanel panel) {
                // If below is null then default value for x is 10
                // If rightOf is null then default value
                int x = rightOf == null ? 315 : rightOf.getX() + rightOf.getWidth() + 5;
                // rightOf.getX() + rightOf.getWidth() + stdMargin()
                int y = below == null ? 10 : below.getY() + below.getHeight() + 10;
                // below.getY()+ below.getHeight() + stdMargin
                // int width = 250;
                // int height = 30;
                // textField.setOpaque(true);
                // textField.setBackground(Color.CYAN);

                button.setBounds(x, y, width, height);

                panel.add(button);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

                switch (e.getActionCommand()) {
                case "Add for Junior":
                        System.out.println("I am Platform button for junior");
                        break;

                case "Add for Senior":
                        System.out.println("I am Platform button for senior");
                        break;

                default:
                        break;
                }

                // if (e.getSource() == btnPlatformForJunior) {

                // } else if (e.getSource() == btnPlatformForSenior) {

                // } else if (e.getSource() == btnAppointSenior) {

                // } else if (e.getSource() == btnAppointJunior) {

                // }
        }
}