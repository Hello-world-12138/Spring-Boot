package amk.com.springbootpart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 阿明楷
 * @Date 2025/10/29:17:36
 * @See:
 */
@Controller
@ResponseBody
public class HelloController {

    @GetMapping("hello")
    public String ret(){
        return "hello";
    }
}
