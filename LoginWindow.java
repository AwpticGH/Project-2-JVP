package program;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class LoginWindow extends JFrame implements ActionListener {

    private File bebasFile;

    public Font fontBebas;

    private Image image;
    private Image scaledImage;
    private JLabel iconLabel;

    private JLabel label1 = new JLabel("WELCOME TO RFS AIRLINE");
    private JLabel label2 = new JLabel("Login Below");
    private JLabel label3 = new JLabel("OR");
    private JLabel label4 = new JLabel("Register Now!");
    private JLabel labelLogin = new JLabel("Email");
    private JLabel labelPassword = new JLabel("Password");

    protected JButton buttonLogin = new JButton("Login");
    protected JButton buttonRegister = new JButton("Register");

    protected JTextField tfEmail = new JTextField();
    protected JPasswordField tfPassword = new JPasswordField();

    LoginWindow() {
        setTitle("Login");
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        try {
            image = ImageIO.read(getClass().getResource("/WelcomePageBackground.png"));
            scaledImage = image.getScaledInstance(400, 400, Image.SCALE_SMOOTH);

//            bebasFile = new File("C:/Rafi/CCIT/2SE1/Quarter 1/Project 2/src/program/fonts/BebasNeue-Regular.ttf");
//            fontBebas = Font.createFont(Font.TRUETYPE_FONT, bebasFile);
        }
        catch (Exception e) {

        }
        iconLabel = new JLabel();
        iconLabel.setIcon(new ImageIcon(scaledImage));

//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        ge.registerFont(fontBebas);
//        fontBebas.deriveFont(Font.PLAIN, 30);

        label1.setBounds(15, 25, 245, 38);
        label2.setBounds(15, 75, 101, 20);
        label3.setBounds(181, 75, 26, 20);
        label4.setBounds(269, 75, 114, 20);
        labelLogin.setBounds(15, 115, 62, 16);
        labelPassword.setBounds(15, 145, 62, 16);
        buttonLogin.setBounds(280, 115, 94, 19);
        buttonRegister.setBounds(280, 145, 94, 19);
        tfEmail.setBounds(85, 115, 146, 19);
        tfPassword.setBounds(85, 145, 146, 19);

        label1.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
//        label1.setFont(fontBebas);
        label2.setFont(new Font("Montserrat Alternates", Font.PLAIN, 16));
        label3.setFont(new Font("Montserrat Alternates", Font.PLAIN, 16));
        label4.setFont(new Font("Montserrat Alternates", Font.PLAIN, 16));

        label1.setForeground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label3.setForeground(new Color(149, 209, 204));
        label4.setForeground(Color.WHITE);
        labelLogin.setForeground(Color.WHITE);
        labelPassword.setForeground(Color.WHITE);

        buttonLogin.addActionListener(this);
        buttonRegister.addActionListener(this);

        iconLabel.add(label1);
        iconLabel.add(label2);
        iconLabel.add(label3);
        iconLabel.add(label4);
        iconLabel.add(labelLogin);
        iconLabel.add(labelPassword);
        iconLabel.add(buttonLogin);
        iconLabel.add(buttonRegister);
        iconLabel.add(tfEmail);
        iconLabel.add(tfPassword);

        setContentPane(iconLabel);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        RegisterWindow registerWindow = new RegisterWindow();

        if (e.getSource() == buttonRegister) {
            dispose();
            // GO TO REGISTER PAGE
//            registerWindow.start();
            new RegisterWindow();
        }
    }
}