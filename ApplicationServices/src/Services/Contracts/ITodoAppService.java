package Services.Contracts;

import DataTransferObjects.TodoModelDto;
import java.util.Collection;

/**
 * Created by pablo on 19/08/14.
 */
public interface ITodoAppService {
    public Collection<TodoModelDto> GetTodoModel();
    int createTodoModel(TodoModelDto todoEntity);
}
