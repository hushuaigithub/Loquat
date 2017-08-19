package com.luna.chatroot;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

public class TuringRobot {
    private static String baseUrl = "http://www.tuling123.com/openapi/api";
    private static HttpClient httpClient = HttpClientBuilder.create().build();


    public static void main(String[] args) throws Exception {
        String body = "{\n" +
                "    \"key\":\"d17e5dbf42114be9a5cd5ecd5c563877\",\n" +
                "    \"info\":\"你爸爸叫什么\",\n" +
                "    \"userid\":\"1234\"\n" +
                "}";

        HttpPost req = new HttpPost(baseUrl);

        List<Header> headers = new ArrayList<Header>();
//        headers.add(new BasicHeader("头部信息", 值));
        req.setHeaders(headers.toArray(new Header[0]));
        req.addHeader(HTTP.CONTENT_TYPE, "application/json");//请求参数为JSON格式

        StringEntity entity = new StringEntity(body, "UTF-8");
        req.setEntity(entity);

        HttpResponse resp = httpClient.execute(req);
        HttpEntity respEntity = resp.getEntity();//获得返回数据
        String text = EntityUtils.toString(respEntity, "UTF-8");

        System.out.println(">>>>"+text);
    }

}