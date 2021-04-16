package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class PalindromeValidatorTest {
	PalindromeValidator validator = new PalindromeValidator();

	@Test
	void Given_aString_When_ValidatingPalindrome_Then_True() {
		// Given
		String string = "a";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);		
		}
}
