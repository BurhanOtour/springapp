package otour.learn.springapp;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
    private PrintStream print;

    public SlayDragonQuest(PrintStream print) {
        this.print = print;
    }

    public void embark() {
        print.println("Embarking on quest to slay the dragon!");
    }
}
