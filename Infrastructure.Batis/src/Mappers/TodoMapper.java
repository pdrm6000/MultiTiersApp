package Mappers;

import Models.TodoModel;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

/**
 * Created by pablo on 8/10/14.
 */
public interface TodoMapper {
    @Select("SELECT * FROM TodoDB.tasks")
    @Results({
            @Result(column="description", property="description"),
            @Result(column="creationDate", property="addingDate"),
            @Result(column="isDone", property="isDone")
            })
    Collection<TodoModel> selectAllTodoModel();

    @Insert("insert into TodoDB.tasks (description, creationDate, isDone) values (#{description},#{addingDate},#{isDone})")
    @Options(useGeneratedKeys = true, keyProperty="id")
    int insertTodoModel(TodoModel todoModel);
}


