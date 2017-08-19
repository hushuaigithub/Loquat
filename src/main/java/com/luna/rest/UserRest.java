package com.luna.rest;

import com.luna.domain.User;
import com.luna.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.UUID;

/**
 * Created by xuhao on 2017/5/30.
 */
@Path("/user")
@Resource
public class UserRest {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRest.class);

    @Autowired
    private UserService userService;

    @POST
    public void addUser(@QueryParam("nickName") String nickName,
                        @QueryParam("email") String email) {
        User user = new User();
        user.setNickName(nickName);
        user.setEmail(email);
        user.setAge(22);
        user.setHeight(180);
        user.setUserId(UUID.randomUUID());
        user.setSex("男");
        user.setHeadPortrait("xuhao");
        userService.addUser(user);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser() {
        LOGGER.info("UserRest.getUser");
        List<User> list = userService.getUserList();
        return Response.ok(list).build();
    }

    @GET
    @Path("{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserById(@PathParam("userId") UUID userId) {
        User user = userService.getUserById(userId);
        return Response.ok(user).build();
    }
}
