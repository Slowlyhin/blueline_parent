package org.slowly.blueline.controller;

import org.slowly.blueline.domain.Employee;
import org.slowlys.blueline.utils.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    /**
     * 参数: Employee
     * 返回值:登录是否成功 AjaxResult
     */

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //传递对象前太都要用json对象{},[],后台通过(@RequestBody
    public AjaxResult login(@RequestBody Employee employee){

        if ("admin".equals(employee.getName())&&"0".equals(employee.getPassword())){
            return AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码不正确!");
    }
}
