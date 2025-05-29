package MotorPH;

/**
 *
 * @Karla Missy
 */
import javax.swing.*;  // Swing components like JFrame, JButton
import java.awt.*;     // Layouts like FlowLayout, GridLayout

public class EmployeeGUI extends JFrame {
    private JTextField txtEmployeeNumber, txtFirstName, txtLastName;
    private JButton btnSave;

    public EmployeeGUI() {
        setTitle("MotorPH Employee Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Employee Number:"));
        txtEmployeeNumber = new JTextField(20);
        add(txtEmployeeNumber);

        add(new JLabel("First Name:"));
        txtFirstName = new JTextField(20);
        add(txtFirstName);

        add(new JLabel("Last Name:"));
        txtLastName = new JTextField(20);
        add(txtLastName);

        btnSave = new JButton("Save");
        add(btnSave);

        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeGUI();
    }
}

