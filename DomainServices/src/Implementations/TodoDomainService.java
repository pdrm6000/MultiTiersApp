package Implementations;

import Contracts.ITodoDomainService;
import Models.TodoModel;
import Repositories.IRepository;
import Repositories.TodoBatisRepository;
import Repositories.TodoFakeRepository;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by pablo on 26/08/14.
 */
public class TodoDomainService implements ITodoDomainService {

    private IRepository<TodoModel> todoFakeRepository;

    public TodoDomainService(IRepository<TodoModel> todoFakeRepository){
        this.todoFakeRepository = todoFakeRepository;
    }

    @Override
    public Collection<TodoModel> GetModel()
    {
        return todoFakeRepository.GetAll();
    }
}
