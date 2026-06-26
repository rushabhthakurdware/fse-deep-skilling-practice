package com.example.agent;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServiceTest {
    @Test
    public void testExternalApi(){
        ExternalApi mock = mock(ExternalApi.class);
        when(mock.getData()).thenReturn("Mock ata");
        MyService service = new MyService(mock);
        String res = service.fetchData();
        Assertions.assertEquals("Mock Data",res,"test case passed");
    }
}
