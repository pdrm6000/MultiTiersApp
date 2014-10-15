package Models;

import java.util.Date;

/**
 * Created by pablo on 19/08/14.
 */
public class TodoModel {
    private String description;
    private Date creationDate;
    private boolean isDone;

    public TodoModel(String description, Date creationDate, boolean isDone) {
        this.description = description;
        this.creationDate = creationDate;
        this.isDone = isDone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
}
