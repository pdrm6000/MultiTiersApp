import DataTransferObjects.TodoModelDto;
import Mapping.TodoMapper;
import Services.Contracts.ITodoAppService;
import Services.Implementations.TodoAppService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

/**
 * Created by pablo on 20/08/14.
 */
public class TodoAction {
    private ITodoAppService todoAppService;
    private Collection<TodoModelDto> todoCollection;

    public Collection<TodoModelDto> getTodoCollection() {
        return todoCollection;
    }

    public void setTodoCollection(Collection<TodoModelDto> todoCollection) {
        this.todoCollection = todoCollection;
    }

    public String execute() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        todoAppService = (ITodoAppService)context.getBean("TodoAppService");
        todoCollection = todoAppService.GetTodoModel();
        return "success";
    }
}
