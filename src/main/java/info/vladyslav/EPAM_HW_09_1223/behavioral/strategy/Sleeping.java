package info.vladyslav.EPAM_HW_09_1223.behavioral.strategy;

import info.vladyslav.EPAM_HW_09_1223.behavioral.state.Activity;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
