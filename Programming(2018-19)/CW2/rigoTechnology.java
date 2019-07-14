import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import javax.swing.JTextField;

import java.awt.Component;

class RigoTechnology {

        private final int STD_MARGIN = 10;
        private final int LABEL_WIDTH = 150;
        private final int LABEL_HEIGHT = 150;

        private Component rootComponent;
        private Component currentComponent;

        JFrame frame;
        ArrayList textFields;

        JTextField tfPlatform, tfInterviewerName, tfDeveloperName, tfWorkingHourPerDay, tfSalary, tfJoiningData,
                        tfStaffRoomNo, tfContractPeriod, tfAdvanceSalary, tfAppointedDate, tfTerminationDate,
                        tfSpecialization, tfAppointedBy, tfEvaluationPeriod, tfDeveloperNo, tfDevNoJunior,
                        tfDevNameJunior;

        JButton btnPlatformForJunior, btnPlatformForSenior, btnAppointSenior, btnContractTermination, btnAppointJunior,
                        btnDisplayAll, btnClear;

        JPanel rootPanel, platformPanel, seniorDevPanel, juniorDevPanel;

        public static void main(String[] args) {
                new RigoTechnology().runApp();
        }

        void initializeComponents() {
                rootPanel = new JPanel();
                platformPanel = new JPanel();
                seniorDevPanel = new JPanel();
                juniorDevPanel = new JPanel();

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
        }

        void runApp() {

                frame = new JFrame("Rigo Technology");
                frame.setBounds(50, 50, 600, 500);
                frame.setLayout(null);
                frame.setResizable(false);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                initializeComponents();

                // JPanel platformPanel = new JPanel();
                // platformPanel.setSize(200, 200);
                // platformPanel.setBorder(BorderFactory.createTitledBorder("Platform for
                // Senior/Junior Developer"));
                // frame.add(platformPanel);

                platformPanel.setBorder(BorderFactory.createTitledBorder("Platform for Senior/Junior Developer"));

                // ================ Platform Start ============================

                // Platform
                createLabel("Platform :", null, null, 100, 30);
                createTextField(tfPlatform, currentComponent, null, 230, 30);

                // Working hour
                createLabel("Working Hour :", tfPlatform, null, 100, 30);
                createTextField(tfWorkingHourPerDay, currentComponent, null, 120, 30);

                // Interviewer name
                createLabel("Interviewer :", null, currentComponent, 100, 30);
                createTextField(tfInterviewerName, currentComponent, tfPlatform, 470, 30);

                // Buttons to add platform for junior and senior developer
                createButton(btnPlatformForJunior, null, currentComponent, 115, 40);
                createButton(btnPlatformForSenior, btnPlatformForJunior, currentComponent, 115, 40);

                // =============== Platform End =============================

                // =============== Senior Developer Start =============================

                // Developer name
                createLabel("Name :", null, btnPlatformForJunior, 100, 30);
                createTextField(tfDeveloperName, currentComponent, btnPlatformForJunior, 230, 30);

                // Joining date
                createLabel("Joining Date :", tfDeveloperName, btnPlatformForJunior, 100, 30);
                createTextField(tfJoiningData, currentComponent, btnPlatformForJunior, 120, 30);

                // Developer number
                createLabel("Dev No :", null, currentComponent, 100, 30);
                createTextField(tfDeveloperNo, currentComponent, tfJoiningData, 55, 30);

                // Staff room no
                createLabel("Room No :", tfDeveloperNo, tfJoiningData, 100, 30);
                createTextField(tfStaffRoomNo, currentComponent, tfJoiningData, 55, 30);

                // Advance salary
                createLabel("Adv Salary :", tfStaffRoomNo, tfJoiningData, 100, 30);
                createTextField(tfAdvanceSalary, currentComponent, tfJoiningData, 120, 30);

                // Appoint senior developer button
                createButton(btnAppointSenior, null, currentComponent, 115, 40);
                createButton(btnContractTermination, btnAppointSenior, currentComponent, 115, 40);

                // ================ Senior Developer End ============================

                // ================ Junior Developer Start ============================

                // Developer name
                createLabel("Name :", null, btnAppointSenior, 100, 30);
                createTextField(tfDevNameJunior, currentComponent, btnAppointSenior, 230, 30);

                // Specialization
                createLabel("Specialization :", tfDevNameJunior, btnAppointSenior, 100, 30);
                createTextField(tfSpecialization, currentComponent, btnAppointSenior, 120, 30);

                // Developer number
                createLabel("Dev No :", null, currentComponent, 100, 30);
                createTextField(tfDevNoJunior, currentComponent, tfSpecialization, 55, 30);

                // Appointed date
                createLabel("Appoint Date :", tfDevNoJunior, tfSpecialization, 100, 30);
                createTextField(tfAppointedDate, currentComponent, tfSpecialization, 55, 30);

                // Termination date
                createLabel("Termi Date :", tfAppointedDate, tfSpecialization, 100, 30);
                createTextField(tfTerminationDate, currentComponent, tfSpecialization, 120, 30);

                // Appoint Junior button
                createButton(btnAppointJunior, null, currentComponent, 240, 40);

                // Display button
                createButton(btnDisplayAll, null, btnAppointJunior, 115, 40);

                // Clear button
                createButton(btnClear, btnDisplayAll, btnAppointJunior, 115, 40);

                // =============== Junior Developer End =============================

                frame.setVisible(true);

        }

        private void createLabel(String labelName, Component rightOf, Component below, int width, int height) {
                JLabel label = new JLabel(labelName);
                this.currentComponent = label;
                // If below is null then default value for x is 10
                // If rightOf is null then default value
                int x = rightOf == null ? 10 : rightOf.getX() + rightOf.getWidth() + 10;
                // rightOf.getX() + rightOf.getWidth() + stdMargin()
                int y = below == null ? 10 : below.getY() + below.getHeight() + 10;
                // below.getY()+ below.getHeight() + stdMargin
                // int width = 150;
                // int height = 30;
                // label.setOpaque(true);
                // label.setBackground(Color.CYAN);
                label.setBounds(x, y, width, height);
                frame.add(label);
        }

        private void createTextField(JTextField textField, Component rightOf, Component below, int width, int height) {
                // If below is null then default value for x is 10
                // If rightOf is null then default value
                int x = rightOf == null ? 10 : rightOf.getX() + rightOf.getWidth() + 10;
                // rightOf.getX() + rightOf.getWidth() + stdMargin()
                int y = below == null ? 10 : below.getY() + below.getHeight() + 10;
                // below.getY()+ below.getHeight() + stdMargin
                // int width = 250;
                // int height = 30;
                // textField.setOpaque(true);
                // textField.setBackground(Color.CYAN);
                textField.setBounds(x, y, width, height);
                frame.add(textField);
        }

        private void createButton(JButton button, Component rightOf, Component below, int width, int height) {
                // If below is null then default value for x is 10
                // If rightOf is null then default value
                int x = rightOf == null ? 350 : rightOf.getX() + rightOf.getWidth() + 10;
                // rightOf.getX() + rightOf.getWidth() + stdMargin()
                int y = below == null ? 10 : below.getY() + below.getHeight() + 10;
                // below.getY()+ below.getHeight() + stdMargin
                // int width = 250;
                // int height = 30;
                // textField.setOpaque(true);
                // textField.setBackground(Color.CYAN);

                button.setBounds(x, y, width, height);

                frame.add(button);
        }

}