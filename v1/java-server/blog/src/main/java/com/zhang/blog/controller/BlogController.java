package com.zhang.blog.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @ClassName BlogController
 * @Description 博客Controller
 * @Author chunjia.zhang
 * @Date 2020/4/16 23:53
 **/

@RestController
@RequestMapping(value = "/blog")
@CrossOrigin
public class BlogController {


    @PostMapping(value = "/test")
    public String test(@RequestBody String req) {

        System.out.println(req);
        return "你好,这个是测试";
    }
}
