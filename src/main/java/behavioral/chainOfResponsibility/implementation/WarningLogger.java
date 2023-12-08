package behavioral.chainOfResponsibility.implementation;

import behavioral.chainOfResponsibility.LogLvl;

public class WarningLogger extends Logger{
    @Override
    void log(String message) {
        System.err.println(message);
    }

    @Override
    LogLvl getLvl() {
        return LogLvl.WARNING;
    }
}
