package Mapping;

import DataTransferObjects.TodoModelDto;
import Models.TodoModel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by pablo on 19/08/14.
 */
public class TodoMapper implements IGenericMapper<TodoModelDto, TodoModel> {

    public TodoMapper(){

    }

    @Override
    public TodoModelDto Transform(TodoModel param) {
        return new TodoModelDto(param.getDescription(),param.getAddingDate(),param.isDone());
    }

    @Override
    public Collection<TodoModelDto> TransformColection(Collection<TodoModel> paramsArray) {
        ArrayList<TodoModelDto> result = new ArrayList<TodoModelDto>();
        for (TodoModel todo : paramsArray){
            result.add(this.Transform(todo));
        }
        return result;
    }
}
