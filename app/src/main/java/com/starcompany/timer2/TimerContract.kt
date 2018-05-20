package com.starcompany.timer2

interface TimerContract {
    interface view {
        fun showTimer()

    }

    interface presenter {
        fun newTimer(time: Int)

    }
}
