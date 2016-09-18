package org.avol.httpclient;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by Lovababu on 9/18/2016.
 */
public class HttpClientTransporterTest {

    HttpClientTransporter httpClientTransporter = new HttpClientTransporter();

    @Test
    public void testPost() {
        try {
            httpClientTransporter.invokePost();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPut() {
        try {
            httpClientTransporter.invokePut();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGet() {
        try {
            httpClientTransporter.invokeGet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDelete() {
        try {
            httpClientTransporter.invokeDelete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
