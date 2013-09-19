package aqua.nix.cli;

import java.io.*;

/**
 * Hello world!
 */
public class App {


    private static final String prompt = ">";

    public static void main(String[] args) throws IOException {

        BufferedReader splashTxtReader =
                new BufferedReader(new InputStreamReader(App.class.getClassLoader().getResourceAsStream("splash.txt")));

        String line = splashTxtReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = splashTxtReader.readLine();
        }


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    System.out.print(prompt);
                    String line = null;
                    try {
                        line = reader.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.print(prompt);
                    System.out.println(line);
                }
            }
        }).start();

    }
}
