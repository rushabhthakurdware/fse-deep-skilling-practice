package com.example.agent;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MyServiceTest {
    @Test
    public void TestMyService(){
        ExternalApi mock = mock(ExternalApi.class);

        MyService ser = new MyService(mock);
        ser.fetchData();

        verify(mock).getData();
    }
}
