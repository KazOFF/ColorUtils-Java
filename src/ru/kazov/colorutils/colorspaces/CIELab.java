/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.kazov.colorutils.colorspaces;

/**
 *
 * @author Kaz
 */
public class CIELab extends ColorSpace {
    protected double L;
    protected double a;
    protected double b;
    
    public CIELab(double L, double a, double b){
        this.L = L;
        this.a = a;
        this.b = b;
    }

    public double getL() {
        return Math.round(L);
    }
    
    public double getL(int c) {
        return rd(L,c);
    }

    public void setL(double L) {
        this.L = L;
    }

    public double getA() {
        return Math.round(a);
    }
    
    public double getA(int c) {
        return rd(a,c);
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return Math.round(b);
    }
    
    public double getB(int c) {
        return rd(b,c);
    }

    public void setB(double b) {
        this.b = b;
    }
}
