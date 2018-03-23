package com.yjl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjl.entity.User;
import com.yjl.service.RedisService;

/**
 * 控制类
 * @author junliang.yi
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private RedisService redisService;
	@RequestMapping("/get")
	public @ResponseBody User getRedis(String key) {
		
		return (User) redisService.get("y");
	}
	
	//添加用户
    @RequestMapping("/adduser")
    public @ResponseBody String addUser( @RequestParam String userName, @RequestParam String password) {
    	System.out.println("进入添加方法");
        User user = new User();
        user.setPassword(password);
        user.setUserName(userName);
        System.out.println(user);
        //redisService.set("y", user);
        redisService.set("a", user);
        return "Saved success";
    }
    @RequestMapping("/addStr")
    public @ResponseBody String addStr(@RequestParam String userName,@RequestParam String password) {
    	redisService.setStr(userName, password);
    	return "添加字符串成功!!";
    }
    
    @RequestMapping("/getStr")
    public @ResponseBody String getStr() {
    	return redisService.getStr("cs");
    }

}
