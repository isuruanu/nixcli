package aqua.nix.cli;

import aqua.nix.cli.command.Echo;
import aqua.nix.cli.screen.DefaultSplash;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: isuruanu
 * Date: 9/19/13
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class App {
    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine("prompt> ", new DefaultSplash(), Arrays.asList(new Echo()));
        new Thread(commandLine).start();
    }
}
