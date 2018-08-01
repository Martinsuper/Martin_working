package myHelloWorld;

import myPOJO.Account;
import myPOJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @ClassName HelloWorldController
 * @Description
 * @Author martind
 * @Date 2018/7/31 9:47
 **/

@Controller
@RequestMapping(value = "/springmvc")
@SessionAttributes(value = {"city"},types={String.class})
public class HelloWorldController {

    @RequestMapping(value = "/testModelMap")
    public String testModelMap(ModelMap  modelMap){
        modelMap.addAttribute("city","China");
        return "success";
    }
    @RequestMapping("/result")
    public String testResult(){
        return "Result";
    }


    @RequestMapping(value = "/testViewAndViewResolver")
    public String testViewAndViewResolver(){
        System.out.println("testViewAndViewResolver");
        return "success";
    }
    @RequestMapping(value = "/testA")
    public String testA(){
        return "internal";
    }
}
