package abstractFactory.implementation;

import abstractFactory.CommandingDroid;

public class CommandingDroidImpl implements CommandingDroid {
    public String command() {
        return "Command droid control situation!";
    }
}
