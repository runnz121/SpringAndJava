package com.springandjava.Test.effectivejava.chatper6.item38;

public enum BasicOperation implements Operation{
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    };

    private final String symbol;

    //this.symbol = 이 클래스 기반으로 생성된 인스턴스 // 매개변수, 맴버변수와 이름 구별
    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        return symbol;
    }
}
