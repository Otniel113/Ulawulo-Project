import java.util.*;
public class Project {
    Manager manager;
    private String nameProject;
    private Programmer[] listProgrammer;
    private Task[] listTask;
    private int numProgrammer = 0;
    private int maxProgrammer;

    public Project(Manager manager, String nameProject, int maxProgrammer) {
        setManager(manager);
        setNameProject(nameProject);
        setMaxProgrammer(maxProgrammer);
        this.listProgrammer = new Programmer[maxProgrammer];
       
    }
    
    public void createTugas(String nameProject, int maxTugas){
        Task task = new Task(nameProject, maxTugas);
    }
    
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public int getNumProgrammer() {
        return numProgrammer;
    }

    public void setNumProgrammer(int numProgrammer) {
        this.numProgrammer = numProgrammer;
    }

    public int getMaxProgrammer() {
        return maxProgrammer;
    }

    public void setMaxProgrammer(int maxProgrammer) {
        this.maxProgrammer = maxProgrammer;
    }
    
    public void addTask(Programmer programmer, String task){
        
    }
    
    public void addProgrammer(Programmer programmer){
        if(numProgrammer < maxProgrammer){
            this.listProgrammer[numProgrammer] = programmer;
            numProgrammer++;
        }
    }
}
