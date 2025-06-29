package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Mock ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub getData() to return "Mock Data"
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into MyService
        MyService service = new MyService(mockApi);

        // Step 4: Assert fetchData() returns the stubbed value
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
