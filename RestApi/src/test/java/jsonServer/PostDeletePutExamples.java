package jsonServer;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostDeletePutExamples {
    @Test   //************ Implementation of POST *********************
    public void testPost(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();
        json.put("id",86);
        json.put("title","Selenium");
        json.put("author","riadhul islam");
        request.body(json.toString());
        Response response = request.post("http://localhost:3000/posts");
        int code = response.getStatusCode();
        Assert.assertEquals(code, 201);
    }

    @Test   //************ Implementation of DELETE ******************
    public void testDelete(){
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://localhost:3000/posts/1");
        int code = response.getStatusCode();
        Assert.assertEquals(code, 200);
    }

    @Test   //************ Implementation of PUT ******************
    public void testPut(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject json = new JSONObject();
        json.put("id",86);
        json.put("title","Selenium-Basics");
        json.put("author","riadhul islam");
        request.body(json.toString());
        Response response = request.put("http://localhost:3000/posts/86");
        int code = response.getStatusCode();
        Assert.assertEquals(code, 200);
    }
}
