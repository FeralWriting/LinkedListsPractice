package Assignment13B;

public class PriorityQueue {
    LinkedList[] priorityLists = new LinkedList[3];

    public PriorityQueue() {
        priorityLists[0] = new LinkedList();
        priorityLists[1] = new LinkedList();
        priorityLists[2] = new LinkedList();
    }

    public void addTask(String t, String p) {
        if (p.toLowerCase().equals("high")) {
            priorityLists[0].addTask(t);
        } else if (p.toLowerCase().equals("medium")) {
            priorityLists[1].addTask(t);
        } else if (p.toLowerCase().equals("low")) {
            priorityLists[2].addTask(t);
        }
    }

    public String getNextTask() {
        if (!(priorityLists[0].isEmpty())) {
            return priorityLists[0].nextTask();
        } else if (!(priorityLists[1].isEmpty())) {
            return priorityLists[1].nextTask();
        } else if (!(priorityLists[2].isEmpty())) {
            return priorityLists[2].nextTask();
        } else {
            return "No next task";
        }
    }
}
