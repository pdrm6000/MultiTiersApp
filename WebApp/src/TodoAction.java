import DataTransferObjects.TodoModelDto;
import Services.Contracts.ITodoAppService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.opensymphony.xwork2.ActionSupport;



import java.util.Collection;

/**
 * Created by pablo on 20/08/14.
 */
public class TodoAction extends ActionSupport {
    private ITodoAppService todoAppService;
    private Collection<TodoModelDto> todoCollection;
    private TodoModelDto todoEntity;

    public TodoAction()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        todoAppService = (ITodoAppService)context.getBean("TodoAppService");
    }

    public Collection<TodoModelDto> getTodoCollection() {
        return todoCollection;
    }
    public void setTodoCollection(Collection<TodoModelDto> todoCollection) {
        this.todoCollection = todoCollection;
    }

    public TodoModelDto getTodoEntity() {
        return todoEntity;
    }
    public void setTodoEntity(TodoModelDto todoEntity) {
        this.todoEntity = todoEntity;
    }


    public String execute() throws Exception {
        todoCollection = todoAppService.GetTodoModel();
        return "success";
    }

    public String create() throws Exception
    {
        todoAppService.createTodoModel(this.todoEntity);
        return "success";
    }

    public String requestNew() throws Exception
    {
        this.todoEntity = new TodoModelDto("test",null,false);
        return "success";
    }


}
