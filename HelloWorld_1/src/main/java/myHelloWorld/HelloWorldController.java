package myHelloWorld;

import com.fasterxml.jackson.databind.ObjectMapper;
import myPOJO.Account;
import myPOJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @ClassName HelloWorldController
 * @Description
 * @Author martind
 * @Date 2018/7/31 9:47
 **/

@Controller
@RequestMapping(value = "/springmvc")
public class HelloWorldController {

    @RequestMapping(value = "/test")
    @ResponseBody
    public User testModelMap(){
        User user = new User();
        user.setAddress("福建省厦门市");
        user.setId(100);
        user.setName("Martin");
        return user;
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
    public User testReturn(@RequestBody String user) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        User userRE =  objectMapper.readValue(user, User.class);
        System.out.println(userRE);
        return userRE;
    }
}
