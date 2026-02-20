import java.util.*;
import java.io.*;

class Main{
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> titles = new ArrayList<>();
    static ArrayList<String> descriptions = new ArrayList<>();
    static final String FILE = "tasks.txt";

    static void getDataFromFile(){
        try{
            File file = new File(FILE);
            if(file.exists()){
                Scanner sc = new Scanner(FILE);
                while(sc.hasNextLine()){
                    String tempTitle = sc.nextLine();
                    String tempDescription = sc.nextLine();
                    titles.add(tempTitle);
                    descriptions.add(tempDescription);
                }
            }
            else{
                System.out.println("File not found. Creating new.");
            }
        }
        catch (Exception e1){
            System.out.println(e1.getMessage());
        }
    }

    static void saveDataToFile(){
        try{
            PrintWriter printWriter = new PrintWriter(new FileWriter(FILE));
            for (int i = 0; i < titles.size(); i++){
                printWriter.println(titles.get(i));
                printWriter.println(descriptions.get(i));
            }
        }
        catch (Exception e2){
            System.out.println(e2.getMessage());
        }
    }

    static void displayTitles(){
        for(String s : titles){
            System.out.println(s);
        }
    }

    static void displayDescriptions(){
        for(String s : descriptions){
            System.out.println(s);
        }
    }

    static void displayTasksAndDetails(){
        for (int i = 0; i < titles.size(); i++){
            System.out.println(titles.get(i));
            System.out.println(descriptions.get(i));
            System.out.println();
        }
    }

    static void addTask(){
        System.out.print("Enter task name: ");
        String taskIn = input.nextLine();
        System.out.print("Enter task description: ");
        String descIn = input.nextLine();
        titles.add(taskIn);
        descriptions.add(descIn);
        saveDataToFile();
    }

    public static void main() {
        System.out.println("Welcome to Java To-do app");
        int choice = 0;
        while(choice != 6){
            System.out.println("\nMenu");
            System.out.println("1. Display all titles.");
            System.out.println("2. Display all descriptions");
            System.out.println("3. Display all tasks with details");
            System.out.println("4. Add a task");
            System.out.println("5. Remove a task");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();
            if(choice == 1){
                displayTitles();
            }
            else if(choice == 2){
                displayDescriptions();
            }
            else if(choice == 3){
                displayTasksAndDetails();
            }
        }
    }
}