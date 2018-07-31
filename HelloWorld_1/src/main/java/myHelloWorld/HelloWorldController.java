package myHelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @ClassName HelloWorldController
 * @Description
 * @Author martind
 * @Date 2018/7/31 9:47
 **/
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/doICando", method = RequestMethod.GET,params = "name=top")
    public String sayHello(){

        System.out.println("你好！这个是一个测试");
        return "SpringHello";
    }

    @RequestMapping(value = "**/antStyle")
    public String antStyle(){
        System.out.println("antStyle()方法");
        return "SpringHello";
    }

    /**
     * test add wildcards
     * @param id
     * @return
     */
    @RequestMapping(value = "/testPage/{id}")
    public String testPage(@PathVariable(value = "id") int id){
        System.out.println(id);
        return "success";
    }

    /**
     * test GET method
     *
     *
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/testGet/{id}",method = RequestMethod.GET)
    public String testGet(@PathVariable(value = "id") Integer id){
        System.out.println("the id is : " + id + " information!");
        return "success";

    }

    /**
     * test POST method
     *
     * @return
     */
    @RequestMapping(value = "/testPost",method = RequestMethod.POST)
    public String testPost(){
        System.out.println("you're doing Post operation!");
        return "success";
    }

    /**
     * test the DELETE method
     * this must add the @ResponseBody, I don't know why did it?
     * if there no @ResponseBody ,you will get back "HTTP Status 405 - JSPs only permit GET POST or HEAD" error message
     * @param id
     * @return
     */

    @RequestMapping(value = "/testDelete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String testDelete(@PathVariable(value = "id") Integer id){
        System.out.println("I'm delete number : " + id);
        return "success";
    }

    /**
     * test PUT method
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/testPut/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String testPut(@PathVariable(value = "id") Integer id){
        System.out.println("I'm doing put operation my id is : " + id);
        return "success";
    }
}
