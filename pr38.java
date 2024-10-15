import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  

public class pr38 extends JFrame {

    public pr38() {
        // Create the container (JFrame)
        setTitle("Component Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to organize components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Select your preferences:");

        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("I agree to the terms");

        // Create a button
        JButton button = new JButton("Submit");

        // Create a text field
        JTextField textField = new JTextField(10);

        // Create a radio button group
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String gender = rb1.isSelected() ? "Male" : rb2.isSelected() ? "Female" : "Not selected";
                boolean agreed = checkBox.isSelected();

                // Display message when button is clicked
                JOptionPane.showMessageDialog(null, "Name: " + name + "\nGender: " + gender + "\nAgreed: " + agreed);
            }
        });

        // Add components to the panel
        panel.add(label);
        panel.add(rb1);
        panel.add(rb2);
        panel.add(textField);
        panel.add(checkBox);
        panel.add(button);

        // Add panel to the frame
        add(panel);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new pr38();
    }
}
