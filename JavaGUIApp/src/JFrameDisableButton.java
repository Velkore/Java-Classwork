/*
 * Create a java application that generates the following forms using swing components :
 * Username : [ text field ]
 * First Name : [ text field ]
 * Last Name : [ text field ]
 * Password : [ password field ]
 * Confirm Password : [ password field ]
 * Email : [ text field ]
 * Gender : [ radio selector for Male / Female ]
 * Terms and Conditions : [ check box ]
 * Register [ button ]
 */

public class JFrameDisableButton {
    public static void main(String[] args) {

        try {
            // Create a new JFrame object from the javax.swing.JFrame class
            javax.swing.JFrame frame = new javax.swing.JFrame("Register");

            // Set the default values for the JFrame object
            frame.setSize(550, 750);
            frame.setLayout(new java.awt.GridLayout(8, 2));
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setBackground(java.awt.Color.CYAN);

            // Create a new JLabel object for each field
            javax.swing.JLabel userNameLabel = new javax.swing.JLabel("Username");
            javax.swing.JLabel firstNameLabel = new javax.swing.JLabel("First Name");
            javax.swing.JLabel lastNameLabel = new javax.swing.JLabel("Last Name");
            javax.swing.JLabel passwordLabel = new javax.swing.JLabel("Password");
            javax.swing.JLabel passwordConfirmLabel = new javax.swing.JLabel("Confirm Password");
            javax.swing.JLabel emailLabel = new javax.swing.JLabel("Email");
            javax.swing.JLabel genderLabel = new javax.swing.JLabel("Gender");

            // Create a new JTextField / JPasswordField object for each applicable field
            javax.swing.JTextField userNameField = new javax.swing.JTextField();
            javax.swing.JTextField firstNameField = new javax.swing.JTextField();
            javax.swing.JTextField lastNameField = new javax.swing.JTextField();
            javax.swing.JPasswordField passwordField = new javax.swing.JPasswordField();
            javax.swing.JPasswordField passwordConfirmField = new javax.swing.JPasswordField();
            javax.swing.JTextField emailField = new javax.swing.JTextField();

            // Create a new JRadioButtonMenuItem object for each gender selection field
            javax.swing.JRadioButtonMenuItem maleRadio = new javax.swing.JRadioButtonMenuItem("Male");
            javax.swing.JRadioButtonMenuItem femaleRadio = new javax.swing.JRadioButtonMenuItem("Female");

            // Create a new JCheckBox object for the terms and conditions field
            javax.swing.JCheckBox termsCheck = new javax.swing.JCheckBox("I accept the Terms and Conditions");

            // Create a new JButton object for the register button
            javax.swing.JButton registerButton = new javax.swing.JButton("Register");

            // Create a new button group object to allow only one gender radio button to be
            // selected at a time and add the radio buttons to the group
            javax.swing.ButtonGroup genderGroup = new javax.swing.ButtonGroup();
            genderGroup.add(maleRadio);
            genderGroup.add(femaleRadio);

            // Create panels for each component and adjust flow layout as needed
            javax.swing.JPanel userNameLabelPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
            javax.swing.JPanel userNameFieldPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
            userNameLabelPanel.add(userNameLabel);
            userNameFieldPanel.add(userNameField);

            javax.swing.JPanel firstNameLabelPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
            javax.swing.JPanel firstNameFieldPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
            firstNameLabelPanel.add(firstNameLabel);
            firstNameFieldPanel.add(firstNameField);

            javax.swing.JPanel lastNameLabelPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
            javax.swing.JPanel lastNameFieldPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
            lastNameLabelPanel.add(lastNameLabel);
            lastNameFieldPanel.add(lastNameField);

            javax.swing.JPanel passwordLabelPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
            javax.swing.JPanel passwordFieldPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
            passwordLabelPanel.add(passwordLabel);
            passwordFieldPanel.add(passwordField);

            javax.swing.JPanel passwordConfirmLabelPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
            javax.swing.JPanel passwordConfirmFieldPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
            passwordConfirmLabelPanel.add(passwordConfirmLabel);
            passwordConfirmFieldPanel.add(passwordConfirmField);

            javax.swing.JPanel emailLabelPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
            javax.swing.JPanel emailFieldPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
            emailLabelPanel.add(emailLabel);
            emailFieldPanel.add(emailField);

            javax.swing.JPanel genderPanel = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
            genderPanel.add(genderLabel);
            javax.swing.JPanel radioPanel = new javax.swing.JPanel();
            radioPanel.add(maleRadio);
            radioPanel.add(femaleRadio);

            javax.swing.JPanel termsPanel = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
            termsPanel.add(termsCheck);

            javax.swing.JPanel registerPanel = new javax.swing.JPanel(
                    new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
            registerPanel.add(registerButton);

            // Set the preferred size for each component
            userNameLabel.setPreferredSize(new java.awt.Dimension(200, 35));
            userNameField.setPreferredSize(new java.awt.Dimension(300, 35));
            firstNameLabel.setPreferredSize(new java.awt.Dimension(200, 35));
            firstNameField.setPreferredSize(new java.awt.Dimension(300, 35));
            lastNameLabel.setPreferredSize(new java.awt.Dimension(200, 35));
            lastNameField.setPreferredSize(new java.awt.Dimension(300, 35));
            passwordLabel.setPreferredSize(new java.awt.Dimension(200, 35));
            passwordField.setPreferredSize(new java.awt.Dimension(300, 35));
            passwordConfirmLabel.setPreferredSize(new java.awt.Dimension(200, 35));
            passwordConfirmField.setPreferredSize(new java.awt.Dimension(300, 35));
            emailLabel.setPreferredSize(new java.awt.Dimension(200, 35));
            emailField.setPreferredSize(new java.awt.Dimension(300, 35));
            genderLabel.setPreferredSize(new java.awt.Dimension(200, 35));
            maleRadio.setPreferredSize(new java.awt.Dimension(100, 20));
            femaleRadio.setPreferredSize(new java.awt.Dimension(100, 20));
            termsCheck.setPreferredSize(new java.awt.Dimension(400, 25));
            registerButton.setPreferredSize(new java.awt.Dimension(150, 50));

            // Add padding to the panels
            userNameLabelPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 30, 0, 10));
            userNameFieldPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 0, 30));
            firstNameLabelPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 30, 0, 10));
            firstNameFieldPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 30));
            lastNameLabelPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 30, 0, 10));
            lastNameFieldPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 30));
            passwordLabelPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 30, 0, 10));
            passwordFieldPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 30));
            passwordConfirmLabelPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 30, 0, 10));
            passwordConfirmFieldPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 30));
            emailLabelPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 30, 0, 10));
            emailFieldPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 30));
            genderPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 30, 0, 10));
            radioPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 30));
            termsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 50, 0, 10));
            registerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 50));

            // Set background color for each panel to cyan
            userNameLabelPanel.setBackground(java.awt.Color.CYAN);
            userNameFieldPanel.setBackground(java.awt.Color.CYAN);
            firstNameLabelPanel.setBackground(java.awt.Color.CYAN);
            firstNameFieldPanel.setBackground(java.awt.Color.CYAN);
            lastNameLabelPanel.setBackground(java.awt.Color.CYAN);
            lastNameFieldPanel.setBackground(java.awt.Color.CYAN);
            passwordLabelPanel.setBackground(java.awt.Color.CYAN);
            passwordFieldPanel.setBackground(java.awt.Color.CYAN);
            passwordConfirmLabelPanel.setBackground(java.awt.Color.CYAN);
            passwordConfirmFieldPanel.setBackground(java.awt.Color.CYAN);
            emailLabelPanel.setBackground(java.awt.Color.CYAN);
            emailFieldPanel.setBackground(java.awt.Color.CYAN);
            genderPanel.setBackground(java.awt.Color.CYAN);
            radioPanel.setBackground(java.awt.Color.CYAN);
            termsPanel.setBackground(java.awt.Color.CYAN);
            registerPanel.setBackground(java.awt.Color.CYAN);

            // Set color of register button to blue with white text
            registerButton.setBackground(java.awt.Color.BLUE);
            registerButton.setForeground(java.awt.Color.WHITE);

            // Set the font for each component
            userNameLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
            userNameField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));
            firstNameLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
            firstNameField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));
            lastNameLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
            lastNameField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));
            passwordLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
            passwordField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));
            passwordConfirmLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
            passwordConfirmField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));
            emailLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
            emailField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));
            genderLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
            registerButton.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
            maleRadio.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
            femaleRadio.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
            termsCheck.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));

            // Add the panels to the JFrame object
            frame.add(userNameLabelPanel);
            frame.add(userNameFieldPanel);
            frame.add(firstNameLabelPanel);
            frame.add(firstNameFieldPanel);
            frame.add(lastNameLabelPanel);
            frame.add(lastNameFieldPanel);
            frame.add(passwordLabelPanel);
            frame.add(passwordFieldPanel);
            frame.add(passwordConfirmLabelPanel);
            frame.add(passwordConfirmFieldPanel);
            frame.add(emailLabelPanel);
            frame.add(emailFieldPanel);
            frame.add(genderPanel);
            frame.add(radioPanel);
            frame.add(termsPanel);
            frame.add(registerPanel);

            // Disable the register button until the terms and conditions checkbox is
            // checked
            registerButton.setEnabled(false);

            // Add an action listener to the terms and conditions checkbox
            termsCheck.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    // If the checkbox is checked, enable the register button
                    if (termsCheck.isSelected()) {
                        registerButton.setEnabled(true);
                    } else {
                        registerButton.setEnabled(false);
                    }
                }
            });
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
