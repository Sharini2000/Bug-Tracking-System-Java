import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bug {
    private int bugId;
    private String description;
    private String status;
    private String priority;

    // Constructor
    public Bug(int bugId, String description, String status, String priority) {
        this.bugId = bugId;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    // Getter and Setter methods

    public int getBugId() {
        return bugId;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugId=" + bugId +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
