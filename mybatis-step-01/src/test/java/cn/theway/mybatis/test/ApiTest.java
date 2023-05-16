package cn.theway.mybatis.test;

import cn.theway.mybatis.binding.MapperProxyFactory;
import cn.theway.mybatis.test.dao.IUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by candy on 2023/5/16.
 */
public class ApiTest {

    private final Logger log = LoggerFactory.getLogger(ApiTest.class);

    @org.junit.Test
    public void test_MapperProxyFactory() {
        MapperProxyFactory<IUserDao> factory = new MapperProxyFactory<>(IUserDao.class);
        Map<String, String> sqlSession = new HashMap<>();

        sqlSession.put("cn.theway.mybatis.test.dao.IUserDao.queryUserName", "模拟执行 Mapper.xml 中sql语句的操作: 查询用户姓名");
        sqlSession.put("cn.theway.mybatis.test.dao.IUserDao.queryUserAge", "模拟执行 Mapper.xml 中sql语句的操作: 查询用户年龄");
        IUserDao userDao = factory.newInstance(sqlSession);

        String res = userDao.queryUserName("1001");
        log.info("测试结果: {}", res);
    }
}

