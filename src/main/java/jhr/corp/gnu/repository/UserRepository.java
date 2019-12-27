package jhr.corp.gnu.repository;

import jhr.corp.gnu.vo.LoginVo;
import jhr.corp.gnu.vo.UserVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepository {

    @Autowired
    private SqlSession sqlSession;

    public Map<String, String> login(LoginVo userDto) {
        return sqlSession.selectOne("loginProcedure", userDto);
    }

    public Map<String, String> info(UserVo userVo) {
        return sqlSession.selectOne("infoProcedure", userVo);
    }
}
