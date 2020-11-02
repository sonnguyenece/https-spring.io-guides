package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
//Cần add 2 dependency sau

//Cho hamcrest
//<dependency>
//<groupId>org.hamcrest</groupId>
//<artifactId>hamcrest</artifactId>
//</dependency>
//
//Cho junit test
//<dependency>
//<groupId>junit</groupId>
//<artifactId>junit</artifactId>
//<version>4.12</version>
//<scope>test</scope>
//</dependency>

public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
//        Dùng để test xem param1 vs param 2 có khớp với nhau ko
        assertThat(greeter.sayHello(), containsString("Hello"));
    }

    @Test
    public void greeterSaysHelloFail() {
        assertThat(greeter.sayHello(), containsString("Hello1"));
    }
}
