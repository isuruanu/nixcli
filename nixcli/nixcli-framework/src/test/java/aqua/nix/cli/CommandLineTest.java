package aqua.nix.cli;

import aqua.nix.cli.command.Echo;
import aqua.nix.cli.screen.DefaultSplash;

import java.util.Arrays;

public class CommandLineTest {
    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine("prompt> ", new DefaultSplash(), Arrays.asList(new Echo()));
        new Thread(commandLine).start();
    }
}
