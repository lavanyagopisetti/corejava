import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class FirstTest {
@RepeatedTest(3)
@DisplayName("Testing")
@Test
void display() {
System.out.println("Hello");  
  }
}