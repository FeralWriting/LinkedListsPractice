package Assignment13B;

public class Assignment13B {
    public static void main(String[] args) {
        PriorityQueue myTasks=new PriorityQueue();
        myTasks.addTask("Rest & Relax over break","high");
        myTasks.addTask("Rate my prof on ratemyprofessor","low");
        myTasks.addTask("Do course evaluations for CSE1322","medium");
        myTasks.addTask("Study for CSE1322L Lab Final","high");
        myTasks.addTask("Plan trip home for holidays","low");
        myTasks.addTask("Study for CSE1322 Final","high");
        myTasks.addTask("Do course evaluations for CSE1322L","medium");

        for(int i=0;i<8;i++) {
            //If you are Java:
            System.out.println(myTasks.getNextTask());
        }
           
    }
}
