import edu.ucsd.cs110.temperature.Temperature;
import edu.ucsd.cs110.temperature.toCelsius;
import junit.framework.TestCase;

public class toCelsiusTest extends TestCase{
    private float delta = 0.001f;

    public void testCelsius(){
        float value = 12.34f;
        toCelsius temp = new toCelsius(value);

        assertEquals(value, temp.getValue(), delta);
    }

    public void testCelsiusToString(){
        float value = 12.34f;

        toCelsius temp = new toCelsius(value);
        String string = temp.toString();

        String beginning = "" + value;
        String ending = " C";

        // Verify the suffix of the formatted string
        assertTrue(string.startsWith(beginning));

        // Verify the prefix of the formatted string
        assertTrue(string.endsWith(ending));

        // Verify the middle of the formatted string
        int endIndex = string.indexOf(ending);

        // (Hint: what is the length of the middle of the string?)
        assertTrue(string.substring(0, endIndex).equals(beginning));
    }

    public void testCelsiusToCelsius()
    {
        toCelsius temp = new toCelsius(0);
        Temperature convert = temp.toCelsius();
        assertEquals(0, convert.getValue(), delta);
    }

    public void testCelsiusToFahrenheit(){
        toCelsius temp = new toCelsius(0);

        Temperature convert = temp.toFahrenheit();
        assertEquals(32, convert.getValue(), delta);

        temp = new toCelsius(100);
        convert = temp.toFahrenheit();

        assertEquals(212, convert.getValue(), delta);
    }
}