package org.example.mybatis.mapper;

import org.apache.ibatis.session.SqlSession;
import org.example.mybatis.mapper.SelectMapper;
import org.example.mybatis.util.SqlSessionUtil;
import org.junit.jupiter.api.Test;

/**
 * @author 未確認の庭師
 */
class SelectMapperTest {

    @Test
    void selectUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.selectUserById(1));
    }

    @Test
    void selectAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.selectAllUser());
    }

    @Test
    void selectCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.selectCount());
    }

    @Test
    void selectUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.selectUserByIdToMap(1));
    }

    @Test
    void selectAllUserToList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.selectAllUserToMap());
    }

    @Test
    void SelectAllUserToList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        selectMapper.selectAllUserToList().forEach(System.out::println);
    }
}