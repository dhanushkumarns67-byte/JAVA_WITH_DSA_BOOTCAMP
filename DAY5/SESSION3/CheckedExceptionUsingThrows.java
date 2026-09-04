package DAY5.SESSION3;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionUsingThrows {
    public static void openFile() throws IOException {
        try (FileReader file = new FileReader("data.txt")) {
            file.read();
        }
    }

    public static void main(String[] args) {
        try {
            openFile();
        } catch (IOException e) {
            System.out.println("File not Found");
        }
    }
}