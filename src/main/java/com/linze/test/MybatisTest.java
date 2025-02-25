package com.linze.test;

import com.linze.pojo.User;
import com.linze.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1、创建SqlSessionFactory对象，也是单例模式的
        SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
        //2、创建SqlSession对象
        SqlSession session = factory.openSession();
        //3、调用session的方法namespace的名字.id
        List<User> users = session.selectList("user.list");
        //4、打印测试
        for(User u:users){
            System.out.println(u);
        }
        //5、关闭资源
        User user = session.selectOne("user.getUserById", 1);
        System.out.println(user);
        session.close();
    }
}
