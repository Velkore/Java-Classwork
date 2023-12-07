// Write a Java program that reads data from a text file named "input.txt" and prints it to the console.
// Ensure that you handle any potential exceptions that may arise during file handling.

public class FileRead {
    public static void main(String[] args) throws Exception {

        // Create a new string object to hold the line
        String line = null;

        try {
            // Create a new reader object using the FileReader class from java.io
            java.io.FileReader reader = new java.io.FileReader("input.txt");

            // Create a new buffer object using the BufferedReader class from java.io
            java.io.BufferedReader buffer = new java.io.BufferedReader(reader);

            // Read the file line by line
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }

            buffer.close();
            reader.close();
        }

        // File does not exist exception
        catch (java.io.FileNotFoundException e) {
            System.out.println("File does not exist");
            e.printStackTrace();
        }

        // Additional exception handling
        catch (Exception e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}