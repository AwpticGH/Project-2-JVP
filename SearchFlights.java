package program;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.BoxLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SearchFlights extends JFrame implements ActionListener {

    MyMouseListener mouseListener = new MyMouseListener();

    protected JRadioButton radioSingleTrip = new JRadioButton("One Way / Round-Trip", true);
    private JLabel lblSingleTrip = new JLabel("One-Way / Round-Trip");

    private JLabel lblFrom = new JLabel("From");
    protected JTextField tfFrom = new JTextField();

    private JLabel lblTo = new JLabel("To");
    protected JTextField tfTo = new JTextField();

    private JLabel lblPassenger = new JLabel("No. of Passengers");

    private JLabel lblAdult = new JLabel("Adult");
    private JLabel lblChild = new JLabel("Child");
    private JLabel lblInfant = new JLabel("Infant");

    private Image imgButtonUp;
    private Image newImgButtonUp;
    private Image imgButtonDown;
    private Image newImgButtonDown;

    private ImageIcon iconButtonUp;
    private ImageIcon iconButtonDown;

    private JButton btnAdultDown = new JButton();
    private JButton btnAdultUP = new JButton();
    private JButton btnChildDown = new JButton();
    private JButton btnChildUP = new JButton();
    private JButton btnInfantDown = new JButton();
    private JButton btnInfantUP = new JButton();

    private JTextField tfAdult = new JTextField("1");
    private JTextField tfChild = new JTextField("0");
    private JTextField tfInfant = new JTextField("0");

    private String adultText = " " + tfAdult.getText() + " Adult, ";
    private String childText = tfChild.getText() + " Child, ";
    private String infantText = tfInfant.getText() + " Infant";

    private JTextField tfPassenger = new JTextField(adultText + childText + infantText);

    private JLabel lblDepart = new JLabel("Departure Date");
    protected JTextField tfDepart = new JTextField("Click Here");

    protected JCheckBox checkReturn = new JCheckBox("Return Date");
    private JLabel lblReturn = new JLabel("Return Date");
    protected JTextField tfReturn = new JTextField("Click Here");

    private JLabel lblSeatClass = new JLabel("Seat Class");
    private String[] seatClassList = {"-", "Economy", "Premium Economy", "Business", "First Class"};
    protected JComboBox comboSeatClass = new JComboBox(seatClassList);

    private Image imgSearch;
    private Image newImgSearch;
    protected JButton btnSearch;

    private JPanel mainPanel = new JPanel();
    private JPanel panelPassenger = new JPanel();
    private JPanel panelAdultPass = new JPanel();
    private JPanel panelChildPass = new JPanel();
    private JPanel panelInfantPass = new JPanel();

    SearchFlights() {
        setTitle("Search Your Flight");
        setSize(800, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        try {
            imgSearch = ImageIO.read(getClass().getResource("/Search.png"));
            newImgSearch = imgSearch.getScaledInstance(15, 15, Image.SCALE_SMOOTH);

            imgButtonUp = ImageIO.read(getClass().getResource("/Plus.png"));
            newImgButtonUp = imgButtonUp.getScaledInstance(30, 20, Image.SCALE_SMOOTH);

            imgButtonDown = ImageIO.read(getClass().getResource("/Minus.png"));
            newImgButtonDown = imgButtonDown.getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        }
        catch (Exception e) {
        }

        iconButtonUp = new ImageIcon(newImgButtonUp);
        iconButtonDown = new ImageIcon(newImgButtonDown);

        btnSearch = new JButton( "Search Flight", new ImageIcon(newImgSearch));

        // BUTTON UP
        btnAdultUP.setIcon(iconButtonUp);
        btnChildUP.setIcon(iconButtonUp);
        btnInfantUP.setIcon(iconButtonUp);

        btnAdultUP.setFocusable(false);
        btnChildUP.setFocusable(false);
        btnInfantUP.setFocusable(false);

        btnAdultUP.setOpaque(false);
        btnChildUP.setOpaque(false);
        btnInfantUP.setOpaque(false);

        btnAdultUP.setContentAreaFilled(false);
        btnChildUP.setContentAreaFilled(false);
        btnInfantUP.setContentAreaFilled(false);

        btnAdultUP.setBorderPainted(false);
        btnChildUP.setBorderPainted(false);
        btnInfantUP.setBorderPainted(false);

        // BUTTON DOWN
        btnAdultDown.setIcon(iconButtonDown);
        btnChildDown.setIcon(iconButtonDown);
        btnInfantDown.setIcon(iconButtonDown);

        btnAdultDown.setFocusable(false);
        btnChildDown.setFocusable(false);
        btnInfantDown.setFocusable(false);

        btnAdultDown.setOpaque(false);
        btnChildDown.setOpaque(false);
        btnInfantDown.setOpaque(false);

        btnAdultDown.setContentAreaFilled(false);
        btnChildDown.setContentAreaFilled(false);
        btnInfantDown.setContentAreaFilled(false);

        btnAdultDown.setBorderPainted(false);
        btnChildDown.setBorderPainted(false);
        btnInfantDown.setBorderPainted(false);

        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(149, 209, 204));
        radioSingleTrip.setBackground(new Color(149, 209, 204));
        checkReturn.setBackground(new Color(149, 209, 204));

        radioSingleTrip.setFocusable(false);
        radioSingleTrip.setEnabled(false);
        checkReturn.setFocusable(false);
        btnSearch.setFocusable(false);

        tfReturn.setVisible(false);

        panelPassenger.setBounds(492, 134, 244, 115);
        panelPassenger.setBackground(Color.WHITE);

        panelPassenger.setLayout(new BoxLayout(panelPassenger, BoxLayout.Y_AXIS));
        panelAdultPass.setLayout(new FlowLayout());
        panelChildPass.setLayout(new FlowLayout());
        panelInfantPass.setLayout(new FlowLayout());

        panelAdultPass.add(lblAdult);
        panelAdultPass.add(btnAdultDown);
        panelAdultPass.add(tfAdult);
        panelAdultPass.add(btnAdultUP);

        panelChildPass.add(lblChild);
        panelChildPass.add(btnChildDown);
        panelChildPass.add(tfChild);
        panelChildPass.add(btnChildUP);

        panelInfantPass.add(lblInfant);
        panelInfantPass.add(btnInfantDown);
        panelInfantPass.add(tfInfant);
        panelInfantPass.add(btnInfantUP);

        panelAdultPass.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panelChildPass.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panelInfantPass.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        tfPassenger.setFocusable(false);
        tfAdult.setFocusable(false);
        tfChild.setFocusable(false);
        tfInfant.setFocusable(false);

        panelAdultPass.setBackground(Color.WHITE);
        panelChildPass.setBackground(Color.WHITE);
        panelInfantPass.setBackground(Color.WHITE);

        panelAdultPass.setSize(274, 43);
        panelChildPass.setSize(274, 43);
        panelInfantPass.setSize(274, 43);

        panelPassenger.add(panelAdultPass);
        panelPassenger.add(panelChildPass);
        panelPassenger.add(panelInfantPass);
        panelPassenger.setVisible(false);

        comboSeatClass.setFocusable(false);
        tfReturn.setFocusable(false);
        tfDepart.setFocusable(false);

        radioSingleTrip.setBounds(50, 27, 150, 30);
        lblSingleTrip.setBounds(76, 27, 150, 33);
        lblFrom.setBounds(47, 63, 43, 25);
        tfFrom.setBounds(47, 91, 179, 43);
        lblTo.setBounds(261, 63, 31, 17);
        tfTo.setBounds(261, 91, 179, 43);
        lblPassenger.setBounds(491, 63, 105, 16);
        tfPassenger.setBounds(491, 91, 247, 43);
        lblDepart.setBounds(47, 226, 94, 16);
        tfDepart.setBounds(47, 249, 179, 43);
        checkReturn.setBounds(261, 223, 100, 21);
        lblReturn.setBounds(292, 226, 75, 16);
        tfReturn.setBounds(261, 249, 179, 43);
        lblSeatClass.setBounds(491, 226, 62, 16);
        comboSeatClass.setBounds(491, 249, 247, 43);
        btnSearch.setBounds(288, 363, 211, 47);

        checkReturn.addActionListener(this);
        btnSearch.addActionListener(this);
        btnAdultUP.addActionListener(this);
        btnAdultDown.addActionListener(this);
        btnChildUP.addActionListener(this);
        btnChildDown.addActionListener(this);
        btnInfantUP.addActionListener(this);
        btnInfantDown.addActionListener(this);

        tfPassenger.addMouseListener(mouseListener);
        tfDepart.addMouseListener(mouseListener);
        tfReturn.addMouseListener(mouseListener);

        mainPanel.add(radioSingleTrip);
//        mainPanel.add(lblSingleTrip);
        mainPanel.add(lblFrom);
        mainPanel.add(tfFrom);
        mainPanel.add(lblTo);
        mainPanel.add(tfTo);
        mainPanel.add(lblPassenger);
        mainPanel.add(tfPassenger);
        mainPanel.add(lblDepart);
        mainPanel.add(tfDepart);
        mainPanel.add(checkReturn);
//        mainPanel.add(lblReturn);
        mainPanel.add(tfReturn);
        mainPanel.add(lblSeatClass);
        mainPanel.add(comboSeatClass);
        mainPanel.add(btnSearch);

        mainPanel.add(panelPassenger);

        setContentPane(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkReturn) {
            if (checkReturn.isSelected()) {
                tfReturn.setVisible(true);
            } else {
                tfReturn.setVisible(false);
            }
        }

        if (e.getSource() == btnAdultUP) {
            int passenger = Integer.parseInt(tfAdult.getText());
            passenger++;
            String newPassenger = Integer.toString(passenger);
            tfAdult.setText(newPassenger);
            adultText = " " + tfAdult.getText() + " Adult, ";
            tfPassenger.setText(adultText + childText + infantText);
        }

        if (e.getSource() == btnAdultDown) {
            int passenger = Integer.parseInt(tfAdult.getText());
            if (passenger >= 2) {
                passenger--;
                String newPassenger = Integer.toString(passenger);
                tfAdult.setText(newPassenger);
                adultText = " " + tfAdult.getText() + " Adult, ";
                tfPassenger.setText(adultText + childText + infantText);
            }
        }

        if (e.getSource() == btnChildUP) {
            int passenger = Integer.parseInt(tfChild.getText());
            passenger++;
            String newPassenger = Integer.toString(passenger);
            tfChild.setText(newPassenger);
            childText = tfChild.getText() + " Child, ";
            tfPassenger.setText(adultText + childText + infantText);
        }

        if (e.getSource() == btnChildDown) {
            int passenger = Integer.parseInt(tfChild.getText());
            if (passenger >= 1) {
                passenger--;
                String newPassenger = Integer.toString(passenger);
                tfChild.setText(newPassenger);
                childText = tfChild.getText() + " Child, ";
                tfPassenger.setText(adultText + childText + infantText);
            }
        }

        if (e.getSource() == btnInfantUP) {
            int passenger = Integer.parseInt(tfInfant.getText());
            passenger++;
            String newPassenger = Integer.toString(passenger);
            tfInfant.setText(newPassenger);
            infantText = tfInfant.getText() + " Infant";
            tfPassenger.setText(adultText + childText + infantText);
        }

        if (e.getSource() == btnInfantDown) {
            int passenger = Integer.parseInt(tfInfant.getText());
            if (passenger >= 1) {
                passenger--;
                String newPassenger = Integer.toString(passenger);
                tfInfant.setText(newPassenger);
                infantText = tfInfant.getText() + " Infant";
                tfPassenger.setText(adultText + childText + infantText);
            }
        }

        if (e.getSource() == btnSearch) {
//            setSearchResult();
            dispose();
            new SearchResultWindow();
        }
    }

    class MyMouseListener implements MouseListener {

        DatePicker datePicker;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == tfPassenger) {
                if (panelPassenger.isVisible()) {
                    panelPassenger.setVisible(false);
                    lblSeatClass.setVisible(true);
                } else {
                    panelPassenger.setVisible(true);
                    lblSeatClass.setVisible(false);
                }
            }

            if (e.getSource() == tfDepart) {
                datePicker = new DatePicker(tfDepart);
                datePicker.setDialogueTitle("Departure Date");
                tfDepart.setText(datePicker.setPickedDate());
            }

            if (e.getSource() == tfReturn) {
                datePicker = new DatePicker(tfReturn);
                datePicker.setDialogueTitle("Return Date");
                tfReturn.setText(datePicker.setPickedDate());
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    class TextEntered {

    }

    class SearchResultTopPanel extends JPanel {

        SearchResultWindow parent;

        private JPanel panel;

        private final JLabel lblFrom = new JLabel(tfFrom.getText()); // tfFrom.getText();
        private final JLabel lblTo = new JLabel(tfTo.getText()); // tfTo.getText();

        private Image imgArrow;
        private Image newImgArrow;
        private JLabel iconArrow;

        private JLabel lblDate = new JLabel(); // tfDepart.getText();
        private JLabel lblNoOfPass = new JLabel();
        private JLabel lblSeatClass = new JLabel();

        private Image imgSearch;
        private Image newImgSearch;
        private JButton buttonSearch;

        SearchResultTopPanel(SearchResultWindow parent) {

            this.parent = parent;

            setBackground(new Color(149, 209, 204));

            setLocation(parent.getLocation());
            setSize(parent.getWidth(), (parent.getHeight())/3);

            setLayout(null);

            try {
                imgArrow = ImageIO.read(getClass().getResource("/Arrow.png"));
                newImgArrow = imgArrow.getScaledInstance(25, 10, Image.SCALE_SMOOTH);

                imgSearch = ImageIO.read(getClass().getResource("/Search.png"));
                newImgSearch = imgSearch.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
            }
            catch (Exception e){

            }
            iconArrow = new JLabel(new ImageIcon(newImgArrow));
            buttonSearch = new JButton("Change Search", new ImageIcon(newImgSearch));

            lblFrom.setBounds(20, 44, 105, 21);
            iconArrow.setBounds(165, 55, 20, 10);
            lblTo.setBounds(227, 44, 76, 21);
            lblDate.setBounds(20, 97, 86, 18);
            lblNoOfPass.setBounds(112, 97, 123, 18);
            lblSeatClass.setBounds(242, 97, 67, 18);
            buttonSearch.setBounds(557, 54, 231, 47);

            lblFrom.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblTo.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            lblNoOfPass.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            lblSeatClass.setFont(new Font("Times New Roman", Font.PLAIN, 16));

            buttonSearch.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    parent.dispose();
                    new SearchFlights();
                }
            });

            add(lblFrom);
            add(iconArrow);
            add(lblTo);
            add(lblDate);
            add(lblNoOfPass);
            add(lblSeatClass);
            add(buttonSearch);

            setVisible(true);
        }
    }
}