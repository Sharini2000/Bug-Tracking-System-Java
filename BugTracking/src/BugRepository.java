import java.util.List;
import java.util.ArrayList;
class BugRepository {
    private List<Bug> bugList;

    public BugRepository() {
        this.bugList = new ArrayList<>();
    }

    public void addBug(Bug bug) {
        bugList.add(bug);
    }

    public void updateBugStatus(int bugId, String newStatus) {
        for (Bug bug : bugList) {
            if (bug.getBugId() == bugId) {
                bug.setStatus(newStatus);
                return;
            }
        }
        System.out.println("Bug with ID " + bugId + " not found.");
    }

    public Bug getBugById(int bugId) {
        for (Bug bug : bugList) {
            if (bug.getBugId() == bugId) {
                return bug;
            }
        }
        return null;
    }

    public List<Bug> getAllBugs() {
        return bugList;
    }
}
