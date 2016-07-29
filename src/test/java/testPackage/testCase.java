package testPackage;
import com.jayway.restassured.RestAssured;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by 58 on 2016/7/12.
 */
public class testCase {
    private static Logger logger = LogManager.getLogger("HelloWorld");
    @BeforeTest

    public void setUp(){
        RestAssured.baseURI = "http://oss.xxxx.test.58v5.cn";
        RestAssured.port = 80;
//        RestAssured.basePath = "/login";

    }

    @Test
    public void login(){
        logger.debug("Will not show``````````````` ");
        logger.error("hello will you show");
        logger.info("test","don't not catch me");
//        System.out.print(response);
//        Log.(response);

    }
}
