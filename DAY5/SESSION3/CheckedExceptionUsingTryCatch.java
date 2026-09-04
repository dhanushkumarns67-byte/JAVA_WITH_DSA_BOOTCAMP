package DAY5.SESSION3;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionUsingTryCatch {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("data.txt")) {
            file.read();
        } catch (IOException e) {
            
        }
    }
}