package myHelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloWorldController
 * @Description
 * @Author martind
 * @Date 2018/7/31 9:47
 **/
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/doICando")
    public String sayHello(){

        System.out.println("你好！这个是一个测试");
        return "SpringHello";
    }

}
