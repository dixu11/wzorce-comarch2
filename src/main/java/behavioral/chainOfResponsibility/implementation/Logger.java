package behavioral.chainOfResponsibility.implementation;

import behavioral.chainOfResponsibility.LogLvl;

public abstract class Logger {

    private Logger nextLogger;


    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(String message, LogLvl lvl) {
        if (lvl == getLvl()) {
            log(message);
        } else if (nextLogger != null) {
            nextLogger.log(message, lvl);
        }
    }

    abstract void log(String message);

   abstract LogLvl getLvl();
}
