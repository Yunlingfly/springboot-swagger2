package cn.yunlingfly.springbootswagger.controller;

import io.swagger.annotations.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Api(value = "后台首页控制器")
@RestController
public class HomeController {

    @ApiOperation(value = "后台框架页面", notes = "后台框架，包含头部信息，左侧导航，脚部信息")
    @RequestMapping(value = "/home", method = {RequestMethod.GET, RequestMethod.POST})
//该注解可以单个用
//@ApiImplicitParam(name = "id", value = "其实这是演示api",defaultValue = "0", required = true, dataType = "Long", paramType = "path")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "其实这是演示api", defaultValue = "0", required = true, dataType = "Long", paramType = "path"),})
//该注解可以单个用
//@ApiResponse(code = 400, response=String.class, message = "Invalid user supplied")
    @ApiResponses({@ApiResponse(code = 400, response = String.class, message = "Invalid request type"), @ApiResponse(code = 500, message = "server is error")})

    public String home(
            @ApiParam(required = true, name = "model", value = "本次用来封装左侧导航菜单") Model model
            , HttpSession session) throws Exception {
        return "common/index";
    }
}