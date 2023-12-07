// Write an application that displays a JFrame containing these two phases:
// “I love Java Programming” & “Java Programming is fun!”.

public class LoveJavaQuotes {
    public static void main(String[] args) throws Exception {

        try {
            // Create a new JFrame object from the javax.swing.JFrame class
            javax.swing.JFrame frame = new javax.swing.JFrame("Love Java Quotes");

            // Set the default values for the JFrame object
            frame.setSize(200, 200);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            // Set the layout of the JFrame object
            frame.setLayout(new java.awt.FlowLayout());

            // Create two new JLabel objects from the javax.swing.JLabel class
            javax.swing.JLabel label1 = new javax.swing.JLabel("I love Java Programming");
            javax.swing.JLabel label2 = new javax.swing.JLabel("Java Programming is fun!");

            // Add the JLabel objects to the JFrame object
            frame.add(label1);
            frame.add(label2);

            // Exception handling
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
