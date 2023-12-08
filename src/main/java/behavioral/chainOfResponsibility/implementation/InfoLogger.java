package behavioral.chainOfResponsibility.implementation;

import behavioral.chainOfResponsibility.LogLvl;

public class InfoLogger extends Logger{
    @Override
    void log(String message) {
        System.out.println(message.toUpperCase());
    }

    @Override
    LogLvl getLvl() {
        return LogLvl.INFO;
    }
}
