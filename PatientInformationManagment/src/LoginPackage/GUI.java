package LoginPackage;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import PatientManagment.*;

public class GUI extends JFrame {
    JFrame frame = new JFrame("LoginUI");
    JTextField textUsername = new JTextField("Username");
    JTextField textPassword = new JTextField("Password");
    JButton loginButton = new JButton("Login");
    LoginController loginController;

    public GUI(LoginController loginController) {
        this.loginController = loginController;
    }

    public void showLogin(){
        frame.setLayout(null);
        frame.setTitle("LOGIN PAGE");
        frame.setLocation(new Point(500, 300));
        frame.setSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textUsername.setBounds(100, 27, 190, 25);
        frame.add(textUsername);

        textPassword.setBounds(100, 60, 190, 25);
        frame.add(textPassword);

        loginButton.setBounds(100, 110, 90, 25);
        frame.add(loginButton);

        frame.setVisible(true);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginController.requestAuthenticate(textUsername.getText(), textPassword.getText());
            }
        });
    }
}
