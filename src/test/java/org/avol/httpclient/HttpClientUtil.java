package org.avol.httpclient;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Lovababu on 9/18/2016.
 */
public class HttpClientUtil {

    public enum Methods {
        POST, PUT, GET, DELETE
    }

    public static Object executeMethod(String url, Methods methods, String requestBody, Map<String, String> headers) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        switch (methods) {
            case POST: {
                //handle post here..
                HttpPost httpPost = new HttpPost(url);
                //List<NameValuePair> nvps = new ArrayList<NameValuePair>();
                //nvps.add(new BasicNameValuePair("username", "vip"));
                //nvps.add(new BasicNameValuePair("password", "secret"));
                httpPost.setEntity(new StringEntity(requestBody));
                CloseableHttpResponse postResponse = httpclient.execute(httpPost);

                try {
                    System.out.println(postResponse.getStatusLine());
                    HttpEntity entity2 = postResponse.getEntity();
                    // do something useful with the response body
                    // and ensure it is fully consumed
                    EntityUtils.consume(entity2);
                } catch (Exception e) {
                    //log the exception and throw custom exception.
                } finally {
                    postResponse.close();
                    httpclient.close();
                }
                return "post response";
            }

            case PUT: {
                //handle put here.
                HttpPut httpPut = new HttpPut(url);
                //List<NameValuePair> nvps = new ArrayList<NameValuePair>();
                //nvps.add(new BasicNameValuePair("username", "vip"));
                //nvps.add(new BasicNameValuePair("password", "secret"));
                httpPut.setEntity(new StringEntity(requestBody));
                CloseableHttpResponse putResponse = httpclient.execute(httpPut);

                try {
                    System.out.println(putResponse.getStatusLine());
                    HttpEntity entity2 = putResponse.getEntity();
                    // do something useful with the response body
                    // and ensure it is fully consumed
                    EntityUtils.consume(entity2);
                } catch (Exception e) {
                    //log the exception and throw custom exception.
                } finally {
                    putResponse.close();
                    httpclient.close();
                }
                return "put response";
            }

            case GET: {
                //handle get here.
                HttpGet httpGet = new HttpGet(url);
                CloseableHttpResponse getResponse = httpclient.execute(httpGet);
                try {
                    System.out.println(getResponse.getStatusLine());
                    HttpEntity entity1 = getResponse.getEntity();
                    // do something useful with the response body
                    // and ensure it is fully consumed
                    EntityUtils.consume(entity1);
                } catch (Exception e) {
                    //log the message, and throw custom error.
                } finally {
                    getResponse.close();
                    httpclient.close();
                }
                return "get response";
            }

            case DELETE: {
                //handle delete here.
                HttpDelete httpDelete = new HttpDelete(url);
                CloseableHttpResponse deleteResponse = httpclient.execute(httpDelete);
                try {
                    System.out.println(deleteResponse.getStatusLine());
                } catch (Exception e) {
                    //log the message, and throw custom error.
                } finally {
                    deleteResponse.close();
                    httpclient.close();
                }
                return "delete response";
            }

            default: {
                //invalid method invoked. log message.
                return null;
            }
        }
    }

}
