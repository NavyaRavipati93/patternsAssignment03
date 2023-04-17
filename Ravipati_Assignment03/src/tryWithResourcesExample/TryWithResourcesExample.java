package tryWithResourcesExample;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream newFile = new FileOutputStream("Example.txt")) {
            String text= "Hello World. This is my java program";
            byte arr[] = text.getBytes();
            newFile.write(arr);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Resource is closed and the message has been written into the Example.text");
}
}
