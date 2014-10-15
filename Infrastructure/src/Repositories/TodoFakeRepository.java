package Repositories;

import Models.TodoModel;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 * Created by pablo on 26/08/14.
 */
public class TodoFakeRepository implements IRepository<TodoModel> {

    public TodoFakeRepository(){

    }

    @Override
    public TodoModel GetById(int id) {
        return null;
    }

    @Override
    public Collection<TodoModel> GetAll() {
        return  Arrays.asList(
                new TodoModel("Learn to deal with Collections", new Date(2014, 5, 1), false),
                new TodoModel("Learn to divide applications in tiers", new Date(2014, 8, 18), false),
                new TodoModel("Learn coding guidelines in java", new Date(2014, 1, 1), false));
    }

    @Override
    public int Add(TodoModel entity) {
        return 0;
    }

    @Override
    public int Update(TodoModel entity) {
        return 0;
    }

    @Override
    public int Remove(int id) {
        return 0;
    }
}
