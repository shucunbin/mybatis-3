package pers.cbshu.demo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pers.cbshu.demo.mapper.CnArea2019Mapper;
import pers.cbshu.demo.po.CnArea2019;

import java.io.IOException;
import java.io.InputStream;

/**
 * 测试入口类.
 *
 * @author shucunbin
 * @date 2020/10/20 15:39
 */
public class Main {
  public static void main(String[] args) throws IOException {
    InputStream inputStream = Resources.getResourceAsStream("resources/mybatis-config.xml");

    SqlSessionFactory sqlSessionFactory;
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = null;
    try {
      sqlSession = sqlSessionFactory.openSession();
      CnArea2019Mapper mapper = sqlSession.getMapper(CnArea2019Mapper.class);
      CnArea2019 cnArea2019 = mapper.selectByPrimaryKey(1);
      System.out.println(cnArea2019);
      sqlSession.commit();

    } catch (Exception e) {
      if (sqlSession != null) {
        sqlSession.rollback();
      }
    } finally {
      if (sqlSession != null) {
        sqlSession.close();
      }
    }
  }
}
