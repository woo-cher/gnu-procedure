package jhr.corp.gnu.controller;

import jhr.corp.gnu.service.UserService;
import jhr.corp.gnu.vo.LoginVo;
import jhr.corp.gnu.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/search")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService service;

    @RequestMapping(value = "/login")
    public LoginVo search(@RequestBody LoginVo loginVo) {
        logger.info("[parameter] member : {}", loginVo.getClassof());
        logger.info("[parameter] password : {}", loginVo.getPassword());

        loginVo.setCode("10");
        loginVo.setHost("203.255.0.33");
        loginVo.setGroup("SGS");

        service.loginProcedure(loginVo);
        logger.info("result : {}", loginVo);

        return loginVo;
    }

    @RequestMapping(value = "/userinfo")
    public UserVo info(@RequestBody UserVo userVo) {
        logger.info("[parameter] classof : {}", userVo.getClassof());

        service.infoProcedure(userVo);
        logger.info("result : {}", userVo);

        return userVo;
    }
}