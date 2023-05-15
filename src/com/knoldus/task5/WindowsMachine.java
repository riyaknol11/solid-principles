package com.knoldus.task5;

public class WindowsMachine {
    public final Keyboard keyboard;
    public final Monitor monitor;

    //instances of the Keyboard and Monitor classes to the WindowsMachine constructor using constructor injection.
    public WindowsMachine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}

