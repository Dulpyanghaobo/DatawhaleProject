package cn.datawhale.app.xyz.ViewController;

import cn.datawhale.app.xyz.PoJo.User;
import cn.datawhale.app.xyz.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import cn.datawhale.app.xyz.Util.*;
import java.util.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/findAll")
    public Result findAll(){
        Result result = new Result(StatusCode.OK,"查询成功",userService.findAll());
        return result;
    }
    @RequestMapping(value = "/addUser",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Result addUser(@RequestBody User user){
        userService.add(user);
        Result result = new Result(StatusCode.OK,"添加成功",new Object[]{});
        return result;
    }

}
