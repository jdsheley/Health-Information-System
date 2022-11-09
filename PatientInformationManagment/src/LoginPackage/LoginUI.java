package LoginPackage;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import PatientManagment.*;

public class LoginUI extends JFrame{
    JFrame frame = new JFrame("LoginUI");
    JTextField textUsername = new JTextField("Username:");
    JTextField textPassword = new JTextField("Password:"); 
    JTextField textCaptcha = new JTextField("Please enter captcha:")
    JButton loginButton = new JButton("Login");
    LoginController loginController;

    public LoginUI(LoginController loginController) {
        this.loginController = loginController;
    }

    public void showTest(){
        frame.setLayout(null);
        frame.setTitle("LOGIN PAGE");
        frame.setLocation(new Point(500, 300));
        frame.setSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         textUsername.setBounds(100, 27, 190, 25);
         frame.add(textUsername);

         textPassword.setBounds(100, 60, 190, 25);
         frame.add(textPassword);
/* 
         textCaptcha.setBounds(100, 120, 190, 25);
         frame.add(textCaptcha);
         */

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


