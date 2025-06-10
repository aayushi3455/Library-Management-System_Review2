package src.ui;

import src.controllers.AuthController;
import src.utils.Validator;

import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        setTitle("Library Login");
        setSize(300, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> login());

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        add(panel);
    }

    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (!Validator.isValidLogin(username, password)) {
            JOptionPane.showMessageDialog(this, "Please enter both username and password.");
            return;
        }

        if (AuthController.authenticate(username, password)) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            dispose();
            // new Dashboard().setVisible(true); // To be implemented
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }
    }
}
