package cn.theway.mybatis.test.dao;

/**
 * Created by candy on 2023/5/16.
 */
public interface IUserDao {

    String queryUserName(String uId);

    Integer queryUserAge(String uId);
}
