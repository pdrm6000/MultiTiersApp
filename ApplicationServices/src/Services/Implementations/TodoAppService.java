package Services.Implementations;

import Contracts.ITodoDomainService;
import DataTransferObjects.TodoModelDto;
import Implementations.TodoDomainService;
import Mapping.IGenericMapper;
import Models.TodoModel;
import Services.Contracts.ITodoAppService;

import java.util.*;

/**
 * Created by pablo on 19/08/14.
 */
public class TodoAppService implements ITodoAppService {

    private IGenericMapper<TodoModelDto, TodoModel> mapper;
    private ITodoDomainService domainService;

    public TodoAppService(IGenericMapper<TodoModelDto, TodoModel> mapper, ITodoDomainService domainService) {
        this.mapper = mapper;
        this.domainService = domainService;
    }

    @Override
    public Collection<TodoModelDto> GetTodoModel() {
        Collection<TodoModel> result = domainService.GetModel();
        return this.mapper.TransformColection(result);
    }

    @Override
    public int createTodoModel(TodoModelDto todoEntity) {
        return this.domainService.CreateTodoModel(this.mapper.TransformReverse(todoEntity));
    }
}
