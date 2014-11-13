package Implementations;

import Contracts.ITodoDomainService;
import Models.TodoModel;
import Repositories.IRepository;
import Repositories.TodoBatisRepository;


import java.io.IOException;
import java.util.Collection;
import java.util.Date;

/**
 * Created by pablo on 26/08/14.
 */
public class TodoDomainService implements ITodoDomainService {

    private final IRepository<TodoModel> todoFakeRepository;

    public TodoDomainService(IRepository<TodoModel> todoFakeRepository) throws IOException {
        this.todoFakeRepository = todoFakeRepository;
    }

    @Override
    public Collection<TodoModel> GetModel()
    {
        return todoFakeRepository.GetAll();
    }

    @Override
    public int CreateTodoModel(TodoModel model) {
        model.setAddingDate(new Date());
        return this.todoFakeRepository.Add(model);
    }
}
