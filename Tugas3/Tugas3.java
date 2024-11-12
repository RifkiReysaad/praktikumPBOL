import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tugas3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Tugas3::new);
    }

    public Tugas3() {
        showLoginFrame();
    }

    private void showSignupFrame() {
        
        JFrame signupFrame = new JFrame("Sign Up");
        signupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signupFrame.setSize(350, 400);
        signupFrame.setLayout(new BorderLayout());

       
        JPanel panelMain = new JPanel(new GridBagLayout());
        panelMain.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

       
        JLabel labelTitle = new JLabel("SIGN UP", SwingConstants.CENTER);
        labelTitle.setFont(new Font("Arial", Font.BOLD, 24));
        labelTitle.setForeground(new Color(0, 102, 102));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panelMain.add(labelTitle, gbc);

       
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelMain.add(new JLabel("Name:"), gbc);

        JTextField fullNameField = new JTextField(15);
        gbc.gridx = 1;
        panelMain.add(fullNameField, gbc);

       
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelMain.add(new JLabel("Email:"), gbc);

        JTextField emailField = new JTextField(15);
        gbc.gridx = 1;
        panelMain.add(emailField, gbc);

       
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelMain.add(new JLabel("Password:"), gbc);

        JPasswordField passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        panelMain.add(passwordField, gbc);

       
        JButton signupButton = new JButton("Sign Up");
        signupButton.setBackground(new Color(0, 102, 102));
        signupButton.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        panelMain.add(signupButton, gbc);

       
        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.LIGHT_GRAY);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        panelMain.add(loginButton, gbc);

        JLabel alreadyAccount = new JLabel("I've an account", SwingConstants.LEFT);
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelMain.add(alreadyAccount, gbc);

       
        loginButton.addActionListener(e -> {
            signupFrame.dispose(); 
            showLoginFrame();
        });

        signupFrame.add(panelMain, BorderLayout.CENTER);
        signupFrame.setLocationRelativeTo(null);
        signupFrame.setVisible(true);
    }

    private void showLoginFrame() {
       
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(350, 400);
        loginFrame.setLayout(new BorderLayout());

      
        JPanel panelMain = new JPanel(new GridBagLayout());
        panelMain.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

      
        JLabel labelTitle = new JLabel("LOGIN", SwingConstants.CENTER);
        labelTitle.setFont(new Font("Arial", Font.BOLD, 24));
        labelTitle.setForeground(new Color(0, 102, 102));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
       
        panelMain.add(labelTitle, gbc);

      
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelMain.add(new JLabel("Email:"), gbc);

        JTextField emailField = new JTextField(15);
        gbc.gridx = 1;
        panelMain.add(emailField, gbc);

       
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelMain.add(new JLabel("Password:"), gbc);

        JPasswordField passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        panelMain.add(passwordField, gbc);

      
        JButton loginButton = new JButton("Login");
        loginButton.setBackground(new Color(0, 102, 102));
        loginButton.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        panelMain.add(loginButton, gbc);

       
        JLabel noAccountLabel = new JLabel("I don't have an account", SwingConstants.LEFT);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panelMain.add(noAccountLabel, gbc);

        JButton signupButton = new JButton("Sign Up");
        signupButton.setBackground(Color.LIGHT_GRAY);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        panelMain.add(signupButton, gbc);

     
        signupButton.addActionListener(e -> {
            loginFrame.dispose(); 
            showSignupFrame();
        });

        loginFrame.add(panelMain, BorderLayout.CENTER);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }
}
