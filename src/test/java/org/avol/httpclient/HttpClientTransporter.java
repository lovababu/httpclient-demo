package org.avol.httpclient;

import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

/**
 * Created by Lovababu on 9/18/2016.
 */
public class HttpClientTransporter {
    private String baseUrl = "http://localhost:8080/httpclient-demo";

    public Object invokePost() throws IOException {
        String requestBody = "dummy body";
        return HttpClientUtil.executeMethod(baseUrl + "/post", HttpClientUtil.Methods.POST, requestBody, null);
    }

    public Object invokePut() throws IOException {
        String requestBody = "dummy body";
        return HttpClientUtil.executeMethod(baseUrl + "/put", HttpClientUtil.Methods.PUT, requestBody, null);
    }

    public Object invokeGet() throws IOException {
        return HttpClientUtil.executeMethod(baseUrl + "/get", HttpClientUtil.Methods.GET, null, null);
    }

    public Object invokeDelete() throws IOException {
        return HttpClientUtil.executeMethod(baseUrl + "/delete", HttpClientUtil.Methods.DELETE, null, null);
    }
}
