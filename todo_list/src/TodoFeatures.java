import java.util.Scanner;
import textio.TextIo;

public class TodoFeatures {
    private String usersName;
    private String todoList;
    private boolean continueInApp;

    Scanner input = new Scanner(System.in);

    public void setUserName(String usersName){
        usersName = input.next();
        this.usersName = usersName;
    }
    public String getUserName(){
        return this.usersName;

    }
    public void setTodoList(String todoList){
        input.useDelimiter("\\t");
        while(true){
            todoList = input.next();
            break;
        }
        this.todoList = todoList;
    }
    public void continueInApp(boolean yesorNo){
         this.continueInApp = yesorNo;
    }
    public boolean continueInApp(){
        return this.continueInApp;
    }
    public void createTxtFileForTodos(){
        TextIo.writeFile("Todos.txt");
        TextIo.putln(this.todoList);
    }

    
}
