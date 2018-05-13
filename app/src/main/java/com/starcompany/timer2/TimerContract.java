package com.starcompany.timer2;

public interface TimerContract {
    public interface view {
        void showTimer();

    }

    public interface presenter {
        void newTimer(int time);

    }
}
