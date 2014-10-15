package Repositories;

import java.util.Collection;

/**
 * Created by pablo on 26/08/14.
 */
public interface IRepository<T> {
    T GetById(int id);
    Collection<T> GetAll();
    int Add(T entity);
    int Update(T entity);
    int Remove(int id);
}
