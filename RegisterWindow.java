package program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterWindow extends JFrame implements ActionListener {

    Font font = new Font("Times New Roman", Font.PLAIN, 14);

    private JPanel panel = new JPanel();

    private JLabel label1 = new JLabel("Please Fill In Your Biodata");
    private JLabel labelEmail = new JLabel("Email");
    private JLabel labelPassword = new JLabel("Password");
    private JLabel labelName = new JLabel("Name");
    private JLabel labelDOB = new JLabel("Date of Birth");
    private JLabel labelGender = new JLabel("Gender");
    private JLabel labelTitle = new JLabel("Title");
    private JLabel labelPhone = new JLabel("Phone Number");

    protected JTextField tfEmail = new JTextField();
    protected JPasswordField tfPassword = new JPasswordField();
    protected JTextField tfName = new JTextField();
    protected JTextField tfPhone = new JTextField();

    private String[] genderList = {"-", "Male", "Female"};
    // If comboGender.getText().toString() == "Male", title == "Mr."
    private String[] titleList = {"-", "Mr.", "Mrs", "Miss"};

    protected JComboBox comboDOB = new JComboBox();
    protected JComboBox comboGender = new JComboBox(genderList);
    protected JComboBox comboTitle = new JComboBox(titleList); // CHANGE UPON COMPLETION OF CODE

    protected JButton button = new JButton("Register");


    RegisterWindow() {
        setTitle("Register Account");
        setSize(300, 375);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel.setLayout(null);

        label1.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 18));
        label1.setBounds(37, 21, 226, 23);
        label1.setForeground(Color.WHITE);

        labelEmail.setBounds(15, 61, 34, 16);
        labelPassword.setBounds(15, 92, 60, 16);
        labelName.setBounds(15, 123, 34, 16);
        labelDOB.setBounds(15, 154, 74, 16);
        labelGender.setBounds(15, 185, 42, 16);
        labelTitle.setBounds(15, 216, 26, 16);
        labelPhone.setBounds(15, 247, 85, 16);

        tfEmail.setBounds(114, 61, 146, 19);
        tfPassword.setBounds(114, 92, 146, 19);
        tfName.setBounds(114, 123, 146, 19);
        comboDOB.setBounds(114, 154, 146, 19);
        comboGender.setBounds(114, 185, 146, 19);
        comboTitle.setBounds(114, 216, 146, 19);
        tfPhone.setBounds(114, 247, 146, 19);

        button.setBounds(114, 283, 95, 19);

        labelEmail.setForeground(Color.WHITE);
        labelPassword.setForeground(Color.WHITE);
        labelName.setForeground(Color.WHITE);
        labelDOB.setForeground(Color.WHITE);
        labelGender.setForeground(Color.WHITE);
        labelTitle.setForeground(Color.WHITE);
        labelPhone.setForeground(Color.WHITE);

        button.addActionListener(this);

        panel.add(label1);
        panel.add(labelEmail);
        panel.add(labelPassword);
        panel.add(labelName);
        panel.add(labelDOB);
        panel.add(labelGender);
        panel.add(labelTitle);
        panel.add(labelPhone);
        panel.add(tfEmail);
        panel.add(tfPassword);
        panel.add(tfName);
        panel.add(comboDOB);
        panel.add(comboGender);
        panel.add(comboTitle);
        panel.add(tfPhone);
        panel.add(button);

        panel.setBackground(new Color(85, 132, 172));

        add(panel);
        setVisible(true);
    }

    public void start() {
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        LoginWindow loginWindow = new LoginWindow();

        if (e.getSource() == button) {
            dispose();
            // GO TO LOGIN PAGE
            new LoginWindow();
        }
    }

}
