package com.mayara;

public class Calculadora {
    Double vlr1;
    Double vlr2;
    Double result;

    public Double getVlr1() {
        return vlr1;
    }

    public void setVlr1(Double vlr1) {
        this.vlr1 = vlr1;
    }

    public Double getVlr2() {
        return vlr2;
    }

    public void setVlr2(Double vlr2) {
        this.vlr2 = vlr2;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    void soma() {
        setResult(getVlr1() + getVlr2());
    }

    void subtracao() {
        setResult(getVlr1() - getVlr2());
    }

    void divisao() throws DivisionByZeroException {
        if (getVlr2() == 0) {
            throw new DivisionByZeroException();
        }
        setResult(getVlr1() / getVlr2());
    }

    void multiplicacao() {
        setResult(getVlr1() * getVlr2());
    }
}
