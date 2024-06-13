import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class Question2Test {
    @Test
    public void BMITest() {
        // Simulate user input
        String input = "1.75\n70\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Capture the output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Call the main method
        Question2.main(new String[0]);

        // Check the output
        String expectedOutput = "Enter your height: Enter your weight: 22.857142857142858\n";
        assertEquals(expectedOutput, out.toString().trim());
    }
}
