package com.luna.rest;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
@Resource
public class HelloWorld {

    @GET
    public String hello() {
        return "haha";
    }
}
