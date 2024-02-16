import java.util.Scanner;


public class TodoInterface {
    private String userName;
    private String createTodos;

    Scanner input = new Scanner(System.in);
    TodoFeatures features = new TodoFeatures();
    public void todo(){
        System.out.println("TODO-LIST");
        System.out.println("welcome, enter your first name");
        features.setUserName(userName);
        System.out.println("welcome " + features.getUserName() +", click to enter to continue");
        input.nextLine();
        System.out.println("Enter your to-do list to save after completion of entering press'tab' to end");
        features.setTodoList(createTodos);
        features.createTxtFileForTodos();

    }
}
