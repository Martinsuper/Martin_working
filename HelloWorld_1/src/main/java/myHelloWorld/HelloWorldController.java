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
// 失败的尝试……
//@SessionAttributes(value = {"city"},types={String.class})
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

    /**
     * 形参名字和我们请求参数名称一致，可以省略RequestParam
     * 如果不一致要求@RequestParam标记名必须通过value属性制定绑定请求参数名称。
     * @RequestParam ：
     * value 请求参数名称
     * required:请求参数是否为必须的
     * @param a
     * @param b
     * @return
     */
    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "id") Integer a, @RequestParam(value = "name") String b){
        System.out.println(a);
        System.out.println(b);
        return "success";
    }

    /**
     * pojo绑定对象参数
     * @param user
     * @return
     */
    @RequestMapping(value = "/testPOJO")
    public String testPOJO(User user){
        System.out.println(user);
        return "success";
    }

    /**
     * 获取请求头部信息
     * @param a
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept") String a,@RequestHeader("User-Agent") String b){

        System.out.println(a);
        System.out.println(b);

        return "success";
    }

    /**
     * 获取Cookies
     * @param id
     * @return
     */
    @RequestMapping("/testCookiesValues")
    public String testCookiesValues(@CookieValue("JSESSIONID") String id){

        System.out.println(id);
//        System.out.println(b);

        return "success";
    }

    /**
     * 获取原生servletAPI
     * @param request
     * @param respose
     * @return
     */
    @RequestMapping(value = "/testServletAPI")
    public String testServletAPI(HttpServletRequest request, HttpServletResponse respose){
        System.out.println(request);
        System.out.println(respose);

        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        // ModelAndView 模型数据的值，是放到Request范围当中
        mv.addObject("name","Martin");
        return mv;
    }

    @RequestMapping(value = "/testMap")
    public String testMap(Map<String,Object> map){
        map.put("age",12);
        return "success";
    }
    @RequestMapping(value = "/testModel")
    public String testMap(Model model){
        model.addAttribute("mail","martindly@163.com");
        return "success";
    }
    @RequestMapping(value = "/testModelMap")
    public String testModelMap(ModelMap  modelMap){
        modelMap.addAttribute("city","China");
        return "success";
    }
    @RequestMapping("/result")
    public String testResult(){
        return "Result";
    }
    @ModelAttribute
    public void start(Map<String,Object> map){
        Account account = new Account(123,"Tom","2016-1-1");
        map.put("test_Martin",account);
    }
    @RequestMapping(value = "testModelAttribute")
    public String update(@ModelAttribute(value = "test_Martin") Account account){
        System.out.println(account);

        return "success";
    }
}
