package cn.sockstack.springcloudcourses.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses/")
public class CoursesController {

    @GetMapping("{id}")
    @ResponseBody
    public String get(@PathVariable String id) {
        return "hello world! " + id;
    }
}
