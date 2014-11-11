package Mappers;

import Models.TodoModel;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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
}


