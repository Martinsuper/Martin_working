package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloWorldController
 * @Description
 * @Author luyao.duan
 * @Date 2018/7/30 17:45
 **/
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    public String hello(){
        System.out.println("Sping MVC !");
        return "HelloWorld";
    }
}
