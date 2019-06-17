package cx.seek.practice.app.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "公共")
@RestController
public class HomeController {

    @GetMapping("/")
    @ApiOperation("服务信息")
    @ApiResponse(code = 200, message = "请求成功")
    public String index() {
        return "Hello, world";
    }
}
