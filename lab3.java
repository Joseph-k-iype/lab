import java.io.*;
import java.util.Scanner;
import java.lang.*;

class Document_Collection {
    // instace variables
    public static String filename;
    static int file_id;
    static String dir_path;
    String finst;

    String res = "";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[32m";

    int a, b;
    String[] tag = new String[10];

    static {
        System.out.println("\n Welcome to Document complier for researchers ");
    }

    void selectdoc() throws FileNotFoundException
    
    {
        File path = new File("C:\\Users\\josep\\OneDrive\\Desktop\\academics\\java\\lab\\assets\\");

        File [] files = path.listFiles();
        String finstring;

        for (int i = 0; i < files.length; i++){
            if (files[i].isFile()){ //this line weeds out other directories/folders
                System.out.println(files[i]);
                filename = files[0].toString();

            }
        }   
    }
    void doc_fetch(String filename) throws Exception {

      

        // Print the string
        File file = new File(filename);
        try (BufferedReader br = new BufferedReader(new FileReader(file));) {
            System.out.println("\n Document 1:");

            String st = "";
            int len = 0;
            // Condition holds true till
            // there is character in a string
            while ((st = br.readLine()) != null) {

                finst = st.toString();

                // Print the string
                System.out.println(finst);
            }
            System.out.println("\n Provide index to highlight");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            res = finst.substring(a, b);
            String newString = finst.substring(0, a + 1) + ANSI_YELLOW + res + ANSI_RESET + finst.substring(a + 1);
            System.out.println("\n Highlighted doc is: \n" + newString);
        }

    }

    void doc_store() {

    }

    void doc_sync() {

    }

    void doc_stack() {

    }

    void track_update() {

    }

}

class Document_Annotation {
    int temp;
    int[] index = new int[50];
    String[] colors = new String[5];

    void doc_highlight() {

    }

    void doc_comment() {

    }

    void doc_store() {

    }

    void share() {

    }

}

class citation {
    String source;
    int[] citeId = new int[50];
    int[] formatterId = new int[50];
    String formatter;

    void citation_formatter() {

    }

    void formats() {

    }

    void source_store() {

    }

    void auto_suggest() {

    }

    void footnote() {

    }

    void endnote() {

    }
}

class Archive {
    int docId, delDocId;
    static String filename;
    static int file_id;
    String dir_path;
    String[] tag = new String[10];

    void doc_fetch() {

    }

    void doc_store() {

    }

    void doc_sync() {

    }

    void delete_doc() {

    }

    void track_update() {

    }
}

class cloud {
    String uname, pwd, iam;
    int sync_thread;
    static String filename;
    static int file_id;
    String dir_path;
    String[] tag = new String[10];

    void sync() {

    }

    void doc_store() {

    }

    void doc_stack() {

    }

    void track_update() {

    }
}

public class lab3 {
    public static void main(String[] args) throws Exception {
        String filename = "";
        Document_Collection dc = new Document_Collection();
        dc.selectdoc();
        dc.doc_fetch(filename);
    }
}