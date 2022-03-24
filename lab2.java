import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Document_Collection {
    // instace variables
    static String filename;
    static int file_id;
    String dir_path;
    String[] tag = new String[10];

    void doc_fetch() throws Exception {

        // Print the string
        File file = new File("C:\\Users\\josep\\OneDrive\\Desktop\\academics\\java\\lab\\assets\\sample.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file));) {
            System.out.println("\n Document 1:");

            String st;
            int len = 0;
            // Condition holds true till
            // there is character in a string
            while ((st = br.readLine()) != null)

                // Print the string
                System.out.println(st);
            char ch = st.charAt(0);
            .indexOf(ch)

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

public class lab2 {
    public static void main(String[] args) throws Exception {

        Document_Collection dc = new Document_Collection();
        dc.doc_fetch();
    }
}