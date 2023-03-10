package com.bridgelabz.exception.userregistration;

import org.junit.Assert;
import org.junit.Test;

import exception.InvalidEmailException;
import exception.InvalidFirstNameException;
import exception.InvalidLastNameException;
import exception.InvalidMobileNumberException;
import exception.InvalidPasswordException;

public class UserInputValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidFirstName("akshatha");
            Assert.assertEquals(true, result);
        } catch (InvalidFirstNameException e) {
        }
    }
    @Test
    public void givenFirstName_WhenShort_ShouldThrowException() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidFirstName("Pr");
        } catch (InvalidFirstNameException e) {
            Assert.assertEquals("Please enter valid input.", e.getMessage());
        }
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidLastName("Akshatha");
        } catch (InvalidLastNameException e) {
            Assert.assertEquals(true, result);
        }
    }

    @Test
    public void givenLastName_WhenShort_ShouldThrowException() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidLastName("Ka");
        } catch (InvalidLastNameException e) {
            Assert.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WithSplChar_ShouldThrowException() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidLastName("A@sthuli");
        } catch (InvalidLastNameException e) {
            Assert.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WithNumber_ShouldThrowException() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidLastName("A23tiu8i");
        } catch (InvalidLastNameException e) {
            Assert.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidEmail("kpragna.25@gmail.com");
        } catch (InvalidEmailException e) {
            Assert.assertEquals(true, result);
        }
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldThrowException() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidEmail("Akshath..675.gmail.com");
        } catch (InvalidEmailException e) {
            Assert.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidMobileNumber("91 9110237054");
        } catch (InvalidMobileNumberException e) {
            Assert.assertEquals(true, result);
        }
    }

    @Test
    public void givenMobileNum_WhenNotProper_ShouldThrowException() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidMobileNumber("908765-4321908");
        } catch (InvalidMobileNumberException e) {
            Assert.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidPassword("P@ssw0rd");
        } catch (InvalidPasswordException e) {
            Assert.assertEquals(true, result);
        }
    }

    @Test
    public void givenPassword_WithoutCapitalLetter_ShouldThrowException() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidPassword("kfslkjnj@");
        } catch (InvalidPasswordException e) {
            Assert.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WithoutNumericValue_ShouldReturnFalse() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidPassword("bsdj@HhcsBB");
        } catch (InvalidPasswordException e) {
            Assert.assertEquals("Please enter valid input.", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WithoutSplChar_ShouldThrowException() {
        UserInputValidation  userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
            result = userInputValidation.isValidPassword("Pvhs5665vhj");
        } catch (InvalidPasswordException e) {
            Assert.assertEquals("Please enter valid input.", e.getMessage());
        }
    }
}