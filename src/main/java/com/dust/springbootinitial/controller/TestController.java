package com.dust.springbootinitial.controller;

import com.alibaba.fastjson.JSONObject;
import com.dust.springbootinitial.base.Result;
import com.dust.springbootinitial.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    TestService testService;

    /**
     * 测试地址  <a href="http://localhost/test/path1?param=abc">
     *
     * @param path  请求路径
     * @param value 请求参数值
     * @return Result<JSONObject>
     */
    @GetMapping("/{path}")
    public Result<JSONObject> test(@PathVariable("path") String path, @RequestParam(name = "param") String value) {
        String queryResult = testService.test(path, value);
        if (queryResult == null) return new Result<>(-1, "error", null);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", queryResult);
        return new Result<>(0, "success", jsonObject);
    }

}
