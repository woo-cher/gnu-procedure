package jhr.corp.gnu.service;

import jhr.corp.gnu.vo.LoginVo;
import jhr.corp.gnu.repository.UserRepository;
import jhr.corp.gnu.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Map<String, String> loginProcedure(LoginVo userDto) {
        return repository.login(userDto);
    }

    public Map<String, String> infoProcedure(UserVo userVo) {
        return repository.info(userVo);
    }
}
