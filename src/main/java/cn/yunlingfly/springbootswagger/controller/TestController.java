package cn.yunlingfly.springbootswagger.controller;

import cn.yunlingfly.springbootswagger.bean.TestBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("usersController相关的api")
public class TestController {
    @ApiOperation(value = "login", notes = "登录")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    // 用户登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Integer id) {
        return "success"+id;
    }

    @ApiOperation(value = "add", notes = "添加")
    // 用户登录
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String add(@RequestBody TestBean bean) {
        return "success"+bean.getId();
    }
}
