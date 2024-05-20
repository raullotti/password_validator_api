package com.service;

import org.junit.jupiter.api.Test;

import com.passwordvalidator.service.ServicePassword;

import static org.junit.jupiter.api.Assertions.*;

class ServicePasswordTest {

    @Test
    void testValidPassword() {
        assertTrue(ServicePassword.isValid("R@ul3810L")); // Deve retornar true
    }

    @Test
    void testShortPassword() {
        assertFalse(ServicePassword.isValid("R@ul3810")); // Deve retornar false, menos de 9 caracteres
    }

    @Test
    void testNoDigit() {
        assertFalse(ServicePassword.isValid("R@ulL")); // Deve retornar false, sem dígitos
    }

    @Test
    void testNoLowerCase() {
        assertFalse(ServicePassword.isValid("R@UL3810V")); // Deve retornar false, sem letras minúsculas
    }

    @Test
    void testNoUpperCase() {
        assertFalse(ServicePassword.isValid("r@ul3810v")); // Deve retornar false, sem letras maiúsculas
    }

    @Test
    void testNoSpecialChar() {
        assertFalse(ServicePassword.isValid("Raul3810L")); // Deve retornar false, sem caracteres especiais
    }

    @Test
    void testRepeatedChar() {
        assertFalse(ServicePassword.isValid("R@ul3810LL")); // Deve retornar false, 'L' repetido
    }
}
