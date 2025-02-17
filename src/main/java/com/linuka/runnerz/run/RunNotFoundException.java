package com.linuka.runnerz.run;

public class RunNotFoundException extends RuntimeException {
    public RunNotFoundException() {
        super("Run not found");
    }


}
