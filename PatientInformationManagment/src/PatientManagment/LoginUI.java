package PatientManagment;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame{
    private LoginController theLoginCtrl;
    private JPanel panel1;
    private JTextField textUsername;
    private JTextField textPassword;
    private JButton loginButton;
    private JButton cancelButton;

    public LoginUI(LoginController loginCtrl) {
        this.theLoginCtrl = loginCtrl;
        this.add(panel1);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theLoginCtrl.requestAuthenticate(textUsername.getText(), textPassword.getText());
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }
}