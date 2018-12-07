package com.xxy.sbtest.contorller;

import com.xxy.sbtest.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@RestController
@RequestMapping("/")
public class UserController {
  public static List<User> list=new CopyOnWriteArrayList<>();

@ApiOperation(value = "获取用户信息",notes = "根据url获取用户信息")
@RequestMapping(value = "user",method = RequestMethod.GET)
  public List<User> selectUser(){
      return list;


  }

  @ApiOperation(value = "添加用户信息",notes = "根据Url添加用户信息")
  @ApiImplicitParam(name = "user",value = "User",required = true,dataType = "User")
  @RequestMapping(value = "user",method = RequestMethod.POST)
  public Boolean addUser(@RequestBody User user){
      boolean add = list.add(user);
      return add;
  }
}
