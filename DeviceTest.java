package com.github.fhdo7100003.ha;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class DeviceTest {

    private Device device;
    private Logger mockLogger;

    @BeforeEach
    void setUp() {
        mockLogger = mock(Logger.class); // Use Mockito to mock the Logger class
        device = new Device("TestDevice", mockLogger);
    }

    @Test
    void testLogEnergyProducer() {
        device.logEnergy(100, true);

        // Verify that the log method was called with the expected arguments
        verify(mockLogger).log("TestDevice", "produced", "value", 100);
    }

    @Test
    void testLogEnergyConsumer() {
        device.logEnergy(50, false);

        // Verify that the log method was called with the expected arguments
        verify(mockLogger).log("TestDevice", "consumed", "value", 50);
    }
}




