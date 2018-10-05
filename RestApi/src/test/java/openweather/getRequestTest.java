package openweather;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getRequestTest {
    @Test
    public void testResponsecode(){
       Response response= RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London," +
                "uk&appid=b6907d289e10d714a6e88b30761fae22");
       int c = response.getStatusCode();
        Assert.assertEquals(c, 200);
    }
    @Test
    public void testResponseBody(){
        Response response= RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London," +
                "uk&appid=b6907d289e10d714a6e88b30761fae22");
        String body = response.asString();
        System.out.println("The body is "+ body);
        long time = response.getTime();
        System.out.println("Get response time: "+ time);
    }
}
