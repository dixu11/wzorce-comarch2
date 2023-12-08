package behavioral.chainOfResponsibility.implementation;

import behavioral.chainOfResponsibility.LogLvl;

public class DebugLogger  extends Logger{


    @Override
    void log(String message) {
        System.out.println(message.toLowerCase());
    }

    @Override
    LogLvl getLvl() {
        return LogLvl.DEBUG;
    }
}
