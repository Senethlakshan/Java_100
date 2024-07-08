import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    public void testMainMethodOutput() {
        // Redirect System.out to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the main method of Main class
        Main.main(new String[] {});

        // Verify the output
        assertEquals("Hello world!\n", outContent.toString());
    }
}
