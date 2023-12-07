// Write a Java program that deletes a folder named Java2 that contains a text file named "input.txt" and prints result to the console.
// Ensure that you handle any potential exceptions that may arise during file handling. 

public class FolderDeletion {
    public static void main(String[] args) {
        try {
            // Create a new file object using the File class from java.io
            java.io.File file = new java.io.File("Java2/input.txt");

            // Create a new folder object using the File class from java.io
            java.io.File folder = new java.io.File("Java2");

            // Check if file already exists
            if (!file.exists()) {
                System.out.println("File does not exist");
                System.exit(0);
            }

            // Check if folder already exists
            if (!folder.exists()) {
                System.out.println("Folder does not exist");
                System.exit(0);
            }

            // Delete the folder
            folder.delete();
            System.out.println("File deleted successfully");
        }

        catch (Exception e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
