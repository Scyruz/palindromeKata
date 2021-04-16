package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	
	@Test
	void Given_TwoDifferentLetterString_When_ValidatingPalindrome_Then_False() {
		// Given
		String string = "ab";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = false;
		assertEquals(expectedResult, actualResult);		
		}
	
	@Test
	void Given_TwoEqualLetterString_When_ValidatingPalindrome_Then_True() {
		// Given
		String string = "aa";
		
		// When
		boolean actualResult = validator.validate(string);
		
		// Then
		boolean expectedResult = true;
		assertEquals(expectedResult, actualResult);		
		}
	
	 @Test
	    void Given_ThreeLetterPalindromeString_When_ValidatingPalindrome_Then_True() {
	        // Given
	        String string = "aba";
	        // When
	        boolean actualResult = validator.validate(string);

	        // Then
	        boolean expectedResult = true;
	        assertEquals(expectedResult, actualResult);

	    }
	 
	 @Test
	    void Given_FourLetterPalindromeString_When_ValidatingPalindrome_Then_True() {
	        // Given
	        String string = "abba";
	        // When
	        boolean actualResult = validator.validate(string);

	        // Then
	        boolean expectedResult = true;
	        assertEquals(expectedResult, actualResult);

	    }
	 
	 @Test
	    void Given_FourLetterNonPalindromeString_When_ValidatingPalindrome_Then_False() {
	        // Given
	        String string = "amba";
	        // When
	        boolean actualResult = validator.validate(string);

	        // Then
	        boolean expectedResult = false;
	        assertEquals(expectedResult, actualResult);

	    }

}
