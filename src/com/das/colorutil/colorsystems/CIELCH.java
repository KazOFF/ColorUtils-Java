/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.das.colorutil.colorsystems;

/**
 *
 * @author Kaz
 */
public class CIELCH extends ColorSystem {
    protected double L;
    protected double C;
    protected double H;
    
    public CIELCH(double L, double C, double H){
        this.L = L;
        this.C = C;
        this.H = H;
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

    public double getC() {
        return Math.round(C);
    }
    
    public double getC(int c) {
        return rd(C,c);
    }

    public void setC(double C) {
        this.C = C;
    }

    public double getH() {
        return Math.round(H);
    }
    
    public double getH(int c) {
        return rd(H,c);
    }

    public void setH(double H) {
        this.H = H;
    }
}
