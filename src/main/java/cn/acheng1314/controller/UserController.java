package cn.acheng1314.controller;

import cn.acheng1314.dao.UserDao;
import cn.acheng1314.domain.ResponseObj;
import cn.acheng1314.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zqchen on 16/12/8.
 */
@Controller
@RequestMapping("/mvc")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/findUser",method = RequestMethod.GET)
    public ModelAndView findOnebyId() {
        User user = new User();
        user.setLoginId("pc147852369");
        User one = userDao.findOneById(user.getLoginId());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", one);
        modelAndView.setViewName("/static/view/index");
        return modelAndView;
    }
}
