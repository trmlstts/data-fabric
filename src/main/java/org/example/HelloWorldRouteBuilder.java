package org.example;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer://hello?period=5000")
                .routeId("hello-world")
                .setBody().constant("Hello, World!")
                .log("${body}");
    }
}