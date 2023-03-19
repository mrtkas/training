package rockpaperscissors;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    private static final String FILE_NAME = "rating.txt";

    public FileReader() {
    }

    public ArrayList<User> readFile() {
        ArrayList<User> userList = new ArrayList<>();
        File file = new File(FILE_NAME);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String userName = scanner.next();
                int score = scanner.nextInt();
                userList.add(new User(userName, score));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        return userList;
    }
}
