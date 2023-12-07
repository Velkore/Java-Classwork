// Write a Java program that writes data to a text file named "input.txt" and prints out the results of the success/failure
// of each step to the console.
// Ensure that you handle any potential exceptions that may arise during file handling.

public class FileWrite {
    public static void main(String[] args) throws Exception {

        try {
            // Create a new file object using the File class from java.io
            java.io.File file = new java.io.File("input.txt");

            // Check if file already exists
            if (file.exists()) {
                System.out.println("File already exists");
                System.exit(0);
            }

            // Create a new file and write to it
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            output.println("Joshua Smith");
            output.println("Keiser University");
            output.println("Java Programming");
            output.close();
            System.out.println("File created successfully");
        }

        // Exception handling
        catch (Exception e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
