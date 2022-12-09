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
public class HSL extends ColorSpace {
    protected double H;
    protected double S;
    protected double L;
    
    public HSL(double H, double S, double L) {
        this.H = H;
        this.S = S;
        this.L = L;
    }

    public double getH() {
        return Math.round(H);
    }
    
    public double getH(int c){
        return rd(H,c);
    }

    public void setH(double H) {
        this.H = H;
    }

    public double getS() {
        return Math.round(S);
    }
    
    public double getS(int c){
        return rd(S,c);
    }

    public void setS(double S) {
        this.S = S;
    }

    public double getL() {
        return Math.round(L);
    }

    public double getV(int c) {
        return rd(L,c);
    }
    
    public void setL(double L) {
        this.L = L;
    }
}
