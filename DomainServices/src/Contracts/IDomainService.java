package Contracts;

import java.util.Collection;

public interface IDomainService<T> {
    Collection<T> GetModel();
    int CreateTodoModel(T model);
}
