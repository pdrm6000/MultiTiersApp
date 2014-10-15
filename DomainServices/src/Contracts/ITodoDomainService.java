package Contracts;

import Models.TodoModel;

import java.util.Collection;

/**
 * Created by pablo on 26/08/14.
 */
public interface ITodoDomainService extends IDomainService<TodoModel> {
    Collection<TodoModel> GetModel();
}

