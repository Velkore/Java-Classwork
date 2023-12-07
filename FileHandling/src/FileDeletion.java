// Write a Java program that deletes a text file named "input.txt" that resides inside a folder called Keiser.
// Ensure that you handle any potential exceptions that may arise during file handling. 

public class FileDeletion {
    public static void main(String[] args) {
        try {
            // Create a new file object using the File class from java.io
            java.io.File file = new java.io.File("Keiser/input.txt");

            // Check if file already exists
            if (!file.exists()) {
                System.out.println("File does not exist");
                System.exit(0);
            }

            // Delete the file
            file.delete();
            System.out.println("File deleted successfully");
        }

        // Exception handling
        catch (Exception e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
