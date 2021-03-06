package com.wsw.cloudconsulprovider4001;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangSongWen
 * @Date: Created in 15:32 2021/1/15
 * @Description:
 */
@RestController
public class HelloController {
    @Value("${user.username}")
    private String username;
    @Value("${user.password}")
    private String password;

    @GetMapping("/hello")
    public String hello() {
        return username + ":" + password;
    }
}
