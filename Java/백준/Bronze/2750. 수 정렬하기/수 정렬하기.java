import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < num; i++) {
            set.add(Integer.parseInt(br.readLine()));
        }
        for (int n : set) {
            bw.write(n + "\n");
        }
        bw.flush();
        bw.close();
    }
}