import textio.TextIo;

public class App  {
    public static void main(String[] args){
        TodoInterface userInterface = new TodoInterface();
        boolean continueInApp;

        do{
            userInterface.todo();
            System.out.println("do you want to continue in app( Enter yes or no)");
            continueInApp = TextIo.getlnBoolean();
        }while(continueInApp);
    }
}

