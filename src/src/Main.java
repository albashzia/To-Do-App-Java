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

    public static void main() {
    }
}