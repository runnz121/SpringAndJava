package com.springandjava.Test.effectivejava.chatper6.item34;

public enum PayrollDay {
    // MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);
    //
    // private final PayType payType;
    //
    // PayrollDay(PayType payType) {
    //     this.payType = payType;
    // }
    //
    // int pay(int minutesWorked, int payRate) {
    //     return payType.pay(minutesWorked, payRate);
    // }
    //
    //
    // //전략 열거 타입
    // enum PayType {
    //     WEEKDAY {
    //         int overtimePay(int minsWorked, int payRate) {
    //             return minsWroked <= MINS_PER_SHIFT ? 0:
    //                     (minsWorked - MINS_PER_SHIFT) * payRate / 2;
    //         }
    //     },
    //
    //
    //     WEEKEND {
    //
    //     };
    //
    //     abstract int overtimePay(int mins, int payRate);
    //     private static final int MINS_PER_SHIFT = 8 * 60;
    //
    // }
}
