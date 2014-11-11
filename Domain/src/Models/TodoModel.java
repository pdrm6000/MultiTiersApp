package Models;

import java.util.Date;

/**
 * Created by pablo on 19/08/14.
 */
public class TodoModel {
    private String description;
    private Date addingDate;
    private boolean isDone;

    public TodoModel(){

    }
    public TodoModel(String description, Date addingDate, boolean isDone) {
        this();
        this.description = description;
        this.addingDate = addingDate;
        this.isDone = isDone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(Date addingDate) {
        this.addingDate = addingDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
}
