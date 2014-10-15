package Mappers;

import Models.TodoModel;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

/**
 * Created by pablo on 8/10/14.
 */
public interface TodoMapper {
    @Select("SELECT * FROM TodoDB.tasks")
    Collection<TodoModel> selectAllTodoModel();
}


