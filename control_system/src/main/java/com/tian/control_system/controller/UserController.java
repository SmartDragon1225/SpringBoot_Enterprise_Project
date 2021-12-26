package com.tian.control_system.controller;
import com.tian.control_system.common.ResponseServer;
import com.tian.control_system.mapper.UserMapper;
import com.tian.control_system.pojo.User;
import com.tian.control_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取用户信息接口 http://localhost:8080/user/getUserInfo
     */
    @GetMapping("/getUserInfo")
    public ResponseServer findUserInfo(User user){
        User user1 = userService.login(user);
        if(user1 != null){
            return ResponseServer.success("登录成功!");
        }
        return ResponseServer.error(501,"错误！");
    }

    /**
     * 登录接口  http://localhost:8080/user/login?username=?&password=?
     * @param username
     * @param password
     * @return
     */
    @GetMapping("/login")
    public ResponseServer login(@RequestParam("username") String username,
                                @RequestParam("password") String password){
        User user1 = userService.toLogin(username,password);
        if(user1 != null){
            return ResponseServer.success();
        }
        return ResponseServer.error(501,"错误！");
    }

    /**
     * 修改用户密码接口 http://localhost:8080/user/updatePasswd&userId=?@password=?
     * @param userId
     * @param password
     * @return
     */
    @PostMapping("/updatePasswd")
    public ResponseServer updatePwd(@RequestParam("userId") Integer userId,
                                    @RequestParam("password") String password){
        int updatePwd = userService.updatePwd(userId, password);
        User user = userMapper.select(updatePwd);
        if(updatePwd != 0){
            return ResponseServer.success(user);
        }
        return ResponseServer.error(500,"密码修改失败");
    }
}
