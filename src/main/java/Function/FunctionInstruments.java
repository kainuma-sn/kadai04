package Function;

import Run.RunAccordion;
import Run.RunViollin;

public class FunctionInstruments {
    public void start() {
        RunViollin viollin = new RunViollin();
        Thread threadViollin = new Thread(viollin);

        RunAccordion accordion = new RunAccordion();
        Thread threadAccordion = new Thread(accordion);

        threadViollin.start();
        threadAccordion.start();

    }
}
