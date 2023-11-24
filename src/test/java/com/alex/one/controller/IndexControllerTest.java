package com.alex.one.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class IndexControllerTest {

    @Mock
    private IndexController indexController;

    @Test
    void hello() {
        when(indexController.hello()).thenReturn("Hello!");
        String result = indexController.hello();
        assertThat(result).isEqualTo("Hello!");
    }
}