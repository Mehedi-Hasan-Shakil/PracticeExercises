import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveBlankLines {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        ArrayList<String> temp = new ArrayList<>();
        while (in.hasNextLine()) {
            temp.add(in.nextLine());
        }
        in.close();
        PrintWriter out = new PrintWriter("input.txt");
        for (String s : temp) {
            if (s.length() > 0)
                out.println(s);
        }
        out.close();
    }
}
