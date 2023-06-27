import javax.swing.*;

public class LoginGUIFrame {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("Login");

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default operation when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel object
        JPanel panel = new JPanel();

        // Create JLabels for username and password
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        // Create JTextFields for username and password
        JTextField usernameField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);

        // Create a JButton for login
        JButton loginButton = new JButton("Login");

        // Add components to the panel
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
