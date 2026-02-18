import java.util.*;
import java.io.*;

class Main{
    static ArrayList<String> titles = new ArrayList<>();
    static ArrayList<String> descriptions = new ArrayList<>();
    static final String FILE = "tasks.txt";

    static void getDataFromFile(){
        try{
            File file = new File(FILE);

        }
        catch (Exception e1){
            System.out.println(e1.getMessage());
        }
    }

    static void saveDataToFile(){

    }

    public static void main() {

    }
}