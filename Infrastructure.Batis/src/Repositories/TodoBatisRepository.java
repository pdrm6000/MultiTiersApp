package Repositories;

import Mappers.TodoMapper;
import Models.TodoModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;


/**
 * Created by pablo on 8/10/14.
 */
public class TodoBatisRepository implements IRepository<TodoModel> {

    private final SqlSessionFactory sqlSessionFactory;

    public TodoBatisRepository() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Override
    public TodoModel GetById(int id) {
        return null;
    }

    @Override
    public Collection<TodoModel> GetAll() {
        SqlSession session = sqlSessionFactory.openSession();
        Collection<TodoModel> result = null;
        try {
            TodoMapper mapper = session.getMapper(TodoMapper.class);
            result = mapper.selectAllTodoModel();
        } finally {
            session.close();
        }
        return result;
    }

    @Override
    public int Add(TodoModel entity) {
        SqlSession session = sqlSessionFactory.openSession();
        int result = 0;
        try {
            TodoMapper mapper = session.getMapper(TodoMapper.class);
            result = mapper.insertTodoModel(entity);
            session.commit();
        } finally {
            session.close();
        }
        return result;
    }

    @Override
    public int Update(TodoModel entity) {
        return 0;
    }

    @Override
    public int Remove(int id) {
        return 0;
    }
}
